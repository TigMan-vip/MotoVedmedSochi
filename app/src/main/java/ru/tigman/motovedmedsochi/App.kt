package ru.tigman.motovedmedsochi

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import ru.shiftlab.cftteam.features.home.mainhome.di.HomeModules
import ru.shiftlab.cftteam.navigation.di.AppModule
import ru.shiftlab.cftteam.navigation.di.ApplicationScopeModule
import ru.shiftlab.cftteam.navigation.di.RouterModule
import ru.tigman.motovedmedsochi.features.main.di.MainFragmentModule

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