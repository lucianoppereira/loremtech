package com.example.loremtech.presentation.view.adapter.viewholder

import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.loremtech.databinding.ItemProductBinding
import com.example.loremtech.data.model.ProductModel

class ProductItemViewHolder(
    private val itemBinding: ItemProductBinding
) : ViewHolder(itemBinding.root){
    fun bind(product: ProductModel) {
        with(itemBinding) {
            titleTexView.text = product.title
            descriptionTexView.text = product.description

            Glide.with(itemView.context)
                .load(product.image)
                .apply(RequestOptions.circleCropTransform())
                .into(thumbnailImageView)
        }
    }
}