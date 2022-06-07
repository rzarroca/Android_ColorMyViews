package net.rzarroca.android_colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import net.rzarroca.android_colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(binding.boxOne, binding.boxTwo, binding.boxThree, binding.boxFour, binding.boxFive, binding.root)

        for (item in clickableViews) {
            item.setOnClickListener {
                makeColored(it)
            }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            binding.boxOne.id -> view.setBackgroundColor(Color.DKGRAY)
            binding.boxTwo.id -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            binding.boxThree.id -> view.setBackgroundResource(android.R.color.holo_green_dark)
            binding.boxFour.id -> view.setBackgroundResource(android.R.color.holo_green_light)
            binding.boxFive.id -> view.setBackgroundResource(android.R.color.holo_green_dark)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}