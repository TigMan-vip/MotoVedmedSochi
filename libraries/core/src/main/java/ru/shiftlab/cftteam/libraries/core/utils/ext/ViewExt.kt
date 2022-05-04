package ru.shiftlab.cftteam.libraries.core.utils.ext

import android.view.View

fun View.getStringOrNull(res: Int?) = res?.let { resources.getString(it) }

fun View.getString(res: Int) = resources.getString(res)