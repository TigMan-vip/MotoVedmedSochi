package ru.shiftlab.cftteam.libraries.core.utils.appversion

import org.koin.core.qualifier.named
import org.koin.dsl.module

const val APK_VERSION = "APK_VERSION"

private fun getVersion(version: String) = version

val appVersionModule = module {
	single(named("appVersion")) {
		getVersion(version = getProperty(APK_VERSION))
	}
}