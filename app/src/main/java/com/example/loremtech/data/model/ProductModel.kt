package com.example.loremtech.data.model

import com.google.gson.annotations.SerializedName

data class ProductModel(
    @SerializedName("title") val title: String,
    @SerializedName("description") val description: String,
    @SerializedName("image") val image: String?
)
