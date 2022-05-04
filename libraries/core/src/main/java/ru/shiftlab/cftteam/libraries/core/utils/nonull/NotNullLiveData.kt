package ru.shiftlab.cftteam.libraries.core.utils.nonull

import androidx.lifecycle.MutableLiveData

@Deprecated("Переходим на чистые корутины или flow")
open class NotNullLiveData<T : Any>(private val default: T) : MutableLiveData<T>() {

	override fun getValue(): T = super.getValue() ?: default
}