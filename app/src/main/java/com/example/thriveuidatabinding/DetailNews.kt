package com.example.thriveuiassig

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import androidx.databinding.DataBindingUtil
import com.example.thriveuiassig.databinding.ActivityDetailNewsBinding
import com.example.thriveuiassig.databinding.ActivityMainBinding

class DetailNews : AppCompatActivity() {
    private lateinit var detailBinding:ActivityDetailNewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     detailBinding = DataBindingUtil.setContentView(this,R.layout.activity_detail_news)
        if (intent!=null){
            val data = intent.getSerializableExtra("data")as Model
            detailBinding.model  = data
            detailBinding.image.setImageResource(data.image)
            detailBinding.tvHeadline.text = data.headline
            detailBinding.tvDate.text = data.date
            detailBinding.tvSourceName.text = data.sourceName
        }
    }
}