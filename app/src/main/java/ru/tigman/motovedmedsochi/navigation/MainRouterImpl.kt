package ru.tigman.motovedmedsochi.navigation

import com.github.terrakok.cicerone.Router
import kotlinx.coroutines.flow.MutableStateFlow
import ru.shiftlab.cftteam.features.home.mainhome.HomeDestination
import ru.tigman.motovedmedsochi.libraries.navigation.CreateInstanceFragmentMainScreen
import ru.tigman.motovedmedsochi.libraries.navigation.Destination
import ru.tigman.motovedmedsochi.libraries.navigation.MainRouter

class MainRouterImpl(
	private val router: Router,
) : MainRouter {

	override val currentScreen = MutableStateFlow<Destination>(HomeDestination)

	private val backStack = mutableListOf<Destination>()

	override fun open(destination: Destination) {
		backStack.remove(destination)
		backStack.add(destination)
		currentScreen.value = destination
		router.navigateTo(
			CreateInstanceFragmentMainScreen(destination)
		)
	}

	override fun exit() {
		backStack.removeLast()
		if (backStack.isNotEmpty()) {
			open(backStack.last())
		} else {
			router.finishChain()
		}
	}
}