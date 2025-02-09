package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.myapplication.databinding.FragmentDistrictListBinding



class DistrictFragment : Fragment(), DistrictAdapter.OnItemClickListener {
    private lateinit var binding: FragmentDistrictListBinding
    private lateinit var districtAdapter: DistrictAdapter
    private val args: DistrictFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDistrictListBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val division = args.data
        val manItems = ArrayList<District>()

        for (item in districtList) {
            if(item.divisionName == division.divisionName){
                manItems.add(item)
                println(item)
            }
        }

        val recyclerView: RecyclerView = binding.districtRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        districtAdapter = DistrictAdapter(manItems, this)
        recyclerView.adapter = districtAdapter
    }
    override fun onItemClick(district: District) {
        val action = DistrictFragmentDirections.actionDistrictFragmentToThanaFragment(district)
        findNavController().navigate(action)
    }

}
