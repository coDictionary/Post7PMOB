package com.farhan164.post7pmob

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.farhan164.post7pmob.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val title = intent.getStringExtra("title")
        val releaseDate = intent.getStringExtra("releaseDate")
        val description = intent.getStringExtra("description")
        val cover = intent.getStringExtra("cover")
        val pages = intent.getStringExtra("pages")
        val originalTitle = intent.getStringExtra("originalTitle")

        binding.txtDetailTitle.text = title
        binding.txtOriginalTitle.text = "Original Title: $originalTitle"
        binding.txtDetailRelease.text = "Release Date: $releaseDate"
        binding.txtDetailDesc.text = "Description: $description"
        binding.txtPage.text = "Total Pages: $pages"


        // ⬇⬇⬇ LOAD GAMBAR DARI HTTPS ⬇⬇⬇
        Glide.with(this)
            .load(cover)
            .into(binding.imgBooks)
    }
}