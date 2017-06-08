package com.toggleme.raviteja.bigbang.Presenter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.toggleme.raviteja.bigbang.R

/**
 * Created by raviteja on 04/06/17.
 */
class BoardAdapter(val imageIds :MutableList<Int>, val context: Context): RecyclerView.Adapter<BoardAdapter.viewholder>() {
    override fun onBindViewHolder(p0: viewholder?, p1: Int) {
        p0?.device?.setBackgroundResource(imageIds[p1])
    }

    override fun getItemCount(): Int {
        return imageIds.size
    }

    override fun onCreateViewHolder(p0: ViewGroup?, p1: Int): viewholder {
        var v: View = LayoutInflater.from(p0?.context).inflate(R.layout.device, p0, false)
        return viewholder(v)
    }


    class viewholder(view: View): RecyclerView.ViewHolder(view){
        val device: ImageButton =view.findViewById(R.id.device) as ImageButton

        init {

        }
    }
}