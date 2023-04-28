package com.metehanbolat.pagingxml.domain.repository

import com.metehanbolat.pagingxml.data.dto.Character

interface RickAndMortyRepository {

    suspend fun getAllCharacter(): Character

}