object Dependencies {

	object Versions {

		const val KOTLIN =
			"1.5.31"//https://mvnrepository.com/artifact/org.jetbrains.kotlin/kotlin-gradle-plugin
		const val GRADLE =
			"7.0.4"//https://mvnrepository.com/artifact/com.android.tools.build/gradle?repo=google
		const val COMPOSE =
			"1.0.5"//https://mvnrepository.com/artifact/androidx.compose.ui/ui
		const val LIFECYCLE =
			"2.3.1"//https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-extensions
		const val MATERIAL =
			"1.5.0"//https://mvnrepository.com/artifact/com.google.android.material/material
		const val CORE = "1.7.0"//https://mvnrepository.com/artifact/androidx.core/core-ktx
		const val APP_COMPAT =
			"1.4.1"//https://mvnrepository.com/artifact/androidx.appcompat/appcompat
		const val ACTIVITY_COMPOSE =
			"1.4.0"//https://mvnrepository.com/artifact/androidx.activity/activity-compose
		const val ROOM = "2.4.1"//https://mvnrepository.com/artifact/androidx.room/room-runtime
		const val COROUTINE =
			"1.6.0"//https://mvnrepository.com/artifact/org.jetbrains.kotlinx/kotlinx-coroutines-core
		const val KOIN = "3.1.2"//https://mvnrepository.com/artifact/org.koin/koin-core?repo=jcenter
		const val KOIN_ANDRIDX = "2.0.0-GA"
		const val WORKER =
			"2.7.1"//https://mvnrepository.com/artifact/androidx.work/work-runtime-ktx
		const val CALENDAR = "1.2.0"
		const val FRAGMENT = "1.3.3"
		const val CICERONE = "7.1"
		const val DATABINDING = "7.1.2"
		const val VIEWBINDING = "7.0.0-alpha02"
		const val GLIDE = "4.12.0"
		const val LIFECYCLE_EXT = "2.2.0"
	}

	const val GRADLE = "com.android.tools.build:gradle:${Versions.GRADLE}"
	const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
	const val CORE = "androidx.core:core-ktx:${Versions.CORE}"
	const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.APP_COMPAT}"
	const val ACTIVITY_COMPOSE = "androidx.activity:activity-compose:${Versions.ACTIVITY_COMPOSE}"
	const val WORKER = "androidx.work:work-runtime-ktx:${Versions.WORKER}"
	const val DATA_PICKER = "com.savvi.datepicker:rangepicker:${Versions.CALENDAR}"
	const val FRAGMENT = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT}"
	const val CICERONE = "com.github.terrakok:cicerone:${Versions.CICERONE}"
	const val DATABINDING = "com.android.databinding:compiler:${Versions.DATABINDING}"
	const val VIEWBINDING = " androidx.databinding:viewbinding:${Versions.VIEWBINDING}"

	object Kotlin {

		const val KOTLIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}"
		const val KOTLIN_REFLECT = "org.jetbrains.kotlin:kotlin-reflect:${Versions.KOTLIN}"
		const val KOTLIN_STANDARD_LIBRARY =
			"org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.KOTLIN}"
	}

	object Lifecycle {

		const val LIFECYCLE_RUNTIME =
			"androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE}"
		const val LIFECYCLE_VIEWMODEL =
			"androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE}"
		const val LIFECYCLE_EXT = "androidx.lifecycle:lifecycle-extensions:2.2.0"
	}

	object Room {

		const val ROOM_RUNTIME = "androidx.room:room-runtime:${Versions.ROOM}"
		const val ROOM_COMPILER = "androidx.room:room-compiler:${Versions.ROOM}"
		const val ROOM_KTX = "androidx.room:room-ktx:${Versions.ROOM}"
	}

	object Coroutine {

		const val COROUTINE_CORE =
			"org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINE}"
		const val COROUTINE_ANDROID =
			"org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINE}"
	}

	object Koin {

		const val KOIN_COMPOSE = "io.insert-koin:koin-androidx-compose:${Versions.KOIN}"
		const val KOIN_JVM = "io.insert-koin:koin-core-ext:${Versions.KOIN}"
		const val ANDROID = "io.insert-koin:koin-android:${Versions.KOIN}"
		const val CORE = "io.insert-koin:koin-core:${Versions.KOIN}"
		const val ANDROIDX = "org.koin:koin-androidx-viewmodel:${Versions.KOIN_ANDRIDX}"
	}

	object Compose {

		const val UI = "androidx.compose.ui:ui:${Versions.COMPOSE}"
		const val UI_TOOLING = "androidx.compose.ui:ui-tooling:${Versions.COMPOSE}"
		const val FOUNDATION = "androidx.compose.foundation:foundation:${Versions.COMPOSE}"
		const val MATERIAL = "androidx.compose.material:material:${Versions.COMPOSE}"
		const val MATERIAL_CORE =
			"androidx.compose.material:material-icons-core:${Versions.COMPOSE}"
		const val MATERIAL_ICONS =
			"androidx.compose.material:material-icons-extended:${Versions.COMPOSE}"
		const val RUNTIME = "androidx.compose.runtime:runtime:${Versions.COMPOSE}"
	}

	object Squareup {
		const val GLIDE = "com.github.bumptech.glide:glide:${Versions.GLIDE}"
		const val GLIDE_COMPILER = "com.github.bumptech.glide:compiler:${Versions.GLIDE}"
	}


}