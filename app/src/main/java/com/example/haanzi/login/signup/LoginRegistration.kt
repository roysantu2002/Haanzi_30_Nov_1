package com.example.haanzi.login.signup


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders

import com.example.haanzi.R
import com.example.haanzi.databinding.FragmentLoginRegistrationBinding

/**
 * A simple [Fragment] subclass.
 */
class LoginRegistration : Fragment() {

    private lateinit var loginViewM : LoginViewModel
    private lateinit var binding: FragmentLoginRegistrationBinding

    //Inflating and Returning the View with DataBindingUtil
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login_registration, container, false)


        loginViewM = ViewModelProviders.of(this).get(LoginViewModel::class.java)
        Log.i("GameViewModel", "loginViewM.tag_txt")

        return binding.root

    }


}
