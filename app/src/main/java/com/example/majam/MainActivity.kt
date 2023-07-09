package com.example.majam

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.majam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animationDrawable = binding.root.background as AnimationDrawable
        val clickAnim: Animation = AnimationUtils.loadAnimation(this, R.anim.little_bounce)

        animationDrawable.setEnterFadeDuration(10)
        animationDrawable.setExitFadeDuration(1000)
        animationDrawable.start()

        binding.playButton.setOnClickListener {
            val changePage = Intent(this, DummyActivity::class.java)
            startActivity(changePage)
            binding.playButton.startAnimation(clickAnim)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        binding.settingsButton.setOnClickListener{
            binding.settingsButton.startAnimation(clickAnim)
        }
    }
}