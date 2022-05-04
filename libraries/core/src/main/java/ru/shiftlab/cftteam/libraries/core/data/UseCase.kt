package ru.shiftlab.cftteam.libraries.core.data

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.*
import org.koin.core.component.KoinComponent
import org.koin.core.parameter.parametersOf
import org.koin.java.KoinJavaComponent

/**
 * метод расширение вьюмодели для инжекта юзкейса
 *
 * [VM] - вьюмодель
 *
 * [UC] - юзкейс
 *
 * @return врзвращает класс юзкейса
 **/
@Deprecated("Используйте инжект в конструктор")
inline fun <VM, reified UC : UseCase<*, *, *>> VM.useCase(): Lazy<UC> where VM : ViewModel =
	KoinJavaComponent.inject(UC::class.java) { parametersOf(viewModelScope) }

@Deprecated("Используйте инжект в конструктор")
inline fun <T, reified UC : UseCase<*, *, *>> T.useCase(scope: CoroutineScope): Lazy<UC> where T : Any =
	KoinJavaComponent.inject(UC::class.java) { parametersOf(scope) }
/**
 * абстракция для юзкейсов
 *
 * [T] - возвращаемый тип запроса
 *
 * [P] - параметры запроса
 *
 * [E] - тип возвращаемой ошибки, для каждого типа запроса
 * свой наследник класса [BaseException] ([HalikssException], [NetworkException]),
 * для общих запросов пока что просто [BaseException], а там дальше уже сами проверяем, is что?
 *
 * [scope] - скоуп для запуска корутин
 **/
@Deprecated("Переходим на чистые корутины или flow")
abstract class UseCase<T : Any, P, E : BaseException>(private val scope: CoroutineScope) : KoinComponent {

	private var onSuccess: (T) -> Unit = {}
	private var before: () -> Unit = {}
	private var onError: ((E) -> Unit) = {}
	private var params: P? = null
	private var status: BaseResponse<T, E>? = null
	private var statusBool: Boolean = true

	/**
	 * функция "Билдер" для добавления лямбды,
	 * которая будет выполненна перед запуском
	 *
	 * @param before - лямбда
	 *
	 * @return [UseCase]
	 **/
	fun addBefore(before: () -> Unit) = this.apply {
		this.before = before
	}

	/**
	 * функция "Билдер" для добавления лямбды,
	 * которая будет выполненна если юзкейс завершится удачно
	 * и возвратит полученные данные
	 * @see T
	 *
	 * @param onSuccess - лямбда
	 *
	 * @return [UseCase]
	 **/
	fun addOnSuccess(onSuccess: (T) -> Unit) = this.apply {
		this.onSuccess = onSuccess
	}

	/**
	 * функция "Билдер" для добавления лямбды,
	 * которая будет выполненна если юзкейс завершится не удачно
	 * и возвратит ошибку выполнения
	 * @see E
	 *
	 * @param onError - лямбда
	 *
	 * @return [UseCase]
	 **/
	fun addOnError(onError: (E) -> Unit) = this.apply {
		this.onError = onError
	}

	/**
	 * функция "Билдер" для добавления параметров юзкейса
	 *
	 * @param params - параметры
	 * @see P
	 *
	 * @return [UseCase]
	 **/
	fun addParams(params: P?) = this.apply {
		this.params = params
	}

	/**
	 * функция вызова юзкейса
	 *
	 * [T] - возвращаемый тип запроса
	 *
	 * [P] - параметры запроса
	 *
	 * [E] - тип возвращаемой ошибки
	 *
	 * [BaseResponse] - базовый респонс. Для каждого типа запроса
	 * свой typealias ([NetworkResponse], [HalikssResponse])
	 **/
	protected abstract suspend fun invoke(params: P? = null): BaseResponse<T, E>

	/**
	 * функция для запуска юзкейса
	 *
	 * @return [Boolean] - состояние выполнения
	 **/
	fun start(): Boolean {
		var state = true
		scope.launch(Dispatchers.IO) {
			withContext(Dispatchers.Main) {
				before()
			}
			invoke(params).run {
				status = this
				withContext(Dispatchers.Main) {
					handleResponse(
						onSuccess = {
							onSuccess(it)
						},
						onError = {
							onError(it)
							state = false
						}
					)
				}
			}
		}
		return state
	}

	/**
	 * функция для отложенного запуска юзкейса
	 *
	 * @return [Boolean] - состояние выполнения
	 **/
	suspend fun startSuspend(): Boolean {
		var state = true
		before().run {
			invoke(params).run {
				status = this
				handleResponse(
					onSuccess = {
						onSuccess(it)
					},
					onError = {
						onError(it)
						state = false
					}
				)
			}
		}
		return state
	}

	/**
	 * функция для преждевнеменной остановки запроса
	 **/
	fun cancel() = scope.cancel()
}

