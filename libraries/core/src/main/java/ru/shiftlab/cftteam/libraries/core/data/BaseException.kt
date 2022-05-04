package ru.shiftlab.cftteam.libraries.core.data

@Deprecated("Переходим на чистые корутины или flow")
open class BaseException(
	override val message: String? = null,
	open val code: Int? = null
) : Exception(message)