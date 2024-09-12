package com.example.myhistory

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText
    lateinit var buttonG: Button
    lateinit var buttonC: Button
    lateinit var textView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        editText = findViewById(R.id.editT3)
        buttonG = findViewById(R.id.buttonG)
        buttonC = findViewById(R.id.buttonC)
        textView = findViewById(R.id.TEXTSHOWB)

        val value = 12
        val  va =30


        buttonG.setOnClickListener {

            val getname = editText.text.toString()
            textView.setText(getname)

            if (getname.isNotEmpty()) {
                val amount = getname.toInt()

                if (amount == value) {
                    textView.text = "You are age 12,Nkosi J" +
                            "ohnson died at this age "


                        }
                    } else
                        textView.text = "No historical known at this age"




                // Toast.makeText( this,"please type",Toast.LENGTH_SHORT).show()

                //textView.setText(getname)
                // Toast.makeText( this,getname,Toast.LENGTH_SHORT).show()


                //on click of this button both textView and edit Text should be clear
                buttonC.setOnClickListener {

                    editText.text.clear()
                    textView.text = ""
                }
            }

        fun main (Args: Array<String>) {
            val value = 30
            val getname= when (value){
                30 -> "biko"

                else -> {}
            }

        }

        }
    }


