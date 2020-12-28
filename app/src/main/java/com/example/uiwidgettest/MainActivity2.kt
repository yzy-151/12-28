package com.example.uiwidgettest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
class MainActivity2 : AppCompatActivity(),View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button5:Button = findViewById(R.id.button5)
        button5.setOnClickListener {
            finish()
        }
    }
    val imageView:ImageView=findViewById(R.id.imageView)
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.button8->{
                imageView.setImageResource(R.drawable.saber001)
            }
        }
    }


}