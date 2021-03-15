package com.talib.mvvmclean1.presentation.di.core

import com.talib.mvvmclean1.presentation.di.movie.MovieSubComponent
import com.talib.mvvmclean1.presentation.di.tvshow.TvShowSubComponent
import com.talib.mvvmclean1.presentation.di.artist.ArtistSubComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        NetModule::class,
        DataBaseModule::class,
        UseCaseModule::class,
        RepositoryModule::class,
        RemoteDataModule::class,
        LocalDataModule::class,
        CacheDataModule::class
    ]
)
interface AppComponent {

    fun movieSubComponent(): MovieSubComponent.Factory
    fun tvShowSubComponent(): TvShowSubComponent.Factory
    fun artistSubComponent(): ArtistSubComponent.Factory

}