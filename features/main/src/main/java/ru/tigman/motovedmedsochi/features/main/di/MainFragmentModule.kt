package ru.tigman.motovedmedsochi.features.main.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import ru.tigman.motovedmedsochi.features.main.presentation.MainViewModel

val MainFragmentModule = module {
	viewModel {
		MainViewModel(get())
	}
}