package com.example.majam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DummyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dummy)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }
}