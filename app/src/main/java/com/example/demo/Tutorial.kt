package com.example.demo

fun main() {

    val song1 = Song(title = "Chaiyaa Chaiiyaa", artist = "Tony kakkar", durationInSec = 360)

    song1.start()
    song1.pause()
    song1.play()
    song1.stop()
}

class Song(val title: String, val artist: String, val durationInSec: Int) {

    fun start() {
        println("Song $title is playing")
    }

    fun stop() {
        println("$title stopped playing")
    }

    fun play() {
        println("$title by $artist is playing")
    }
    fun pause() {
        println("$title finished playing")
    }

}