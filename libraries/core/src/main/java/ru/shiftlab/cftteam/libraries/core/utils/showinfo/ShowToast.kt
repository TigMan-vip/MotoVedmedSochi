package ru.shiftlab.cftteam.libraries.core.utils.showinfo

import android.widget.Toast
import androidx.fragment.app.Fragment

fun Fragment.toast(text: Int) {
	Toast.makeText(requireActivity(), requireActivity().resources.getString(text), Toast.LENGTH_SHORT)
		.show()
}

fun Fragment.toast(text: String) {
	Toast.makeText(requireActivity(), text, Toast.LENGTH_SHORT)
		.show()
}