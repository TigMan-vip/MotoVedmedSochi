package ru.tigman.motovedmedsochi.libraries.core.data

/**
 * Базовый респонс для запросов
 *
 * [T] - возвращаемый тип при удачном запросе
 *
 * [E] - ошибка при неудачном запросе
 *
 * https://proandroiddev.com/kotlins-nothing-type-946de7d464fb
 **/
@Deprecated("Переходим на чистые корутины или flow")
sealed class BaseResponse<out T : Any, out E : BaseException> {

	class Success<out T : Any>(val data: T) : BaseResponse<T, Nothing>()
	class Error<out E : BaseException>(val exception: E) : BaseResponse<Nothing, E>()
}

/**
 * Функция для выполнения проверки состояния ответа и
 * выполнение лямбды в зависимости от типа [BaseResponse]
 **/
fun <T : Any, E : BaseException> BaseResponse<T, E>.handleResponse(
	onSuccess: (T) -> Unit,
	onError: (E) -> Unit
) = when (this) {
	is BaseResponse.Success -> onSuccess(data)
	is BaseResponse.Error   -> onError(exception)
}
