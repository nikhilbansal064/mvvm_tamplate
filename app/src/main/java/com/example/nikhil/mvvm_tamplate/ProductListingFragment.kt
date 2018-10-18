package com.example.nikhil.mvvm_tamplate

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nikhil.mvvm_tamplate.databinding.FragmentProductListingBinding
import com.example.nikhil.mvvm_tamplate.viewmodels.ProductListingViewModel


class ProductListingFragment : Fragment() {

    lateinit var productListingViewModel: ProductListingViewModel
    lateinit var binding: FragmentProductListingBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        productListingViewModel = ViewModelProviders.of(this).get(ProductListingViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_product_listing, container, false)

        return binding.root
    }

    companion object {

    }
}
