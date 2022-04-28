plugins {
	`kotlin-dsl`
}

repositories {
	mavenCentral()
	google()
}

dependencies {
	implementation("com.android.tools.build:gradle:7.3.0-alpha08")
	implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
	implementation(gradleApi())
	implementation(localGroovy())
}