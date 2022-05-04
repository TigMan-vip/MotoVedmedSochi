package ru.shiftlab.cftteam.features.home.mainhome.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import ru.shiftlab.cftteam.features.home.mainhome.presentation.HomeViewModel

internal val viewModelModule = module {
	viewModel {
		HomeViewModel(
			router = get()
		)
	}
}

val HomeModules = listOf(
	viewModelModule
)