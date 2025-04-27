package com.soha.infotech.jsonplaceholdercleanarchitecturehgfza.utils

import android.util.Log
import okhttp3.Interceptor
import okhttp3.Response

/**
 * Step 3: Create a Custom Interceptor
 *
 * This interceptor logs every API request and response:
 */

class AuthInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()

        Log.d("API_REQUEST", "Request URL: ${request.url}")
        Log.d("API_REQUEST", "Request Headers: ${request.headers}")

        val response = chain.proceed(request)

        Log.d("API_RESPONSE", "Response Code: ${response.code}")
        Log.d("API_RESPONSE", "Response Headers: ${response.headers}")

        return response
    }
}