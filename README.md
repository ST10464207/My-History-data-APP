# My-History-data-APP
I have designed an APP called : My history data
YouTube video Link:
https://youtu.be/b4qzHujvVik
the data that is collected is that of Heroes in the timeline of our word history- individual who have played great roles in our lives.
namely-Nkosi Johnson,steve Biko,martin luther king,adolf hitler,diana princess of wales,albert einstein,nelson rolihlahla mansela,mother theresa,michael jackson and mahatma gandhi.
the data includes the spesic age in which these icon passed away.

with all this data collected we come to the main purpose of the APP ,which is to compare an indivividual/student's age and see whether in our data there is an icon that passed away at that spesific age.
e.g Tom is 12 years old in our APP we enter 12 in our text name and click generate(button) to see results.
![Screenshot_20240912_204411](https://github.com/user-attachments/assets/0c077a44-5e1b-4205-be0c-52b0925d5027)

herin example age12=results "You are age 12,Nkosi J" +
                            "ohnson died at this age "
when no results or that spesific amount can be shown our APP will display "No historical known at this age"
the display of the APP ( USER INTERFACE) played a very important report in the design of this APP, hence its for students.
it therefore needs to serve good presentation engage with the student. the people using the APP should enjoy using the APP pleasure ( user experience) needs to be met
It’s believed that the average person uses nine apps per day or around 30 per month.

But why do we love apps so much? And, really, what is the purpose of an app in the first place?
we use APPS to make our lives Easier, instead  of reading multiple books one can use this APP and get reults with just a click to a button making them very convenient by adding value to our lives.
To Educate educated through a small device in your pocket is a life saver to any student thus mobile apps serve as wonderful educational tools.
You can learn languages, strengthen your coding skills, take online courses, and far more.

When it comes to Entertain

Mobile apps have fundamentally altered the ways in which we consume entertainment.
And with phones becoming increasingly powerful, audiences have more entertainment options to choose from. Now, full-on PC and console games like Fortnite or PlayerUnknown’s Battlegrounds are available on mobile devices. e.g Audio books on History
this APP will aids in student productivity
“
GitHub Education is a fantastic opportunity for students to build solid communities. The program offers awesome tools like the GitHub Student Developer Pack and helps shape great leaders with the Campus Experts Program. If you make the most of these resources, you’re in for some amazing opportunities! 

Toukir Khan
GitHub Campus Expert | CSE Undergrad 24'


steps follwed in the design
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

steps followed in the design of the user interface
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/material_dynamic_neutral_variant50"
    android:textAlignment="textStart"
    tools:context=".MainActivity"
    tools:ignore="ExtraText">

    <TextView
        android:id="@+id/textView"
        android:layout_width="384dp"
        android:layout_height="141dp"

        android:background="@drawable/history"
        android:text="History Data APP"
        android:textAlignment="center"
        android:textSize="60sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.116" />

    <EditText
        android:id="@+id/editT3"
        android:layout_width="252dp"
        android:layout_height="59dp"
        android:layout_marginStart="20dp"
        android:layout_marginTop="20dp"
        android:layout_marginEnd="20dp"
        android:layout_marginBottom="20dp"
        android:autofillHints=""
        android:ems="10"
        android:hint="Enter Age:"
        android:inputType="number"
        android:textColor="@color/white"
        android:textColorHint="@color/white"
        android:textSize="15sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.495"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.308" />

    <Button
        android:id="@+id/buttonG"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Generate History"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.152"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.459" />

    <EditText
        android:id="@+id/TEXTSHOWB"
        android:layout_width="358dp"
        android:layout_height="85dp"
        android:layout_marginStart="40dp"
        android:autoText="false"
        android:background="@color/material_dynamic_neutral90"
        android:ems="10"
        android:freezesText="false"
        android:hint="Results"

        android:inputType="text"
        android:textAlignment="center"
        android:textSize="14sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.614"
        app:layout_wrapBehaviorInParent="skipped" />

    <Button
        android:id="@+id/buttonC"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="272dp"
        android:text="Clear"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.459" />
    />

</androidx.constraintlayout.widget.ConstraintLayout>

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
        val va = 30


        buttonG.setOnClickListener {

            val getname = editText.text.toString()
            textView.setText(getname)

            if (getname.isNotEmpty()) {
                val amount = getname.toInt()

                if (amount == value) {
                    textView.text = "You are age 12,Nkosi J" +
                            "ohnson died at this age "
                }

             else
                textView.text = "No historical known at this age"

        }
    }



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

What Is the Purpose of an App?

Let’s bring things back to the beginning. What’s the purpose of an app?
Well, as you can see, there isn’t only one answer. Apps can help us in our everyday lives, allow us to work in smarter ways, or just stay entertained with the latest games.
It’s astounding how far mobile apps have come. And, if recent trends are any indication, things are only going to get more impressive. Bob Buskirk(2019)

after the design of my app - by going through step by step of designing an app and ensuring that my emulator works hand in hand with the main activity and activity main are linked.
i then went through the process of having to commit and push the app to GITHUB-platform for hosting and collaborating on code repositories. It is used to control, code review, and collaboration for version control.Emma Witman(2021)
According to Emma Witman 2021 "Version control is an important system when it comes to coding. It enables coders to be nimble with programming, and allows for apps to constantly have new version releases, expansion to other platforms, and bug fixes, among other tracked changes.

Version control systems like Git help maintain the integrity and security of ever-evolving code by safeguarding modifications, and those revisions are then hosted by GitHub, or an alternative "repository" hosting service — although GitHub is the most popular among developers.
This allows developers to easily collaborate, allowing them to download a new version of the software, make changes, and upload the newest revision. Every developer can see these new changes, download them, and contribute".

 
