package com.talib.mvvmclean1.presentation.di.core

import com.talib.mvvmclean1.data.repository.artist.datasource.ArtistCacheDataSource
import com.talib.mvvmclean1.data.repository.artist.datasourceImpl.ArtistCacheDataSourceImpl
import com.talib.mvvmclean1.data.repository.movie.datasource.MovieCacheDataSource
import com.talib.mvvmclean1.data.repository.movie.datasourceImpl.MovieCacheDataSourceImpl
import com.talib.mvvmclean1.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.talib.mvvmclean1.data.repository.tvshow.datasourceImpl.TvShowCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }


}