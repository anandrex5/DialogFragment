package com.company0ne.dialogfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    private lateinit var show: Button
    private lateinit var name: TextView
    private lateinit var age: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        show = findViewById(R.id.buttonShow)
        name = findViewById(R.id.textViewName)
        age = findViewById(R.id.textViewAge)

        show.setOnClickListener {

            val fragmentManager: FragmentManager = supportFragmentManager
            //create an Object
            val myDialogFragment = MyDialogFragment()

            //when we click on emptySpace the dialog fragment is closed that's why we add this line
            myDialogFragment.isCancelable = false
            myDialogFragment.show(fragmentManager, "myDialogFragment")
        }
    }
    //create an function and give parameter which we want to show
    fun getUserData(userName: String, userAge: Int) {
        name.text = "Name: $userName"
        age.text = "Age: $userAge"
    }
}