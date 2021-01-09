package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class gamestart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gamestart)

        val rock: ImageView = findViewById(R.id.rock)
        val paper:ImageView = findViewById(R.id.paper)
        val scissors:ImageView = findViewById(R.id.scissors)
        val result:TextView = findViewById(R.id.result)
        val try_again:Button = findViewById(R.id.try_again)
        val tomain:ImageView = findViewById(R.id.tomain)
        var random = Random()
        var num = random.nextInt(3) // 0: rock, 1: paper, 2: scissors

        rock.setOnClickListener{
            if(num == 0)
                result.setText("DRAW")
            else if(num == 1)
                result.setText("LOSE")
            else if(num == 2)
                result.setText("WIN")
        }
        scissors.setOnClickListener{
            if(num == 0)
                result.setText("LOSE")
            else if(num == 1)
                result.setText("WIN")
            else if(num == 2)
                result.setText("DRAW")
        }
        paper.setOnClickListener{
            if(num == 0)
                result.setText("WIN")
            else if(num == 1)
                result.setText("DRAW")
            else if(num == 2)
                result.setText("LOSE")
        }

        try_again.setOnClickListener {
            result.setText("RESULT")
            val intent = Intent(this@gamestart, gamestart::class.java)
            startActivity(intent)
        }
        tomain.setOnClickListener{
            val intent2 = Intent(this@gamestart, MainActivity::class.java)
            startActivity(intent2)
        }
    }
}