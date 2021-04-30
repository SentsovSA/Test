package com.geekbrains.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = DataTest("red", 21)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Toast.makeText(this, "Color: ${data.color}, age: ${data.age}", Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "ObjectTest: ${ObjectTest.objectTestConst}", Toast.LENGTH_SHORT).show()
        }
        val array = arrayOf(0, 1, 2, 3, 4, 5, 6)

        for (i in array){
            if(array[i] % 2 == 1){
                Toast.makeText(this, "ArrayTest: ${array[i]}", Toast.LENGTH_SHORT).show()
            }
        }
        for(i in 9 downTo 0 step 3){
            Toast.makeText(this, "ForTest: LOL", Toast.LENGTH_SHORT).show()
        }
    }
}