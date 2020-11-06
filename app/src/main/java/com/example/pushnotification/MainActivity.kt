package com.example.pushnotification

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.messaging.FirebaseMessaging
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getTokenFromFirebase()
    }

    private fun getTokenFromFirebase() {
        FirebaseMessaging.getInstance().token.addOnCompleteListener { task ->

            if (task.isSuccessful) {

                val token = task.result

                txtToken.text = token

                Log.d("FirebaseToken", token)
            }
        }
    }
}