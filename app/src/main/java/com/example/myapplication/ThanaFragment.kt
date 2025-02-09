package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.myapplication.databinding.FragmentThanaListBinding


class ThanaFragment : Fragment() {
    private lateinit var binding: FragmentThanaListBinding
    private lateinit var thanaAdapter: ThanaAdapter
    private val args: ThanaFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThanaListBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val district = args.data
        val thanas = ArrayList<Thana>()


        for (item in thanaList) {
            if (item.districtName == district.districtName) {
                thanas.add(item)
            }
        }

        val recyclerView: RecyclerView = binding.thanaRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        thanaAdapter = ThanaAdapter(thanas)
        recyclerView.adapter = thanaAdapter
    }
}