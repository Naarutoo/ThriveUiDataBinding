package com.example.thriveuiassig

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.thriveuidatabinding.R
import com.example.thriveuidatabinding.databinding.ItemViewBinding

class NewsAdapter(var newsList: ArrayList<Model>, private val onItemClick: OnItemClick) :
    RecyclerView.Adapter<NewsAdapter.NewsHolderx>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsHolderx {

        return NewsHolderx(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_view,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: NewsHolderx, position: Int) {
        holder.setData(newsList[position], onItemClick)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    class NewsHolderx(val itemViewBinding: ItemViewBinding) :
        RecyclerView.ViewHolder(itemViewBinding.root) {
        fun setData(modeldata: Model, onItemClick: OnItemClick) {
            itemViewBinding.model = modeldata
            itemViewBinding.image.setImageResource(modeldata.image);

            itemViewBinding.itemClick = onItemClick
        }

    }
}