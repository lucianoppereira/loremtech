package com.example.loremtech.presentation.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.loremtech.databinding.ItemProductBinding
import com.example.loremtech.data.model.ProductModel
import com.example.loremtech.presentation.view.adapter.viewholder.ProductItemViewHolder
import com.example.loremtech.presentation.view.adapter.viewholder.ViewHolder

class ProductListAdapter(private val productList: List<ProductModel>) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ProductItemViewHolder(
            ItemProductBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        (holder as ProductItemViewHolder).bind(productList[position])
    }

    override fun getItemCount(): Int = productList.size
}