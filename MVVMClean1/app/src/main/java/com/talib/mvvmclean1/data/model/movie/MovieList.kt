package com.talib.mvvmclean1.data.model.movie


import com.google.gson.annotations.SerializedName

data class MovieList(

    @SerializedName("results")
    val movies: List<Movie>

)