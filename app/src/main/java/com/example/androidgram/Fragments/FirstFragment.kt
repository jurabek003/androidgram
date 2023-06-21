package com.example.androidgram.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidgram.R
import com.example.androidgram.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
private val binding by lazy {FragmentFirstBinding.inflate(layoutInflater)  }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding.tvEnter.setOnClickListener {
            val secondFragment=SecondFragment()
            val bundle=Bundle()
            bundle.putString("keyusername",binding.tvUsername.text.toString().trim())
            bundle.putString("keyname",binding.tvNema.text.toString().trim())
            bundle.putString("keydescription",binding.tvDescription.text.toString().trim())
            bundle.putString("keyjop",binding.tvJop.text.toString().trim())
            secondFragment.arguments=bundle
            parentFragmentManager.beginTransaction()
                .addToBackStack(secondFragment.toString())
                .replace(R.id.my_contaner,secondFragment)
                .commit()
        }

return binding.root
    }



    }
