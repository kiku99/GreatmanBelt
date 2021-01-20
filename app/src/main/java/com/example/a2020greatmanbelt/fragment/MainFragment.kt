package com.example.a2020greatmanbelt.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.a2020greatmanbelt.R
import kotlinx.android.synthetic.main.fragment_main_gragment.*
import kotlinx.android.synthetic.main.fragment_main_gragment.view.*


class MainGragment : Fragment() {


    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main_gragment, container, false)

        view.StartBtn.setOnClickListener(){
            findNavController().navigate(R.id.action_mainGragment_to_checklist)
        }

        return view
    }


}