package ru.tigman.motovedmedsochi.navigation.di

import org.koin.dsl.module
import ru.tigman.motovedmedsochi.features.main.presentation.MainFragmentRouter
import ru.tigman.motovedmedsochi.navigation.MainActivityRouterImpl
import ru.tigman.motovedmedsochi.navigation.MainFragmentRouterImpl
import ru.tigman.motovedmedsochi.presentation.MainActivityRouter

val RouterModule = module {
	factory<MainFragmentRouter> { MainFragmentRouterImpl(get()) }

	factory<MainActivityRouter> { MainActivityRouterImpl(get()) }
}