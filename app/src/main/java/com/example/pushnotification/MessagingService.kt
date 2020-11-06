package com.example.pushnotification

import android.content.ContentValues.TAG
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MessagingService : FirebaseMessagingService() {

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)

        remoteMessage.let { message ->
            message.notification?.let {
                val messageTitle = it.title
                val messageBody = it.body
            }
        }
    }

    override fun onNewToken(pushToken: String) {
        pushToken.let {
            Log.d("MessagingService", "Refreshed token: $it")
        }
    }

}