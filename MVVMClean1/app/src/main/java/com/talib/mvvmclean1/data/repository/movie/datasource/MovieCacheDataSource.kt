package com.talib.mvvmclean1.data.repository.movie.datasource

import com.talib.mvvmclean1.data.model.movie.Movie


interface MovieCacheDataSource {
    suspend fun getMoviesFromCache(): List<Movie>
    suspend fun saveMoviesToCache(movies: List<Movie>)
}