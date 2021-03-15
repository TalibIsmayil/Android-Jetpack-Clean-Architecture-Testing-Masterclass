package com.talib.mvvmclean1.domain.repository

import com.talib.mvvmclean1.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?
}