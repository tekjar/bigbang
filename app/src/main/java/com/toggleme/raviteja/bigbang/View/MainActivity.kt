package com.toggleme.raviteja.bigbang.View

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.toggleme.raviteja.bigbang.Presenter.HomeAdapter
import com.toggleme.raviteja.bigbang.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById(R.id.recycler) as RecyclerView
        recycler.setHasFixedSize(true)
        recycler.itemAnimator = DefaultItemAnimator()
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = HomeAdapter(this)
    }
}
