package com.example.nikhil.mvvm_tamplate

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val  FRAGMENT_TAG: String = "product_listing_tag"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            val productListingFragment = ProductListingFragment()
            supportFragmentManager.beginTransaction().add(R.id.fragment_container, productListingFragment, FRAGMENT_TAG).commit()
        }
    }
}
