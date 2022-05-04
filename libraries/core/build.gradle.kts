android {
	dataBinding.isEnabled = true
}
plugins {
	id(Plugins.ANDROID_LIBRARY)
	id(Plugins.KOTLIN_ANDROID)
}

dependencies {
	implementation(Dependencies.FRAGMENT)
	implementation(Dependencies.Koin.ANDROID)
	implementation(Dependencies.Squareup.GLIDE)
	implementation(Dependencies.DATABINDING)
}