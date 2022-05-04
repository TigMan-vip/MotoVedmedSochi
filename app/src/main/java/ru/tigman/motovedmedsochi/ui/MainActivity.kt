package ru.tigman.motovedmedsochi.ui

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.github.terrakok.cicerone.NavigatorHolder
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import ru.tigman.motovedmedsochi.R
import ru.tigman.motovedmedsochi.core.utils.dispatcher.ApplicationScope
import ru.tigman.motovedmedsochi.libraries.navigation.CftTeamAppNavigator
import ru.tigman.motovedmedsochi.navigation.GlobalRouterName.GLOBAL
import ru.tigman.motovedmedsochi.presentation.MainViewModel

class MainActivity : AppCompatActivity(), ApplicationScope.EventListener {

	private val applicationScope: ApplicationScope by inject()

	private val navigatorHolder: NavigatorHolder by inject(named(GLOBAL))
	private val navigator = CftTeamAppNavigator(this, R.id.host_global)

	private val viewModel: MainViewModel by viewModel()

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		applicationScope.eventsDispatcher.bind(this, this)
	}

	override fun onResume() {
		super.onResume()
		navigatorHolder.setNavigator(navigator)
		viewModel.openMainRoot()
	}

	override fun onPause() {
		super.onPause()
		navigatorHolder.removeNavigator()
	}

	override fun showToast(toastMessageId: Int) {
		Toast.makeText(this, toastMessageId, Toast.LENGTH_SHORT).show()
	}

	override fun errorLog(throwable: Throwable) {
		Log.e("Error", throwable.stackTraceToString())
	}
}