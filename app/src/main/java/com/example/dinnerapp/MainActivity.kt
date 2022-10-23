package com.example.dinnerapp

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {
    var foods: ArrayList<String> =
        ArrayList(Arrays.asList("Hamburger", "Pizza", "Mexican", "American", "Chinese"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addListenerOnButton();
        addListenerOnButtonReccomend()
    }
    fun addListenerOnButton() {
        var edittext1 = findViewById<EditText>(R.id.editText1)
        var buttonSum = findViewById(R.id.button) as Button
        print(edittext1)
        buttonSum.setOnClickListener {
            val value1 = edittext1.text.toString()
            foods.add(value1)
            edittext1.getText().clear();
            //Toast.makeText(applicationContext, foods.get(foods.lastIndex).toString(), Toast.LENGTH_LONG).show()
        }
    }
    fun addListenerOnButtonReccomend() {

        var buttonRand = findViewById(R.id.button1) as Button
        //print(text1)
        buttonRand.setOnClickListener {
            var text1 = foods.random()
            val toast = Toast.makeText(applicationContext, text1.toString(), Toast.LENGTH_LONG)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()

        }
    }
}