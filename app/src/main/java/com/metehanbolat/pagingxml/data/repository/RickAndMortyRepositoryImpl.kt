package com.metehanbolat.pagingxml.data.repository

import com.metehanbolat.pagingxml.data.api.RickAndMortyApi
import com.metehanbolat.pagingxml.data.dto.Character
import com.metehanbolat.pagingxml.domain.repository.RickAndMortyRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RickAndMortyRepositoryImpl @Inject constructor(
    private val api: RickAndMortyApi
): RickAndMortyRepository {

    override suspend fun getAllCharacter(): Character {
        return api.getAllCharacter()

    }
}