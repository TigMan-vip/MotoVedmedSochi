package ru.shiftlab.cftteam.libraries.core.presentation.events

interface EventsDispatcherOwner<T> {
	val eventsDispatcher: EventsDispatcher<T>
}