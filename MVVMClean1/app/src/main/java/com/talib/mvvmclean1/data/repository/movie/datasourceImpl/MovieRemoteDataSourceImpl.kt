package com.talib.mvvmclean1.data.repository.movie.datasourceImpl

import com.talib.mvvmclean1.data.api.TMDBService
import com.talib.mvvmclean1.data.model.movie.MovieList
import com.talib.mvvmclean1.data.repository.movie.datasource.MovieRemoteDataSource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : MovieRemoteDataSource {

    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}

