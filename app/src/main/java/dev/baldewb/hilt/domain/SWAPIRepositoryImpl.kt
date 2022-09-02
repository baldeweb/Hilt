package dev.baldewb.hilt.domain

import dev.baldewb.hilt.data.api.SWAPI
import dev.baldewb.hilt.data.model.SWAPIModel
import retrofit2.Response
import javax.inject.Inject

class SWAPIRepositoryImpl @Inject constructor(private val api: SWAPI): SWAPIRepository {
    override suspend fun getStartships(): Response<SWAPIModel> = api.getStartships()
}