package com.talib.mvvmclean1.presentation.di.core

import com.talib.mvvmclean1.data.api.TMDBService
import com.talib.mvvmclean1.data.repository.artist.datasource.ArtistRemoteDatasource
import com.talib.mvvmclean1.data.repository.artist.datasourceImpl.ArtistRemoteDataSourceImpl
import com.talib.mvvmclean1.data.repository.movie.datasource.MovieRemoteDataSource
import com.talib.mvvmclean1.data.repository.movie.datasourceImpl.MovieRemoteDataSourceImpl
import com.talib.mvvmclean1.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.talib.mvvmclean1.data.repository.tvshow.datasourceImpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }

    @Singleton
    @Provides
    fun provideTvRemoteDataSource(tmdbService: TMDBService): TvShowRemoteDatasource {
        return TvShowRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService): ArtistRemoteDatasource {
        return ArtistRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }


}