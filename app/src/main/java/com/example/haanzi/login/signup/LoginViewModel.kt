package com.example.haanzi.login.signup

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    val tag_txt = MutableLiveData<String>()
    //val SIGN_IN_REQUEST_CODE = 1001

    init{

        tag_txt.value = "Initial Value"
        //Log.i("GameViewModel", "loginViewM.tag_txt")

    }

}