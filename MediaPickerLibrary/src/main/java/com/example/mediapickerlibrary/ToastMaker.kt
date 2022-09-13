package com.example.mediapickerlibrary

import android.content.Context
import android.widget.Toast

class ToastMaker {
    companion object {
        fun makeToast(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
    }
}