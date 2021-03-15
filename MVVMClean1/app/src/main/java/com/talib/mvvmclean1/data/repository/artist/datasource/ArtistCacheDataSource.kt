package com.talib.mvvmclean1.data.repository.artist.datasource

import com.talib.mvvmclean1.data.model.artist.Artist


interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache(): List<Artist>
    suspend fun saveArtistsToCache(artists: List<Artist>)
}