object Dependencies {

	object Versions {

		const val KOTLIN =
			"1.6.10"//https://mvnrepository.com/artifact/org.jetbrains.kotlin/kotlin-gradle-plugin
		const val GRADLE =
			"7.0.4"//https://mvnrepository.com/artifact/com.android.tools.build/gradle?repo=google
		const val COMPOSE =
			"1.0.5"//https://mvnrepository.com/artifact/androidx.compose.ui/ui
		const val LIFECYCLE =
			"2.4.0"//https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-extensions
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
		const val KOIN = "3.0.1"//https://mvnrepository.com/artifact/org.koin/koin-core?repo=jcenter
		const val WORKER =
			"2.7.1"//https://mvnrepository.com/artifact/androidx.work/work-runtime-ktx
	}

	const val GRADLE = "com.android.tools.build:gradle:${Versions.GRADLE}"
	const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
	const val CORE = "androidx.core:core-ktx:${Versions.CORE}"
	const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.APP_COMPAT}"
	const val ACTIVITY_COMPOSE = "androidx.activity:activity-compose:${Versions.ACTIVITY_COMPOSE}"
	const val WORKER = "androidx.work:work-runtime-ktx:${Versions.WORKER}"

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
}