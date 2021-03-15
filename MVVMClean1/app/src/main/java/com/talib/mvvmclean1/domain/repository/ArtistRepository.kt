package com.talib.mvvmclean1.domain.repository

import com.talib.mvvmclean1.data.model.artist.Artist

interface ArtistRepository {

    suspend fun getArtists(): List<Artist>?
    suspend fun updateArtists(): List<Artist>?
}