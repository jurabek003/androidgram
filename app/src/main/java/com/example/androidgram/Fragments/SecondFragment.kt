package com.example.androidgram.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidgram.R
import com.example.androidgram.Resakle.RvAdapter
import com.example.androidgram.Resakle.User
import com.example.androidgram.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private val binding by lazy { FragmentSecondBinding.inflate(layoutInflater) }
    private var username:String?=null
    private var name:String?=null
    private var description:String?=null
    private var jop:String?=null
    private var list=ArrayList<User>()
    lateinit var useradapter:RvAdapter
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ):View? {

        useradapter=RvAdapter(list,this)

        useradapter.notifyDataSetChanged()
        val images= listOf<User>(
            User(R.drawable.photo1)
        )
        binding.tvResakle.adapter=RvAdapter(images,this)

        name=arguments?.getString("keyname")
        username=arguments?.getString("keyusername")
        description=arguments?.getString("keydescription")
        jop=arguments?.getString("keyjop")
        binding.tvUsername.text=username
        binding.name.text=name
        binding.jops.text=jop
        binding.description.text=description


        return binding.root
    }
    }
