package com.example.music_recomend_profile.database

data class RecordItem(

    var emotion: String? = null,
    var date: Long? = null,
    var songList: List<Song>? = null

)

data class Song(
    var songName: String? = null,
    var singer: String? = null,
    var songLink: String? = null
)
