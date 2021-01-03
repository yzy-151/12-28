package com.example.uiwidgettest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
class MainActivity2 : AppCompatActivity(),View.OnClickListener{
    var imageView:ImageView?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        imageView=findViewById(R.id.imageView)
        val button5:Button = findViewById(R.id.button5)
        button5.setOnClickListener {
            finish()
        }
    }


    override fun onClick(v: View?) {

        when(v?.id){
            R.id.button8->{
                imageView?.setImageResource(R.drawable.saber001)
            }
        }
    }


}