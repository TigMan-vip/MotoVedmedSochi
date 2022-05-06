package ru.tigman.motovedmedsochi.features.home.mainhome.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.tigman.motovedmedsochi.features.home.mainhome.R
import ru.tigman.motovedmedsochi.features.home.mainhome.databinding.FragmentHomeBinding
import ru.tigman.motovedmedsochi.features.home.mainhome.presentation.HomeViewModel
import ru.tigman.motovedmedsochi.libraries.core.presentation.fragment.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {

	private lateinit var viewModel: HomeViewModel

	private companion object {

		const val HOT_F = "0"
		const val NEAR_F = "1"
		const val USER_EVENTS_F = "2"
		const val USER_ESCORTS_F = "3"
		const val USER_ABOUT_COMPANY = "4"
		const val USER_EMPLOYMENT = "5"
	}

	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? = setupView(super.onCreateView(inflater, container, savedInstanceState)) {

	}

}