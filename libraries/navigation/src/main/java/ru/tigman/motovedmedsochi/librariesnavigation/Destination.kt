package ru.tigman.motovedmedsochi.libraries.navigation

import androidx.fragment.app.Fragment

interface Destination {

	fun createInstance(): Fragment
}