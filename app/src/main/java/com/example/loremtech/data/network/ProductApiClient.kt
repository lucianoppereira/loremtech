package com.example.loremtech.data.network

import com.example.loremtech.data.model.ProductModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ProductApiClient {
    @GET("list")
    suspend fun getAllProducts(): Response<List<ProductModel>>
}