package com.example.loremtech.data

import com.example.loremtech.data.model.ProductModel
import com.example.loremtech.data.model.ProductProvider
import com.example.loremtech.data.network.ProductService

class ProductRepository {

    private val api = ProductService()

    suspend fun getAllProducts(): List<ProductModel> {
        val response = api.getProduct()
        ProductProvider.products = response
        return response
    }
}