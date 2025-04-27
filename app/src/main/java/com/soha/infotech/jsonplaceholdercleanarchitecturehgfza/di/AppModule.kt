package com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.di

import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.data.remote.ApiService
import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.data.repository.PostRepositoryImpl
import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.domain.repository.PostRepository
import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.utils.ApiConstants
import com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.utils.AuthInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Step 6.: Create Hilt Module
 */

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(AuthInterceptor())
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(client: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(ApiConstants.BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    @Singleton
    fun providePostRepository(apiService: ApiService): PostRepository {
        return PostRepositoryImpl(apiService)
    }
}