plugins {
	id(Plugins.KOTLIN_ANDROID)
	id(Plugins.ANDROID_APPLICATION)
}

dependencies {
	implementation(Dependencies.Kotlin.KOTLIN_STANDARD_LIBRARY)

	implementation(Dependencies.CORE)
	implementation(Dependencies.APP_COMPAT)
	implementation(Dependencies.MATERIAL)
	implementation(Dependencies.ACTIVITY_COMPOSE)
	implementation(Dependencies.Lifecycle.LIFECYCLE_VIEWMODEL)

	implementation(Dependencies.Compose.UI)
	implementation(Dependencies.Compose.UI_TOOLING)
	implementation(Dependencies.Compose.MATERIAL)

	implementation(Dependencies.Koin.KOIN_COMPOSE)
	implementation(Dependencies.Koin.ANDROID)

	implementation(Dependencies.CICERONE)

	implementation(project(Modules.Features.MAIN))
	implementation(project(Modules.Features.Home.MAINHOME))

	implementation(project(Modules.Libraries.NAVIGATION))
	implementation(project(Modules.Libraries.CORE))
}

android.packagingOptions {
	exclude ("META-INF/DEPENDENCIES")
	exclude ("META-INF/NOTICE")
	exclude ("META-INF/NOTICE.md")
	exclude ("META-INF/LICENSE")
	exclude ("META-INF/LICENSE.md")
	exclude ("META-INF/NOTICE.txt")
}

android.buildFeatures.dataBinding = true