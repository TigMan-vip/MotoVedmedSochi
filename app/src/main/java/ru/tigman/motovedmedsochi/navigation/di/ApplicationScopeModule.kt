package ru.tigman.motovedmedsochi.navigation.di

import org.koin.dsl.module
import ru.shiftlab.cftteam.libraries.core.utils.dispatcher.ApplicationScope

val ApplicationScopeModule = module {
	single { ApplicationScope() }
}