package com.talib.mvvmclean1.data.repository.tvshow.datasource

import com.talib.mvvmclean1.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDatasource {
   suspend fun getTvShows(): Response<TvShowList>
}