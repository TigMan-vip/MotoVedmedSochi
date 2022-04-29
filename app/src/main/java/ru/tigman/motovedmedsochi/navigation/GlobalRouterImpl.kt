package ru.tigman.motovedmedsochi.navigation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.Router
import com.github.terrakok.cicerone.Screen
import com.github.terrakok.cicerone.androidx.FragmentScreen
import ru.tigman.motovedmedsochi.libraries.navigation.Destination
import ru.tigman.motovedmedsochi.libraries.navigation.GlobalRouter

class GlobalRouterImpl(
	private val router: Router
) : GlobalRouter {

	override fun open(destination: Destination) {
		router.navigateTo(
			CreateInstanceFragmentScreen(destination)
		)
	}

	override fun replace(destination: Destination) {
		router.replaceScreen(
			CreateInstanceFragmentScreen(destination)
		)
	}

	override fun newRoot(destination: Destination) {
		router.newRootScreen(
			CreateInstanceFragmentScreen(destination)
		)
	}

	override fun popToRoot() {
		router.backTo(null)
	}

	override fun exit() {
		router.exit()
	}

	override fun finish() {
		router.finishChain()
	}

	override fun popTo(destinationClass: Class<out Destination>) {
		router.backTo(
			BackToFragmentScreen(destinationClass.name)
		)
	}
}

private class CreateInstanceFragmentScreen(
	private val destination: Destination,
) : FragmentScreen {

	override val screenKey: String = destination::class.java.name

	override fun createFragment(factory: FragmentFactory): Fragment =
		destination.createInstance()
}

private class BackToFragmentScreen(override val screenKey: String) : Screen