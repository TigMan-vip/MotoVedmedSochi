package ru.tigman.motovedmedsochi.core.utils.dispatcher

import kotlinx.coroutines.*
import ru.shiftlab.cftteam.libraries.core.presentation.events.EventsDispatcher

class ApplicationScope : CoroutineScope by CoroutineScope(SupervisorJob() + Dispatchers.Main) {

	interface EventListener {

		fun showToast(toastMessageId: Int)
		fun errorLog(throwable: Throwable)
	}

	val eventsDispatcher = EventsDispatcher<EventListener>()

	private val jobs = mutableMapOf<String, Job>()

	fun launch(
		tag: String,
		work: suspend ApplicationScope.() -> Unit
	) {
		jobs.getOrElse(tag) { null }?.let {
			it.cancelChildren()
			it.cancel()
		}
		jobs[tag] = launch { work() }
	}

	fun showToast(message: Int) {
		eventsDispatcher.dispatchEvent { showToast(message) }
	}

	fun errorLog(throwable: Throwable) {
		eventsDispatcher.dispatchEvent { errorLog(throwable) }
	}
}