package com.example.app02tutor

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {      // Это главный экран Android-приложения. AppCompatActivity — базовый класс, от которого наследуются все активности (экраны)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val label = findViewById<TextView>(R.id.main_label)
        val userData: EditText = findViewById(R.id.user_data)
        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {         // Когда пользователь нажимает на кнопку, срабатывает setOnClickListener
            val text = userData.text.toString().trim()      // Приложение берёт текст из поля userData, превращает в строку и убирает пробелы (trim()).
            if (text =="toast")
                //Если пользователь ввёл "toast", показывается всплывающее сообщение:
                Toast.makeText(this, "User enter toast", Toast.LENGTH_SHORT).show()     //Это маленькое уведомление на экране.
            else
                label.text = text
        }
    }
}
