package com.metehanbolat.pagingxml.domain.repository

import com.metehanbolat.pagingxml.data.dto.Character
import kotlinx.coroutines.flow.Flow

interface RickAndMortyRepository {

    suspend fun getAllCharacter():Flow<Character>

}