package com.talib.mvvmclean1.domain.repository

import com.talib.mvvmclean1.data.model.tvshow.TvShow

interface TvShowRepository {

    suspend fun getTvShows(): List<TvShow>?
    suspend fun updateTvShows(): List<TvShow>?
}