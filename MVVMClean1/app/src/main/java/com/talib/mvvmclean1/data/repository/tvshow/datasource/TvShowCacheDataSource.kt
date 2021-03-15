package com.talib.mvvmclean1.data.repository.tvshow.datasource

import com.talib.mvvmclean1.data.model.tvshow.TvShow


interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache(): List<TvShow>
    suspend fun saveTvShowsToCache(tvShows: List<TvShow>)
}