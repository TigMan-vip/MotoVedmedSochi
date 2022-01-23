package ru.fevgenson.timetable.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import ru.fevgenson.timetable.ui.theme.TimetableComposeTheme

class MainActivity : ComponentActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		setContent { MainActivity() }
	}

	@Composable
	private fun MainActivity() {
		TimetableComposeTheme {
			Text(text = "TODO")
		}
	}
}