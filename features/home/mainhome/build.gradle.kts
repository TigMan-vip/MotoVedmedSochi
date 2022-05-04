plugins {
	id(Plugins.KOTLIN_ANDROID)
	id(Plugins.ANDROID_LIBRARY)
}

dependencies {

	implementation(Dependencies.Koin.ANDROID)
	implementation(Dependencies.FRAGMENT)
	implementation(Dependencies.CICERONE)
	implementation(Dependencies.MATERIAL)
	implementation(Dependencies.Coroutine.COROUTINE_ANDROID)
	implementation(Dependencies.Coroutine.COROUTINE_CORE)

	implementation(project(Modules.Libraries.NAVIGATION))
	implementation(project(Modules.Libraries.CORE))
	implementation(project(Modules.Libraries.THEME))
}

android.buildFeatures.dataBinding = true