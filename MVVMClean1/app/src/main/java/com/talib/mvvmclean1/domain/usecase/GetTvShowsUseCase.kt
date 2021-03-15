package com.talib.mvvmclean1.domain.usecase

import com.talib.mvvmclean1.data.model.tvshow.TvShow
import com.talib.mvvmclean1.domain.repository.TvShowRepository

class GetTvShowsUseCase(private val tvShowRepository: TvShowRepository) {

    suspend fun excecute() : List<TvShow>? = tvShowRepository.getTvShows()

}