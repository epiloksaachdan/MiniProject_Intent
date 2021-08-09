package com.achdanepiloksa.belajar_intent

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.second_activity.*

class SecondActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
    }

    override fun onStart() {
        super.onStart()
        if (intent != null) {
            val string = intent.getSerializableExtra("key") as Person
            sec?.text = "HI ! I'm ${string.name} and I'm ${string.age}"
        }
    }
}