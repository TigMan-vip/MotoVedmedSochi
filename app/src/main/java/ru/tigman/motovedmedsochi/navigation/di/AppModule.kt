package ru.tigman.motovedmedsochi.navigation.di

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Router
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import ru.tigman.motovedmedsochi.features.main.presentation.MainRouterName.MAIN
import ru.tigman.motovedmedsochi.libraries.navigation.GlobalRouter
import ru.tigman.motovedmedsochi.libraries.navigation.MainRouter
import ru.tigman.motovedmedsochi.navigation.GlobalRouterImpl
import ru.tigman.motovedmedsochi.navigation.GlobalRouterName.GLOBAL
import ru.tigman.motovedmedsochi.navigation.MainRouterImpl
import ru.tigman.motovedmedsochi.presentation.MainViewModel
import ru.tigman.motovedmedsochi.presentation.buildCicerone

val AppModule = module {
	single(named(GLOBAL)) { buildCicerone() }
	single(named(GLOBAL)) { get<Cicerone<Router>>(named(GLOBAL)).router }
	single(named(GLOBAL)) { get<Cicerone<Router>>(named(GLOBAL)).getNavigatorHolder() }
	single<GlobalRouter> { GlobalRouterImpl(get(named(GLOBAL))) }

	single(named(MAIN)) { buildCicerone() }
	single(named(MAIN)) { get<Cicerone<Router>>(named(MAIN)).router }
	single(named(MAIN)) { get<Cicerone<Router>>(named(MAIN)).getNavigatorHolder() }
	single<MainRouter> { MainRouterImpl(get(named(MAIN))) }

	viewModel { MainViewModel(get()) }
}