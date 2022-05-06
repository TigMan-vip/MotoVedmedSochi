package ru.tigman.motovedmedsochi.features.home.mainhome.presentation

sealed class HomeState {
	object Success : HomeState()
	object Loading : HomeState()
	data class Error(val errorCode: Int) : HomeState()
}