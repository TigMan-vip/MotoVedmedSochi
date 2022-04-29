package ru.tigman.motovedmedsochi.libraries.navigation

interface GlobalRouter {

	fun open(destination: Destination)

	fun replace(destination: Destination)

	fun newRoot(destination: Destination)

	fun popToRoot()

	fun exit()

	fun finish()

	fun popTo(destinationClass: Class<out Destination>)
}