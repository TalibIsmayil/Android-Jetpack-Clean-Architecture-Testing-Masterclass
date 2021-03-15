package com.talib.mvvmclean1.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.talib.mvvmclean1.domain.usecase.GetArtistsUseCase
import com.talib.mvvmclean1.domain.usecase.UpdateArtistsUseCase

class ArtistViewModel(
    private val getArtistsUseCase: GetArtistsUseCase,
    private val updateArtistsUseCase: UpdateArtistsUseCase
): ViewModel() {

    fun getArtists() = liveData {
        val artistList = getArtistsUseCase.excecute()
        emit(artistList)
    }

    fun updateArtists() = liveData {
        val artistList = updateArtistsUseCase.excecute()
        emit(artistList)
    }

}