package com.example.thriveuiassig

import com.example.thriveuidatabinding.R
import java.io.Serializable

data class Model(var image:Int,var headline: String,var sourceName:String,var date:String):Serializable


class modelList{
    val list=  ArrayList<Model>()
    fun makeList(): ArrayList<Model> {
        list.add(Model(R.drawable.lockdown, "Delhi declares lockdown", "ABP", "12-1-2022"))
        list.add(  Model(R.drawable.fatwa, "Fatwa Against Lipstick", "News18", "12-2-2022"))
        list.add(Model(R.drawable.ronaldo,"Ronaldo became all time Highest Scorer","Bharat News","8-6-2021"))
        return list
    }

}