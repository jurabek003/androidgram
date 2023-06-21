package com.example.androidgram

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidgram.Fragments.OpenFragment
import com.example.androidgram.Fragments.SecondFragment
import com.example.androidgram.Resakle.RvAdapter
import com.example.androidgram.Resakle.User
import com.example.androidgram.databinding.FragmentSecondBinding

class MainActivity2 : AppCompatActivity() {
    private val list=ArrayList<User>()
    private lateinit var useradapter: RvAdapter
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val secondFragment=SecondFragment()

    }

}