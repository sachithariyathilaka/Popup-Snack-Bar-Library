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
        var color = 0
        val snackBar = Snackbar.make(view, message, Snackbar.LENGTH_SHORT)
        if(type == 0){
           color == R.color.colorSuccess
        } else if(type == 1){
            color = R.color.colorWaiting
        } else {
            color = R.color.colorError
        }
        snackBar.setBackgroundTint(ContextCompat.getColor(context, color))
        val snackBarView: View = snackBar.view
        if(color == R.color.colorError){
            snackBarView.setBackgroundResource(R.drawable.error_button)
        }else if(color == R.color.colorSuccess){
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