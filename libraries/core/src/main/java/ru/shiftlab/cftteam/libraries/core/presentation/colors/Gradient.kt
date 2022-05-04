package ru.shiftlab.cftteam.libraries.core.presentation.colors

import android.graphics.Color
import android.graphics.drawable.GradientDrawable

class Gradient(
	colors: List<String>,
	cornerRadiusPx: Float = 0f
) : GradientDrawable(Orientation.BL_TR,
	colors.convertHexToIntArray()) {

	init {
		shape = RECTANGLE
		gradientType = LINEAR_GRADIENT
		cornerRadius = cornerRadiusPx
	}
}

private fun List<String>.convertHexToIntArray(): IntArray {
	if (this.size == 1) {
		val colorsHex = this.map { Color.parseColor(it) }.toMutableList()
		colorsHex.add(colorsHex[0])
		return colorsHex.toTypedArray().toIntArray()
	}
	return this.map { Color.parseColor(it) }.toTypedArray().toIntArray()
}
