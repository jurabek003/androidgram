package com.example.androidgram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidgram.Fragments.FirstFragment
import com.example.androidgram.Fragments.OpenFragment
import com.example.androidgram.Fragments.SecondFragment
import com.example.androidgram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .add(R.id.my_contaner, FirstFragment())
            .commit()
        val openFragment=OpenFragment()
        binding.btnhome.setOnClickListener{
           supportFragmentManager.beginTransaction()
               .addToBackStack(openFragment.toString())
               .replace(R.id.my_contaner,openFragment)
               .commit()

        }
        val secondFragment=SecondFragment()
        binding.btnoval.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.my_contaner,secondFragment)
                .commit()
        }
    }
}