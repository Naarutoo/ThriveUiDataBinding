package com.example.thriveuiassig

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.thriveuiassig.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),OnItemClick {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setRecyclerview(modelList().makeList())
    }

    fun setRecyclerview(list: ArrayList<Model>) {
        binding.recyclerview.apply {
            adapter = NewsAdapter(list,this@MainActivity)
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }

    override fun onItemClicked(model: Model) {
        val intent = Intent(this,DetailNews::class.java)
        intent.putExtra("data",model)
        startActivity(intent)
    }
}