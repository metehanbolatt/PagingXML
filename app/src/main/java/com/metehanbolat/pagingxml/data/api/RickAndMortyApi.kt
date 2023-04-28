package com.metehanbolat.pagingxml.data.api

import com.metehanbolat.pagingxml.data.dto.Character
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import retrofit2.http.GET

interface RickAndMortyApi {

    @GET("character")
    suspend fun getAllCharacter(): Character

}