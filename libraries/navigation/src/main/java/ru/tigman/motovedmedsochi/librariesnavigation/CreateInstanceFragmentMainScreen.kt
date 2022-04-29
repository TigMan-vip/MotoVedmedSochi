package ru.tigman.motovedmedsochi.libraries.navigation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.androidx.FragmentScreen

class CreateInstanceFragmentMainScreen(
	private val destination: Destination,
) : FragmentScreen {

	override val screenKey: String = destination::class.java.name

	override fun createFragment(factory: FragmentFactory): Fragment =
		destination.createInstance()
}