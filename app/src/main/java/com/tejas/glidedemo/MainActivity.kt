package com.tejas.glidedemo

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.tejas.glidedemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    // TODO Step 1: A Random image from google to load it using Glide.
    private val image = "https://cdn.pixabay.com/photo/2018/05/03/21/49/android-3372580_960_720.png"

    //ViewBinding
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding:ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        Glide.with(this)
            .load(image)
            .into(binding.imageOne)

        Glide.with(this)
            .load(image)
            .fitCenter()
            .circleCrop()
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .placeholder(R.drawable.ic_menu_gallery)
            .into(binding.imageTwo)

        Glide.with(this)
            .load(image)
            .override(300,400)
            .centerCrop()
            .into(binding.imageThree)


    }
}