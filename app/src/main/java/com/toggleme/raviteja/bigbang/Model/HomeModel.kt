package com.toggleme.raviteja.bigbang.Model

import com.toggleme.raviteja.bigbang.R

/**
 * Created by raviteja on 04/06/17.
 */
public class HomeModel {
    public fun getDeviceList(numver: Int): MutableList<Int>{

        when(numver){
            0 ->{
                //card1: [light, light, fan, plug, light, light, light]
                val imagelist: MutableList<Int> = mutableListOf(R.drawable.light_off ,R.drawable.light_off,R.drawable.fan_off,
                        R.drawable.socket_off,R.drawable.light_off,R.drawable.light_off,R.drawable.light_off);

                return imagelist
            }
            1 ->{
                //card2: [fan, fan, fan, plug, light, light, light]
                val imagelist: MutableList<Int> = mutableListOf(R.drawable.fan_off,R.drawable.fan_off,R.drawable.fan_off,
                        R.drawable.socket_off,R.drawable.light_off,R.drawable.light_off,R.drawable.light_off);
                return imagelist
            }
            2 ->{
                //card3: [light, light, plug, fan],
                val imagelist: MutableList<Int> = mutableListOf(R.drawable.light_off,R.drawable.light_off,R.drawable.socket_off,
                        R.drawable.fan_off);
                return imagelist
            }
            3 ->{
                //card4: [fan, light, fan, plug, light],
                val imagelist: MutableList<Int> = mutableListOf(R.drawable.fan_off,R.drawable.light_off,R.drawable.fan_off,
                        R.drawable.socket_off,R.drawable.light_off);
                return imagelist
            }
            4 ->{
                //card5: [plug, light, fan, plug, light, plug, light]
                val imagelist: MutableList<Int> = mutableListOf(R.drawable.socket_off,R.drawable.light_off,R.drawable.fan_off,
                        R.drawable.socket_off,R.drawable.light_off,R.drawable.socket_off,R.drawable.light_off);
                return imagelist
            }
        }
        return mutableListOf(0)
    }
}