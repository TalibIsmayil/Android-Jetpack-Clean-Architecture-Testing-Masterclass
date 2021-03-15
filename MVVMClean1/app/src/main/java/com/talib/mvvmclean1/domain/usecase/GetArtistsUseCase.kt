package com.talib.mvvmclean1.domain.usecase

import com.talib.mvvmclean1.data.model.artist.Artist
import com.talib.mvvmclean1.domain.repository.ArtistRepository

class GetArtistsUseCase(private val artistRepository: ArtistRepository) {

    suspend fun excecute() : List<Artist>? = artistRepository.getArtists()

}