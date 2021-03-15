package com.talib.mvvmclean1.domain.usecase

import com.talib.mvvmclean1.data.model.tvshow.TvShow
import com.talib.mvvmclean1.domain.repository.TvShowRepository

class UpdateTvShowUseCase(private val tvShowRepository: TvShowRepository) {

    suspend fun excecute() : List<TvShow>? = tvShowRepository.updateTvShows()

}