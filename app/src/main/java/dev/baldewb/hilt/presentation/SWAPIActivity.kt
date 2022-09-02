package dev.baldewb.hilt.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.baldewb.hilt.R
import dev.baldewb.hilt.data.api.SWAPI
import dev.baldewb.hilt.databinding.ActivitySwapiBinding

@AndroidEntryPoint
class SWAPIActivity : AppCompatActivity() {
    private val viewModel by viewModels<SWAPIViewModel>()
    private lateinit var binding: ActivitySwapiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySwapiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.getStarships()
        viewModel.startships.observe(this) {
            Log.d("LOG", "onCreate: $it")
        }
    }
}