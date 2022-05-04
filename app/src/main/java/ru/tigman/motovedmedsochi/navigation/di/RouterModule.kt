package ru.shiftlab.cftteam.navigation.di

import org.koin.dsl.module
import ru.tigman.motovedmedsochi.features.main.presentation.MainFragmentRouter
import ru.tigman.motovedmedsochi.navigation.MainFragmentRouterImpl

val RouterModule = module {
	factory<MainFragmentRouter> { MainFragmentRouterImpl(get()) }

}