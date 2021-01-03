package com.example.uiwidgettest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar

class MainActivity3 : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val button9:Button=findViewById(R.id.button9)
        button9.setOnClickListener {
            finish()
        }
    }
    override fun onClick(v:View){
        val progressBar:ProgressBar=findViewById(R.id.progressBar)
        when (v.id){
            R.id.button7->{
                progressBar.progress=progressBar.progress+10
            }
        }
    }
}