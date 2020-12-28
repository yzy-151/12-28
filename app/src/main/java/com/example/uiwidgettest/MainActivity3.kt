package com.example.uiwidgettest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar

class MainActivity3 : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }
    var progressBar:ProgressBar=findViewById(R.id.progressBar)
    override fun onClick(v:View){
        when (v.id){
            R.id.button7->{
                progressBar.progress=progressBar.progress+10
            }
        }
    }
}