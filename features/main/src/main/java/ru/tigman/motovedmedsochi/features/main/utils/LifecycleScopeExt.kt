package ru.tigman.motovedmedsochi.features.main.utils

import androidx.lifecycle.LifecycleCoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect

fun <T> Flow<T>.launchWhenResumed(scope: LifecycleCoroutineScope): Job =
	scope.launchWhenResumed {
		collect()
	}
