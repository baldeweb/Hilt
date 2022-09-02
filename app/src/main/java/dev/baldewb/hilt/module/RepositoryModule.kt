package dev.baldewb.hilt.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.baldewb.hilt.data.api.SWAPI
import dev.baldewb.hilt.domain.SWAPIRepository
import dev.baldewb.hilt.domain.SWAPIRepositoryImpl

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideRepository(api: SWAPI): SWAPIRepository {
        return SWAPIRepositoryImpl(api)
    }

}