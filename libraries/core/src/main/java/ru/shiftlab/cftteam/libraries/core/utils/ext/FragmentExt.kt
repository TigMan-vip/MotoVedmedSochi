package ru.shiftlab.cftteam.libraries.core.utils.ext

import android.content.Intent
import androidx.activity.addCallback
import androidx.annotation.AttrRes
import androidx.annotation.ColorInt
import androidx.fragment.app.Fragment
import ru.shiftlab.cftteam.libraries.core.presentation.colors.getColorFromAttr

fun Fragment.setOnBackPressedListener(listener: () -> Unit) {
	requireActivity()
		.onBackPressedDispatcher
		.addCallback(viewLifecycleOwner) {
			listener()
		}
}

fun Fragment.getStringOrNull(res: Int?) = res?.let { resources.getString(it) }

@ColorInt
fun Fragment.getColorFromAttr(@AttrRes attributeColor: Int): Int = requireContext().getColorFromAttr(attributeColor)

fun Fragment.openFileManager(requestCode: Int, vararg mimeTypes: String) {
	val intent = Intent(Intent.ACTION_GET_CONTENT)
	intent.type = "file/*"
	intent.putExtra(Intent.EXTRA_MIME_TYPES, mimeTypes)
	startActivityForResult(intent, requestCode)
}