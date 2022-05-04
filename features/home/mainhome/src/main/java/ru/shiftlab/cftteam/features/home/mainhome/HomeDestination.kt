package ru.tigman.motovedmedsochi.features.home.mainhome

import androidx.fragment.app.Fragment
import ru.tigman.motovedmedsochi.features.home.mainhome.ui.HomeFragment
import ru.tigman.motovedmedsochi.libraries.navigation.Destination

object HomeDestination : Destination {

	override fun createInstance(): Fragment =
		HomeFragment()
}