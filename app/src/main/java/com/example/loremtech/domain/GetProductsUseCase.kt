package com.example.loremtech.domain

import com.example.loremtech.data.ProductRepository
import com.example.loremtech.data.model.ProductModel

class GetProductsUseCase {

    private val repository = ProductRepository()

    suspend operator fun invoke(): List<ProductModel> =
        repository.getAllProducts()
}