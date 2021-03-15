package com.talib.mvvmclean1.presentation.di.movie

import com.talib.mvvmclean1.presentation.movie.MovieViewModelFactory
import com.talib.mvvmclean1.domain.usecase.GetMoviesUseCase
import com.talib.mvvmclean1.domain.usecase.UpdateMoviesUseCase
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUsecase: UpdateMoviesUseCase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUsecase
        )
    }

}