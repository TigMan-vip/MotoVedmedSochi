plugins {
	id(Plugins.ANDROID_APPLICATION)
	id(Plugins.KOTLIN_ANDROID)
}

dependencies {
	implementation(Dependencies.Kotlin.KOTLIN_STANDARD_LIBRARY)

	implementation(Dependencies.CORE)
	implementation(Dependencies.APP_COMPAT)
	implementation(Dependencies.MATERIAL)
	implementation(Dependencies.ACTIVITY_COMPOSE)
	implementation(Dependencies.Lifecycle.LIFECYCLE_RUNTIME)

	implementation(Dependencies.Compose.UI)
	implementation(Dependencies.Compose.UI_TOOLING)
	implementation(Dependencies.Compose.MATERIAL)

	implementation(Dependencies.Koin.KOIN_COMPOSE)
}