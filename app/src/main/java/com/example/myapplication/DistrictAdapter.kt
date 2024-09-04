package com.example.myapplication

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.myapplication.databinding.AdapterDistrictBinding

class DistrictAdapter(
    private val districtList: ArrayList<District>,
    private val listener: OnItemClickListener,
) : RecyclerView.Adapter<DistrictAdapter.ViewHolder>() {
    class ViewHolder(val binding: AdapterDistrictBinding) : RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding = AdapterDistrictBinding.inflate(
            LayoutInflater.from(viewGroup.context),
            viewGroup,
            false
            )
        return ViewHolder(binding
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val district = districtList[position]
        holder.binding.tvEmployeeDistrictName.text = district.districtName
        holder.itemView.setOnClickListener {
            listener.onItemClick(district)
        }
    }

    override fun getItemCount(): Int {
        return districtList.size

    }
    interface OnItemClickListener {
        fun onItemClick(district: District)

    }


}