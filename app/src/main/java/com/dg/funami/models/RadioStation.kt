package com.dg.funami.models

import android.media.MediaPlayer

class RadioStation(val mediaPlayer: MediaPlayer, val game: GameNames) {
    var name: String? = null
    var url: String? = null
    var image: String? = null
    val path: String = ""

    fun play() {
        this.mediaPlayer.setDataSource(this.path)
        this.mediaPlayer.seekTo(this.mediaPlayer.duration / 2)
        this.mediaPlayer.start()
    }
}