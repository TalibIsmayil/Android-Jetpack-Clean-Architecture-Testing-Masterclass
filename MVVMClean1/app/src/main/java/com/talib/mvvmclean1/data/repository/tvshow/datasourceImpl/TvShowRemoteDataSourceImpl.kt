package com.talib.mvvmclean1.data.repository.tvshow.datasourceImpl

import com.talib.mvvmclean1.data.api.TMDBService
import com.talib.mvvmclean1.data.model.tvshow.TvShowList
import com.talib.mvvmclean1.data.repository.tvshow.datasource.TvShowRemoteDatasource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : TvShowRemoteDatasource {

    override suspend fun getTvShows()
            : Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)

}

