package com.example.loremtech.presentation.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.loremtech.R
import com.example.loremtech.databinding.FragmentListBinding
import com.example.loremtech.presentation.view.adapter.ProductListAdapter
import com.example.loremtech.presentation.viewmodel.ProductViewModel

class ListFragment : Fragment() {

    private val binding by lazy { FragmentListBinding.inflate(layoutInflater, ) }
    private val productViewModel: ProductViewModel by viewModels()
    private lateinit var adapter: ProductListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        productViewModel.productModels.observe(requireActivity(), Observer {
            adapter = ProductListAdapter(it)
            binding.listRecyclerView.adapter = adapter
        })
    }
}