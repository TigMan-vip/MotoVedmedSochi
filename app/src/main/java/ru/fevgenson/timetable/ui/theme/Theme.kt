package ru.fevgenson.timetable.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
	primary = Blue,
	primaryVariant = Blue,
	secondary = Gray,
	background = LightBlack,
	surface = LightBlack,
	onPrimary = GrayLight,
	onSecondary = GrayLight,
	onBackground = GrayLight,
	onSurface = GrayLight,
	error = Red,
	onError = Color.White,
)

private val LightColorPalette = lightColors(
	primary = Blue,
	primaryVariant = Blue,
	secondary = Color.White,
	background = Color.White,
	surface = Color.White,
	onPrimary = Color.White,
	onSecondary = Color.DarkGray,
	onBackground = Color.DarkGray,
	onSurface = Color.DarkGray,
	error = Red,
	onError = Color.White,
)

@Composable
fun TimetableComposeTheme(
	darkTheme: Boolean = isSystemInDarkTheme(),
	content: @Composable () -> Unit,
) {
	val colors = if (darkTheme) {
		DarkColorPalette
	} else {
		LightColorPalette
	}

	MaterialTheme(
		colors = colors,
		typography = Typography,
		shapes = Shapes,
		content = content,
	)
}