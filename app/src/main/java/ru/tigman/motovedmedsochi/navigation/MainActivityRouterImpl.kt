package ru.tigman.motovedmedsochi.navigation

import ru.tigman.motovedmedsochi.features.home.mainhome.HomeDestination
import ru.tigman.motovedmedsochi.features.main.MainDestination
import ru.tigman.motovedmedsochi.libraries.navigation.GlobalRouter
import ru.tigman.motovedmedsochi.presentation.MainActivityRouter

class MainActivityRouterImpl(
	private val router: GlobalRouter,
) : MainActivityRouter {

	override fun newRootScreen() {
		router.newRoot(MainDestination)
	}
}