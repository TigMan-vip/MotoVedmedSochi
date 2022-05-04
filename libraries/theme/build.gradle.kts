plugins {
	id(Plugins.KOTLIN_ANDROID)
	id(Plugins.ANDROID_LIBRARY)
}

dependencies {
	implementation(Dependencies.MATERIAL)
}

android.buildFeatures.dataBinding = true
