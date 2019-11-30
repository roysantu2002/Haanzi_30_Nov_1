package com.example.haanzi.common

import android.net.Uri
import android.util.Log
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.firebase.storage.FirebaseStorage
import java.util.*

class CommonFunction {


    lateinit var manager: FragmentManager
    lateinit var toolbar: Toolbar


    fun setFragment(fragment: Fragment, lable: String) {
        toolbar.title = lable
        // manager = supportFragmentManager
        // val transaction = manager.beginTransaction()
        // transaction.replace(R.id.main_frame,fragment)
        // transaction.addToBackStack(null)
        //     .commit()


    }

    fun uploadImgToFirebase(Uri: Uri?, storage: FirebaseStorage) {
        if(Uri == null) return
        val fileName = UUID.randomUUID().toString()
        val ref = storage.getReference("/images/$fileName")
        ref.putFile(Uri!!)
            .addOnSuccessListener {
                Log.e("Commonfunction", "uploaded")
            }

    }
}