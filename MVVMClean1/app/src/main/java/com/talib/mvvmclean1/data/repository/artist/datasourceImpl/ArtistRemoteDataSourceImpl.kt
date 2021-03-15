package com.talib.mvvmclean1.data.repository.artist.datasourceImpl

import com.talib.mvvmclean1.data.api.TMDBService
import com.talib.mvvmclean1.data.model.artist.ArtistList
import com.talib.mvvmclean1.data.repository.artist.datasource.ArtistRemoteDatasource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : ArtistRemoteDatasource {

    override suspend fun getArtists()
            : Response<ArtistList> = tmdbService.getPopularArtists(apiKey)

}

