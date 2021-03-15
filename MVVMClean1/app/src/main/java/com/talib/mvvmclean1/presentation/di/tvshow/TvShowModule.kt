package com.talib.mvvmclean1.presentation.di.tvshow

import com.talib.mvvmclean1.domain.usecase.GetTvShowsUseCase
import com.talib.mvvmclean1.domain.usecase.UpdateTvShowUseCase
import com.talib.mvvmclean1.presentation.tvshow.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase,
            updateTvShowsUseCase
        )
    }

}