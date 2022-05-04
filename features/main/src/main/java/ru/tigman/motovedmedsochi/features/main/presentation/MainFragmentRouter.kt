package ru.tigman.motovedmedsochi.features.main.presentation

import kotlinx.coroutines.flow.Flow

interface MainFragmentRouter {

	val currentScreen: Flow<MainScreen>

	fun navigateToHome()

//	fun navigateToEvents()
//
//	fun navigateToVacancies()
//
//	fun navigateToProfile()
//
//	fun navigateToLoginSelection()

	fun goBack()
}