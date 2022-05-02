package com.example.loremtech.data.network

import com.example.loremtech.core.RetrofitHelper
import com.example.loremtech.data.model.ProductModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ProductService {
    private val retrofit = RetrofitHelper.getInstance()

    suspend fun getProduct(): List<ProductModel> {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(ProductApiClient::class.java).getAllProducts()
            response.body() ?: emptyList()
        }
    }
}