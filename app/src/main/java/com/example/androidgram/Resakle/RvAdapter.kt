package com.example.androidgram.Resakle

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidgram.Fragments.SecondFragment
import com.example.androidgram.databinding.RvItemBinding

class RvAdapter(val list: List<User>, val cantext: SecondFragment):RecyclerView.Adapter<RvAdapter.Vh>() {

    inner class Vh(val itemBinding: RvItemBinding):RecyclerView.ViewHolder(itemBinding.root){
            val img=itemBinding.itemImage1

        fun bindview(image:User){
            img.setImageResource(image.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(RvItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int =list.size

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.bindview(list[position])
    }

}


