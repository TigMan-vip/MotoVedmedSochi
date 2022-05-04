package ru.tigman.motovedmedsochi

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import ru.tigman.motovedmedsochi.features.home.mainhome.di.HomeModules
import ru.tigman.motovedmedsochi.features.main.di.MainFragmentModule
import ru.tigman.motovedmedsochi.navigation.di.AppModule
import ru.tigman.motovedmedsochi.navigation.di.ApplicationScopeModule
import ru.tigman.motovedmedsochi.navigation.di.RouterModule

class App : Application() {

	override fun onCreate() {
		super.onCreate()
		startKoin {
			androidLogger(Level.ERROR) // https://github.com/InsertKoinIO/koin/issues/871
			androidContext(this@App)
			androidFileProperties()


			modules(AppModule)
			modules(RouterModule)
			modules(ApplicationScopeModule)

			modules(MainFragmentModule)
			modules(HomeModules)

		}
	}
}