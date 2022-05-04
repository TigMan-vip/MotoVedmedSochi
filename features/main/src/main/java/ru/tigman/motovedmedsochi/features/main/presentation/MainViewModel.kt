package ru.tigman.motovedmedsochi.features.main.presentation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.Flow

class MainViewModel(
	private val router: MainFragmentRouter,
	//private val tokenExistsUseCase: TokenExistsUseCase,
) : ViewModel() {

	val currentScreen: Flow<MainScreen> = router.currentScreen

	init {
		router.navigateToHome()
	}

	fun navigateToHome() {
		router.navigateToHome()
	}

//	fun navigateToEvents() {
//		router.navigateToEvents()
//	}
//
//	fun navigateToVacancies() {
//		router.navigateToVacancies()
//	}
//
//	fun navigateToProfile() {
//		router.navigateToProfile()
	//}

	fun navigateBack() {
		router.goBack()
	}
}