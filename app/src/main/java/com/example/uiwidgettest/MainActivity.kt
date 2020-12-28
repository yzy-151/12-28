package com.example.uiwidgettest

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            Toast.makeText(this, "nothing happend", Toast.LENGTH_SHORT).show()
        }
        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.bilibili.com/anime")
            startActivity(intent)
        }
        val activity3:Button =findViewById(R.id.button4)
        activity3.setOnClickListener {
            val intent =Intent(this,MainActivity3::class.java)
            startActivity(intent)

        }
        val button6: Button = findViewById(R.id.button6)
        button6.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)         //action-dial安卓系统内置动作
            intent.data = Uri.parse("tel:10086")            //data部分指定协议为tel
            startActivity(intent)
        }
    }
}