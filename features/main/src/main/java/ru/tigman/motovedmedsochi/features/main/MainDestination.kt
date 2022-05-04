package ru.tigman.motovedmedsochi.features.main

import androidx.fragment.app.Fragment
import ru.tigman.motovedmedsochi.features.main.ui.MainFragment
import ru.tigman.motovedmedsochi.libraries.navigation.Destination

object MainDestination : Destination {

	override fun createInstance(): Fragment =
		MainFragment()
}