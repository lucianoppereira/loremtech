package com.example.loremtech.presentation.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.loremtech.R
import com.example.loremtech.databinding.ActivityMainBinding
import com.example.loremtech.presentation.view.adapter.ProductListAdapter
import com.example.loremtech.presentation.viewmodel.ProductViewModel

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val productViewModel: ProductViewModel by viewModels()
    private lateinit var navController: NavController
    private lateinit var adapter: ProductListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        productViewModel.onCreate()

        productViewModel.productModels.observe(this, Observer {
            adapter = ProductListAdapter(it)
            binding.listRecyclerView.adapter = adapter
        })

//        val navHostFragment = supportFragmentManager.findFragmentById(
//            R.id.navHostFragment
//        ) as NavHostFragment

//        navController = navHostFragment.findNavController()
        setSupportActionBar(binding.mainToolbar)
//        setupActionBarWithNavController(navController)
    }

//    override fun onSupportNavigateUp(): Boolean {
//        return navController.navigateUp() || super.onSupportNavigateUp()
//    }
}