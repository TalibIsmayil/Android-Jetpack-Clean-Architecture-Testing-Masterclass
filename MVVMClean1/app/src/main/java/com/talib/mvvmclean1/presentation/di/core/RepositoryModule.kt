package com.talib.mvvmclean1.presentation.di.core

import com.talib.mvvmclean1.data.repository.artist.ArtistRepositoryImpl
import com.talib.mvvmclean1.data.repository.artist.datasource.ArtistCacheDataSource
import com.talib.mvvmclean1.data.repository.artist.datasource.ArtistLocalDataSource
import com.talib.mvvmclean1.data.repository.artist.datasource.ArtistRemoteDatasource
import com.talib.mvvmclean1.data.repository.movie.MovieRepositoryImpl
import com.talib.mvvmclean1.data.repository.movie.datasource.MovieCacheDataSource
import com.talib.mvvmclean1.data.repository.movie.datasource.MovieLocalDataSource
import com.talib.mvvmclean1.data.repository.movie.datasource.MovieRemoteDataSource
import com.talib.mvvmclean1.data.repository.tvshow.TvShowRepositoryImpl
import com.talib.mvvmclean1.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.talib.mvvmclean1.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.talib.mvvmclean1.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.talib.mvvmclean1.domain.repository.ArtistRepository
import com.talib.mvvmclean1.domain.repository.MovieRepository
import com.talib.mvvmclean1.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideTvShowRepository(
        tvShowRemoteDatasource: TvShowRemoteDatasource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {

        return TvShowRepositoryImpl(
            tvShowRemoteDatasource,
            tvShowLocalDataSource,
            tvShowCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideArtistRepository(
        artistRemoteDatasource: ArtistRemoteDatasource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {

        return ArtistRepositoryImpl(
            artistRemoteDatasource,
            artistLocalDataSource,
            artistCacheDataSource
        )


    }

}