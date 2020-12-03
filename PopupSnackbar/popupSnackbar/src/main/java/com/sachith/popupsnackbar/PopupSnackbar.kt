package com.sachith.popupsnackbar

import android.content.Context
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar

class PopupSnackbar {

    fun snackBar(context: Context, view: View, message: String, type: Int){
        val snackBar = Snackbar.make(view, message, Snackbar.LENGTH_SHORT)
        val snackBarView: View = snackBar.view
        if(type == 2){
            snackBarView.setBackgroundResource(R.drawable.error_button)
        }else if(type == 0){
            snackBarView.setBackgroundResource(R.drawable.success_button)
        } else{
            snackBarView.setBackgroundResource(R.drawable.waiting_button)
        }
        snackBarView.setPadding(50,10,50,10)
        val params = snackBarView.layoutParams as FrameLayout.LayoutParams
        params.width = ViewGroup.LayoutParams.WRAP_CONTENT
        params.gravity = Gravity.CENTER_HORIZONTAL
        snackBarView.layoutParams = params
        snackBar.show()
    }

}