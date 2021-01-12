package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class gameresult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gameresult)
        val try_again: Button = findViewById(R.id.try_again)
        val c_result: ImageView = findViewById(R.id.computerresult)
        val u_result:ImageView = findViewById(R.id.userresult)

        val result: TextView = findViewById(R.id.result)
        val computer: Int = intent.getIntExtra("result", -1)
        val user: Int = intent.getIntExtra("user", -1)
        if (computer == 0)
            c_result.setImageResource(R.drawable.rock)
        else if (computer == 1)
            c_result.setImageResource(R.drawable.paper)
        else if (computer == 2)
            c_result.setImageResource(R.drawable.scissors)

        if (user == 0)
            u_result.setImageResource(R.drawable.rock)
        else if (user == 1)
            u_result.setImageResource(R.drawable.paper)
        else if (user == 2)
            u_result.setImageResource(R.drawable.scissors)

        if (user == computer)
            result.setText("DRAW")
        else if ((user == 2 && computer == 1) || (user == 1 && computer == 0) || (user == 0 && computer == 2))
            result.setText("WIN")
        else if ((user == 1 && computer == 2) || (user == 0 && computer == 1) || (user == 2 && computer == 0))
            result.setText("LOSE")

        try_again.setOnClickListener {
            val intent = Intent(this@gameresult, gamestart::class.java)
            startActivity(intent)
        }
    }
}