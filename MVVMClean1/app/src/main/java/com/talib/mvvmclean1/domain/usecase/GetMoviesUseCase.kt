package com.talib.mvvmclean1.domain.usecase

import com.talib.mvvmclean1.data.model.movie.Movie
import com.talib.mvvmclean1.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {

    suspend fun excecute() : List<Movie>? = movieRepository.getMovies()

}