package com.altun.lecture2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val n = randomGenerator()
            if (n){
                toastMessage("Even")
            }
            else{
                toastMessage("Odd")
            }
        }


    }


    fun randomGenerator(): Boolean{
        val randomNumber: Int = (1..101).random()

        return randomNumber % 2 == 0
    }

    fun toastMessage(msg :String){
        Toast.makeText(this,"This number is " + msg +" :))",Toast.LENGTH_SHORT).show()
    }

}
