package ru.shiftlab.cftteam.libraries.core.presentation.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import ru.shiftlab.cftteam.libraries.core.utils.keyboard.closeKeyboard

abstract class BindingFragment<VB : ViewBinding> : Fragment() {

	private var _binding: VB? = null
	val binding
		get() = _binding ?: throw NullPointerException("Binding can't be null")



	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		_binding = binding(inflater, container, savedInstanceState)
		otherSetups()
		return _binding?.root
	}

	protected open fun otherSetups() {}



	protected abstract fun binding(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): VB

	override fun onDestroyView() {
		closeKeyboard(binding)
		_binding = null
		super.onDestroyView()
	}
}