package com.example.quizzy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Btn_start= findViewById<Button>(R.id.Btn_start)
        var ed_name=findViewById<EditText>(R.id.ed_name)
        Btn_start.setOnClickListener{
            if (ed_name.text.toString().isEmpty()){
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,QuizQActivity::class.java)
                intent.putExtra(Constants.USER_NAME, ed_name.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}