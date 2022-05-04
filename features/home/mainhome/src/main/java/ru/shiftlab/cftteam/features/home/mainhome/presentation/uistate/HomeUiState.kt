package ru.shiftlab.cftteam.features.home.mainhome.presentation.uistate

sealed class HomeUiState {
	object Success : HomeUiState()
	object Loading : HomeUiState()
	data class Error(val errorCode: Int) : HomeUiState()
}