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
        val paper: ImageView = findViewById(R.id.paper)
        val scissors: ImageView = findViewById(R.id.scissors)
        val tomain: ImageView = findViewById(R.id.tomain)
        var random = Random()
        var num = random.nextInt(3) // 0: rock, 1: paper, 2: scissors
        val intent = Intent(this@gamestart, gameresult::class.java)
        intent.putExtra("result", num)
        rock.setOnClickListener {
            intent.putExtra("user", 0)
            startActivity(intent)
        }
        scissors.setOnClickListener {
            intent.putExtra("user", 2)
            startActivity(intent)
        }
        paper.setOnClickListener {
            intent.putExtra("user", 1)
            startActivity(intent)
        }
        tomain.setOnClickListener {
            val intent2 = Intent(this@gamestart, MainActivity::class.java)
            startActivity(intent2)
        }
    }
}