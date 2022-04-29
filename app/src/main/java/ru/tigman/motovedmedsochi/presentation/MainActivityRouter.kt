package ru.tigman.motovedmedsochi.presentation

interface MainActivityRouter {

	fun newRootScreen()

	fun navigateByDeeplink(deeplink: String)
}