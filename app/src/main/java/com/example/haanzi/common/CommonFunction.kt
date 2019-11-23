package com.example.haanzi.common

import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.haanzi.R

class CommonFunction {

    lateinit var manager: FragmentManager
    lateinit var toolbar: Toolbar

    fun setFragment(fragment: Fragment, lable: String){
        toolbar.title = lable
       // manager = supportFragmentManager
       // val transaction = manager.beginTransaction()
       // transaction.replace(R.id.main_frame,fragment)
       // transaction.addToBackStack(null)
       //     .commit()


    }
}