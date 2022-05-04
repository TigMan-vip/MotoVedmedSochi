package ru.tigman.motovedmedsochi.features.main.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.setFragmentResultListener
import androidx.lifecycle.lifecycleScope
import com.github.terrakok.cicerone.NavigatorHolder
import kotlinx.coroutines.flow.onEach
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import ru.shiftlab.cftteam.libraries.core.presentation.fragment.BaseFragment
import ru.shiftlab.cftteam.libraries.core.utils.ext.setOnBackPressedListener
import ru.tigman.motovedmedsochi.features.main.R
import ru.tigman.motovedmedsochi.features.main.databinding.FragmentMainBinding
import ru.tigman.motovedmedsochi.features.main.presentation.MainRouterName.MAIN
import ru.tigman.motovedmedsochi.features.main.presentation.MainScreen
import ru.tigman.motovedmedsochi.features.main.presentation.MainViewModel
import ru.tigman.motovedmedsochi.features.main.utils.launchWhenResumed
import ru.tigman.motovedmedsochi.libraries.navigation.CftTeamKeepStateNavigator
import ru.tigman.motovedmedsochi.libraries.navigation.MAIN_KEY
import ru.tigman.motovedmedsochi.libraries.navigation.ScreenNameHolder

class MainFragment : BaseFragment<FragmentMainBinding>(R.layout.fragment_main),
					 ScreenNameHolder {

	override val screenName: String
		get() =
			when (binding.bottomNavigation.selectedItemId) {
				R.id.home           -> getString(R.string.main_home)
				R.id.home_events    -> getString(R.string.main_home_event)
				R.id.home_vacancies -> getString(R.string.main_home_vacancies)
				R.id.profile        -> getString(R.string.main_login_selection)
				else                -> throw IllegalArgumentException("Unknown last screen")
			}

	private val navigatorHolder: NavigatorHolder by inject(named(MAIN))

	private val viewModel: MainViewModel by viewModel()

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		initCicerone()
		setFragmentResultListener(MAIN_KEY) { _, bundle ->
			childFragmentManager.setFragmentResult(bundle.getString(MAIN_KEY).orEmpty(), bundle)
		}
		setOnBackPressedListener { viewModel.navigateBack() }
	}

	private fun initCicerone() {
		val navigator = CftTeamKeepStateNavigator(
			requireActivity(),
			R.id.host_main,
			childFragmentManager,
		)
		navigatorHolder.setNavigator(navigator)

		viewModel.currentScreen.onEach {
			binding.bottomNavigation.selectedItemId = when (it) {
				MainScreen.HOME            -> R.id.home
				MainScreen.EVENTS          -> R.id.home_events
				MainScreen.VACANCIES       -> R.id.home_vacancies
				MainScreen.PROFILE         -> R.id.profile
				MainScreen.LOGIN_SELECTION -> R.id.profile
			}
		}.launchWhenResumed(lifecycleScope)

		binding.bottomNavigation.setOnItemSelectedListener {
			when (it.itemId) {
				R.id.home           -> viewModel.navigateToHome()
//				R.id.home_events    -> viewModel.navigateToEvents()
//				R.id.home_vacancies -> viewModel.navigateToVacancies()
//				R.id.profile        -> viewModel.navigateToProfile()
			}
			true
		}
	}

	override fun onDestroyView() {
		super.onDestroyView()
		navigatorHolder.removeNavigator()
	}
}