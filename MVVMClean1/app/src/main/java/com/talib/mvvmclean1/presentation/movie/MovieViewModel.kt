package com.talib.mvvmclean1.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.talib.mvvmclean1.domain.usecase.GetMoviesUseCase
import com.talib.mvvmclean1.domain.usecase.UpdateMoviesUseCase

class MovieViewModel(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUsecase: UpdateMoviesUseCase
) : ViewModel() {

    fun getMovies() = liveData {
        val movieList = getMoviesUseCase.excecute()
        emit(movieList)
    }

    fun updateMovies() = liveData {
        val movieList = updateMoviesUsecase.excecute()
        emit(movieList)
    }

}





