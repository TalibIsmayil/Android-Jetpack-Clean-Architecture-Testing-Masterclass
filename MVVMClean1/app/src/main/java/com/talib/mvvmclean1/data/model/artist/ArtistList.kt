package com.talib.mvvmclean1.data.model.artist


import com.google.gson.annotations.SerializedName

data class ArtistList(

    @SerializedName("results")
    val artists: List<Artist>

)