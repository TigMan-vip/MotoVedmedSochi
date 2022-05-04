package ru.shiftlab.cftteam.navigation.di

import org.koin.dsl.module
import ru.tigman.motovedmedsochi.features.home.mainhome.presentation.HomeRouter
import ru.tigman.motovedmedsochi.features.main.presentation.MainFragmentRouter
import ru.tigman.motovedmedsochi.navigation.MainActivityRouterImpl
import ru.tigman.motovedmedsochi.navigation.MainFragmentRouterImpl
import ru.tigman.motovedmedsochi.presentation.MainActivityRouter

val RouterModule = module {
	factory<MainFragmentRouter> { MainFragmentRouterImpl(get()) }

	factory<MainActivityRouter> { MainActivityRouterImpl(get()) }
}