package com.talib.mvvmclean1.presentation.di.artist

import com.talib.mvvmclean1.domain.usecase.GetArtistsUseCase
import com.talib.mvvmclean1.domain.usecase.UpdateArtistsUseCase
import com.talib.mvvmclean1.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(
            getArtistsUseCase,
            updateArtistsUseCase
        )
    }

}