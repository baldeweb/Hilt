package dev.baldewb.hilt.domain

import dev.baldewb.hilt.data.model.SWAPIModel
import retrofit2.Response

interface SWAPIRepository {
    suspend fun getStartships(): Response<SWAPIModel>
}