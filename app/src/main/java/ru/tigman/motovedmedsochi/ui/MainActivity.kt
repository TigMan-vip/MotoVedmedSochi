package ru.tigman.motovedmedsochi.ui

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.savvi.rangedatepicker.CalendarPickerView
import ru.tigman.motovedmedsochi.R
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class MainActivity : ComponentActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
	}
}