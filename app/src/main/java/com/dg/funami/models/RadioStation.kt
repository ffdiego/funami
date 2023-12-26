package com.dg.funami.models

import android.content.Context
import android.media.MediaPlayer
import java.io.File
import java.io.IOException

class RadioStation(private val context: Context) {
    private val mediaPlayer: MediaPlayer = MediaPlayer()

    fun play() {
        val fileDir = context.filesDir
        val filePath = File(fileDir, "1.ogg").absolutePath

        this.mediaPlayer?.let {
            try {
                it.setDataSource(filePath)
                it.prepare()
                it.start()
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
    }
}