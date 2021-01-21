package com.example.a2020greatmanbelt.fragment

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.a2020greatmanbelt.R
import com.example.a2020greatmanbelt.data.NameEntity
import com.example.a2020greatmanbelt.data.UserViewModel
import kotlinx.android.synthetic.main.fragment_main_gragment.*
import kotlinx.android.synthetic.main.fragment_main_gragment.view.*


class MainGragment : Fragment() {


    private lateinit var mUserViewModel: UserViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main_gragment, container, false)

        mUserViewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        view.StartBtn.setOnClickListener(){
            insertDataToDatabase()
        }
        return view
    }

    private fun insertDataToDatabase(){
        val name = edittext_name.text.toString()

        if(inputCheck(name)){
            //create user object
            val user = NameEntity(0, name)
            //add data to database
            mUserViewModel.addUser(user)
            Toast.makeText(requireContext(), "사용자 설정 완료", Toast.LENGTH_LONG).show()
            // navigate back
            findNavController().navigate(R.id.action_mainGragment_to_checklist)
        }else{
            Toast.makeText(requireContext(), "이름을 입력해 주세요!", Toast.LENGTH_LONG).show()
        }
    }

    private fun inputCheck(name:String):Boolean{
        return !(TextUtils.isEmpty(name))
    }

}