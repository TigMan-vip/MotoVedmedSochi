package ru.shiftlab.cftteam.libraries.core.utils.spannable

import android.graphics.Color
import android.text.TextPaint
import android.text.style.ClickableSpan
import android.view.View

class SpannableStringUtil(private val content: String, private val clickListener: () -> Unit?)
	: ClickableSpan() {

	override fun onClick(tv: View) {
		tv.tag = content
		tv.setOnClickListener { clickListener() }
	}

	override fun updateDrawState(drawState: TextPaint) {
		drawState.color = Color.parseColor("#ED1941")
		drawState.isUnderlineText = false
	}
}