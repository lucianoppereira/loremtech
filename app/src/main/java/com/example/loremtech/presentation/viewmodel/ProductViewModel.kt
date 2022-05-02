package com.example.loremtech.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.loremtech.data.model.ProductModel
import com.example.loremtech.data.model.ProductProvider
import com.example.loremtech.domain.GetProductsUseCase
import kotlinx.coroutines.launch

class ProductViewModel : ViewModel() {
    val productModels = MutableLiveData<List<ProductModel>>()
    var getProductsUseCase = GetProductsUseCase()

    fun onCreate() {
        viewModelScope.launch {
            val result = getProductsUseCase()

            if (!result.isNullOrEmpty()) {
                 productModels.postValue(result)
            }
        }
    }

    fun getAllProducts() {
        val products = ProductProvider.products
        productModels.postValue(products)
    }
}