package com.talib.mvvmclean1.presentation.di.core

import com.talib.mvvmclean1.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import com.talib.mvvmclean1.data.db.ArtistDao
import com.talib.mvvmclean1.data.db.MovieDao
import com.talib.mvvmclean1.data.db.TvShowDao
import com.talib.mvvmclean1.data.repository.artist.datasource.ArtistLocalDataSource
import com.talib.mvvmclean1.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.talib.mvvmclean1.data.repository.movie.datasource.MovieLocalDataSource
import com.talib.mvvmclean1.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.talib.mvvmclean1.data.repository.tvshow.datasource.TvShowLocalDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao): TvShowLocalDataSource {
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao : ArtistDao): ArtistLocalDataSource {
        return ArtistLocalDataSourceImpl(artistDao)
    }


}