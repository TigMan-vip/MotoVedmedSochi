package ru.shiftlab.cftteam.libraries.core.utils.permission

import android.content.pm.PackageManager
import androidx.fragment.app.Fragment
import ru.shiftlab.cftteam.libraries.core.utils.showinfo.toast

/**
 * сет для работы с пермишками
 *
 * [permissions] пермишки которые хотим запулучить
 *
 * [requestCode] код для проверки ответа
 *
 * [onSuccess] лябмда если пермишки получены
 *
 * [onError] лябмда если не пермишки получены
 **/
data class PermissionsTask(
	val permissions: List<String>,
	val requestCode: Int,
	var onSuccess: () -> Unit = {},
	var onError: () -> Unit = {}
)

/**
 * расширение фрагмента запроса пермишек
 * [task] - сет для работы с пермишками [PermissionsTask]
 **/
fun Fragment.checkPermissions(task: PermissionsTask) {
	val denPerm = task.permissions.find { requireContext().checkCallingOrSelfPermission(it) != PackageManager.PERMISSION_GRANTED }
	if (denPerm != null) {
		requestPermissions(task.permissions.toTypedArray(), task.requestCode)
	} else {
		task.onSuccess.invoke()
	}
}

/**
 * расширение для проверки ответа при получении пермишек (что-то какая-то странная функция... Надо тестить)
 **/
fun Fragment.onRequestsHandler(requestCode: Int, grantResults: IntArray, tasks: List<PermissionsTask>) {
	val task = tasks.find { it.requestCode == requestCode }
	task?.let {
		if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
			it.onSuccess()
		} else {
			it.onError()
		}
	} ?: toast("UNKNOWN PERMISSION")
}