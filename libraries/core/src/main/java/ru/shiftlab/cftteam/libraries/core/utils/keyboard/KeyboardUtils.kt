package ru.shiftlab.cftteam.libraries.core.utils.keyboard

import android.content.Context
import android.util.TypedValue
import android.view.View
import android.view.ViewTreeObserver
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import androidx.fragment.app.findFragment
import androidx.viewbinding.ViewBinding

private const val KEYBOARD_SIZE = 200f

fun Fragment.isKeyboardActive(): Boolean {
	val displayMetrics = requireContext().resources.displayMetrics
	val minKeyboard = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, KEYBOARD_SIZE, displayMetrics)
	val topView = getTopView()
	val heightDifference = topView.rootView.height - topView.height
	return heightDifference > minKeyboard
}

fun Fragment.getTopView(): View =
	requireActivity().window.decorView.findViewById(android.R.id.content)

fun Fragment.addKeyBoardListener(listener: ViewTreeObserver.OnGlobalLayoutListener) {
	val topView = getTopView()
	topView.viewTreeObserver.addOnGlobalLayoutListener(listener)
}

fun Fragment.removeKeyboardDetectListener(listener: ViewTreeObserver.OnGlobalLayoutListener) {
	val topView = getTopView()
	topView.viewTreeObserver.removeOnGlobalLayoutListener(listener)
}

fun Fragment.closeKeyboard(binding: ViewBinding) {
	val inputManager = requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
	inputManager?.hideSoftInputFromWindow(binding.root.applicationWindowToken, 0)
}

fun ViewBinding.closeKeyBoard() {
	val inputManager = root.findFragment<Fragment>().requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
	inputManager?.hideSoftInputFromWindow(root.applicationWindowToken, 0)
}

fun Fragment.openKeyboard() {
	val inputManager = requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
	inputManager?.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0)
}