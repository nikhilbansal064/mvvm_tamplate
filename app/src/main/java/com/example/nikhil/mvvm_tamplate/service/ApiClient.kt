package com.example.nikhil.mvvm_tamplate.service

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.Dispatcher
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Mohammad Sunny on 25/1/18.
 */
class ApiClient {

    companion object {

        val API_URL = "https://api.github.com/"

        var retrofit: Retrofit? = null
            get() {
                field = field ?: Retrofit.Builder()
                        .addConverterFactory(GsonConverterFactory.create(gson))
                        .baseUrl(API_URL)
                        .client(client)
                        .build()
                return field
            }

        private var gson : Gson? = null
            get() {
                field = field ?: GsonBuilder().create()
                return field
            }

//        private var interceptor = HttpLoggingInterceptor()
//        get() {
//            if (BuildConfig.DEBUG)
//                field.level = HttpLoggingInterceptor.Level.BODY
//            else
//                field.level = HttpLoggingInterceptor.Level.NONE
//            return field
//        }

        var client : OkHttpClient? = null
            get() {
                val dispatcher = Dispatcher()
                dispatcher.maxRequests = 1
                field = field ?: OkHttpClient.Builder()
                        //.addInterceptor(interceptor)
                        .dispatcher(dispatcher)
                        //.connectTimeout(ApiConstants.CONNECT_TIMEOUT.toLong(), TimeUnit.SECONDS)
                        .build()
                return  field
            }

    }

}