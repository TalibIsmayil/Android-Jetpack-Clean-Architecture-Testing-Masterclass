package com.talib.mvvmclean1.data.repository.artist.datasource

import com.talib.mvvmclean1.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDatasource {
    suspend fun getArtists(): Response<ArtistList>
}