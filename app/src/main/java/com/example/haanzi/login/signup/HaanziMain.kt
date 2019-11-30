package com.example.haanzi.login.signup


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController

import com.example.haanzi.R
import com.example.haanzi.databinding.FragmentHaanziMainBinding

/**
 * A simple [Fragment] subclass.
 */
class HaanziMain : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentHaanziMainBinding>(inflater, R.layout.fragment_haanzi_main, container, false)


        //The complete onClickListener with Navigation
 /*       binding.loginBtn.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.LoginRegistration)
        }*/

        //The complete onClickListener with Navigation using createNavigateOnClickListener
        //Sign Up
        binding.signupBtn.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_haanziMain_to_loginRegistration))

        //Login
        binding.loginBtn.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_haanziMain_to_login))


        return binding.root
    }
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_haanzi_main, container, false)
    }


