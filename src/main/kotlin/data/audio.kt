package data

data class Audio(
    val id: Int,
    val title: String,
    val writer: String,
    val audioUrl: String,
    val imageUrl: String,
)

val data = arrayOf<Audio>(
    Audio(1, "Ukulele", "Bensound", "https://www.bensound.com/bensound-music/bensound-ukulele.mp3", "https://www.bensound.com/bensound-img/ukulele.jpg"),
    Audio(2, "Summer", "Bensound", "https://www.bensound.com/bensound-music/bensound-summer.mp3", "https://www.bensound.com/bensound-img/summer.jpg"),
    Audio(3, "Happy Rock", "Bensound", "https://www.bensound.com/bensound-music/bensound-happyrock.mp3", "https://www.bensound.com/bensound-img/happyrock.jpg"),
    Audio(4, "Jazzy Frenchy", "Bensound", "https://www.bensound.com/bensound-music/bensound-jazzyfrenchy.mp3", "https://www.bensound.com/bensound-img/jazzyfrenchy.jpg")
)