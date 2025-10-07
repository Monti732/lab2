package com.example.attributes

import android.graphics.Color
import android.os.Bundle
import android.util.TypedValue
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.textBox)
        val buttonBlackText = findViewById<Button>(R.id.button_blackText)
        val buttonRedText = findViewById<Button>(R.id.button_redText)
        val buttonSize8sp = findViewById<Button>(R.id.button_size8sp)
        val buttonSize24sp = findViewById<Button>(R.id.button_size24sp)
        val buttonWhiteBackground = findViewById<Button>(R.id.button_whiteBackground)
        val buttonYellowBackground = findViewById<Button>(R.id.button_yellowBackground)

        buttonBlackText.setOnClickListener {
            editText.setTextColor(Color.BLACK)
        }

        buttonRedText.setOnClickListener {
            editText.setTextColor(Color.RED)
        }

        buttonSize8sp.setOnClickListener {
            editText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 8.toFloat())
        }

        buttonSize24sp.setOnClickListener {
            editText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24.toFloat())
        }

        buttonWhiteBackground.setOnClickListener {
            editText.setBackgroundColor(Color.WHITE)
        }

        buttonYellowBackground.setOnClickListener {
            editText.setBackgroundColor(Color.YELLOW)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}