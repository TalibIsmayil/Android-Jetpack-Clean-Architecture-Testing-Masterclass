package com.talib.mvvmclean1.data.repository.movie.datasource

import com.talib.mvvmclean1.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies(): Response<MovieList>
}