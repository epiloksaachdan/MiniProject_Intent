package com.achdanepiloksa.belajar_intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        setupImplicitIntent()
        setupCamIntent()
        setupExplicitIntent()
    }

    private fun setupExplicitIntent() {
        btnExplicit?.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            val person = Person("achdan", 21)
            intent.putExtra("key", person)
            startActivity(intent)
        }
    }

    private fun setupImplicitIntent() {
        btnImplicit?.setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "911"))
            startActivity(intent)
        }
    }
    private fun setupCamIntent() {
        btnCam?.setOnClickListener{
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }
}