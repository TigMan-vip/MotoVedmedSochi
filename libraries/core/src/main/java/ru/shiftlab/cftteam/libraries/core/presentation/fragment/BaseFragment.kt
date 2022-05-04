package ru.shiftlab.cftteam.libraries.core.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import org.koin.androidx.viewmodel.ext.android.getSharedViewModel
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.koin.core.parameter.ParametersDefinition
import org.koin.core.qualifier.Qualifier
import ru.shiftlab.cftteam.libraries.core.utils.keyboard.closeKeyboard

/**
 * Абстракция для фрагментов
 *
 * [layoutId] - Ресурс фрагмента
 **/
@Deprecated("Migrate to ru.shiftlab.cftteam.libraries.core.presentation.base.BindingFragment")
abstract class BaseFragment<DB : ViewDataBinding>(private val layoutId: Int) : Fragment() {

	private var _binding: DB? = null
	protected val binding: DB
		get() = _binding ?: throw NullPointerException("Binding can't be null")

	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?,
	): View? {
		_binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
		binding.lifecycleOwner = this
		return binding.root
	}

	override fun onDestroyView() {
		closeKeyboard(binding)
		_binding = null
		super.onDestroyView()
	}

	// ----------- УХ ПОДОБИЕ ДЕКЛОРАТИВЩИНЫ С: -------------
	/**
	 * DSL функция вызова [SetupViewBuilder]
	 *
	 * [onCreateView] - функция родителя
	 *
	 * [function] - тело DSL в котором иницилизируются компоненты
	 *
	 * @return Возвращает готовую вьюху
	 **/
	protected fun setupView(
		onCreateView: View?,
		function: SetupViewBuilder.() -> Unit
	): View? = onCreateView
		.apply { SetupViewBuilder(requireActivity(), binding).apply(function) }

	/**
	 * Класс билдер для DSL конструкции инициализации вью и ее компонентов.
	 **/
	protected class SetupViewBuilder(private val activity: FragmentActivity, private val binding: ViewDataBinding) {

		/**
		 * DSL функция для создания вью модели
		 *
		 * [qualifier] - спецификатор для коина
		 *
		 * [parameters] - параметры вью модели для коина
		 *
		 * [setup] - конфигурация вью модели
		 *
		 * @return Возвращает готовую вью модель
		 **/
		inline fun <reified VM : ViewModel> Fragment.viewModel(
			qualifier: Qualifier? = null,
			noinline parameters: ParametersDefinition? = null,
			noinline setup: VM.(VM) -> Unit = {}
		) = this.getViewModel(qualifier, VM::class, parameters).apply { setup(this) }

		/**
		 * DSL функция для создания общей вью модели
		 *
		 * [qualifier] - спецификатор для коина
		 *
		 * [parameters] - параметры вью модели для коина
		 *
		 * [setup] - конфигурация вью модели
		 *
		 * @return Возвращает готовую вью модель
		 **/
		inline fun <reified VM : ViewModel> Fragment.sharedViewModel(
			qualifier: Qualifier? = null,
			noinline parameters: ParametersDefinition? = null,
			noinline setup: VM.(VM) -> Unit = {}
		) = this.getSharedViewModel(qualifier, VM::class, parameters).apply { setup(this) }

		/**
		 * DSL Функция для инициализации дополнительных функций при инициализации вью
		 *
		 * [function] - функция которую нужно выполнить
		 **/
		fun otherSetups(function: () -> Unit) = function()

		/**
		 * DSL Функция для инициализации ui сомпонентов интерфейса
		 *
		 * [builder] - сам билдер
		 **/
	}
}