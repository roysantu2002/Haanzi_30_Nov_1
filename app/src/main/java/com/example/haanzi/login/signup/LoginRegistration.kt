package com.example.haanzi.login.signup


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.haanzi.R
import com.example.haanzi.databinding.FragmentLoginRegistrationBinding
import com.example.haanzi.globvar.VarClass


private const val TAG = "LoginRegistration"

class LoginRegistration : Fragment() {

    private lateinit var loginViewM: LoginViewModel
    //private lateinit var mainPage:
    private lateinit var binding: FragmentLoginRegistrationBinding

    private lateinit var varGlo: VarClass

    //Inflating and Returning the View with DataBindingUtil
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_login_registration,
            container,
            false
        )


        loginViewM = ViewModelProviders.of(this).get(LoginViewModel::class.java)
        Log.i("GameViewModel", "loginViewM.tag_txt")

        val image_view = (binding.uploadImage) as ImageView
        //on image click
        //binding.uploadImage
        //binding.logo.se
        image_view.setOnClickListener { launchGallery() }

        // btn_upload_image.setOnClickListener { uploadImage() }

        return binding.root

    }

    private fun launchGallery() {
        Log.d(TAG, "Camera")

        val intent = Intent(Intent.ACTION_PICK)

        // val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
       // startActivityForResult(Intent.createChooser(Intent.createChooser(intent, "Select Picture"), 71)
        startActivityForResult(intent, 1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == 1 && resultCode == Activity.RESULT_OK && data!= null){

            val uri = data.data

            binding.logo.setImageURI(uri)

          //  val image = (binding.logo) as AppCompatImageView
           // image.setImageResource(binding.logo.setImageURI(uri))
           // val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, uri)

        }
    }


}
