package ru.tigman.motovedmedsochi.navigation

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import ru.shiftlab.cftteam.features.home.mainhome.HomeDestination
import ru.tigman.motovedmedsochi.features.main.presentation.MainFragmentRouter
import ru.tigman.motovedmedsochi.features.main.presentation.MainScreen
import ru.tigman.motovedmedsochi.libraries.navigation.MainRouter

class MainFragmentRouterImpl(
	private val router: MainRouter,
) : MainFragmentRouter {

	override val currentScreen: Flow<MainScreen> =
		router.currentScreen.map {
			when (it) {
				HomeDestination -> MainScreen.HOME
				//HomeEventsDestination     -> MainScreen.EVENTS
				//HomeVacanciesDestination  -> MainScreen.VACANCIES
				//UserScreenDestination     -> MainScreen.PROFILE
				else            -> throw IllegalAccessException("MainFragmentRouterImpl doesnt work with ${it::class.simpleName}")
			}
		}

	override fun navigateToHome() {
		router.open(HomeDestination)
	}

//	override fun navigateToEvents() {
//		router.open(HomeEventsDestination)
//	}
//
//	override fun navigateToVacancies() {
//		router.open(HomeVacanciesDestination)
//	}
//
//	override fun navigateToProfile() {
//		router.open(UserScreenDestination)
//	}
//
//	override fun navigateToLoginSelection() {
//		router.open(LoginSelectionDestination)
//	}

	override fun goBack() {
		router.exit()
	}
}