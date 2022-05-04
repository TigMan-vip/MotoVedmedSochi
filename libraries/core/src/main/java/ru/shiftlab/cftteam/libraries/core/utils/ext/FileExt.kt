package ru.shiftlab.cftteam.libraries.core.utils.ext

import android.content.Context
import android.net.Uri
import androidx.core.content.FileProvider
import java.io.File

private const val AUTHORITY = "ru.shiftlab.cftteam.provider"

fun File.getUriFromProvider(context: Context): Uri =
	FileProvider.getUriForFile(context, AUTHORITY, this)
