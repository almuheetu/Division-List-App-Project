package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentDivisionListBinding
import com.example.myapplication.placeholder.PlaceholderContent

class DivisionFragment : Fragment(), DivisionAdapter.OnItemClickListener {
    private lateinit var binding: FragmentDivisionListBinding
    private lateinit var divisionAdapter: DivisionAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDivisionListBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = binding.divisionRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        divisionAdapter = DivisionAdapter(divisionList, this)
        recyclerView.adapter = divisionAdapter

    }

    override fun onItemClick(division: Division) {
        val action = DivisionFragmentDirections.actionDivisionFragmentToDistrictFragment2(division)
        findNavController().navigate(action)

    }


}