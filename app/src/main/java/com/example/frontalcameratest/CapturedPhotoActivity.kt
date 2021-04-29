package com.example.frontalcameratest

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_captured_photo.*

class CapturedPhotoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_captured_photo)

        val uri = Uri.parse(intent.getStringExtra("uri"))

        Glide.with(this).load(uri).into(iv_photo)

    }
}