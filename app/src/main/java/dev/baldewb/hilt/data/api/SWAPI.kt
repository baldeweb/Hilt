package dev.baldewb.hilt.data.api

import dev.baldewb.hilt.data.model.SWAPIModel
import retrofit2.Response
import retrofit2.http.GET

interface SWAPI {
    @GET("starships/9/")
    suspend fun getStartships(): Response<SWAPIModel>
}