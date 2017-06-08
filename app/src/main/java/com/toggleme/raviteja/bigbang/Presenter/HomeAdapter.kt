package com.toggleme.raviteja.bigbang.Presenter

import android.content.Context
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.toggleme.raviteja.bigbang.Model.HomeModel
import com.toggleme.raviteja.bigbang.R
import java.text.FieldPosition

/**
 * Created by raviteja on 04/06/17.
 */
class HomeAdapter(val context: Context): RecyclerView.Adapter<HomeAdapter.viewholder>() {
    override fun getItemCount(): Int {
        return 5
    }

    override fun onCreateViewHolder(p0: ViewGroup?, p1: Int): viewholder {
        var v: View = LayoutInflater.from(p0?.context).inflate(R.layout.board, p0, false)
        return HomeAdapter.viewholder(v)
    }

    override fun onBindViewHolder(holder: viewholder?, position: Int) {
        holder?.recycler?.layoutManager = GridLayoutManager(context, 3)
        holder?.recycler?.setHasFixedSize(true)

        val devices = HomeModel().getDeviceList(position)
        holder?.recycler?.adapter = BoardAdapter(devices, context)
    }


    class viewholder(view: View): RecyclerView.ViewHolder(view) {
        val recycler: RecyclerView= view.findViewById(R.id.boardrecycler) as RecyclerView
        val text: TextView =view.findViewById(R.id.board_name) as TextView


        init {

        }

    }
}