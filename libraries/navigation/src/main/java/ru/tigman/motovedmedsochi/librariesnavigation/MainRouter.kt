package ru.tigman.motovedmedsochi.libraries.navigation

import kotlinx.coroutines.flow.StateFlow

interface MainRouter {

	val currentScreen: StateFlow<Destination>

	fun open(destination: Destination)

	fun exit()
}