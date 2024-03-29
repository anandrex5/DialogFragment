package com.company0ne.dialogfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.DialogFragment


class MyDialogFragment : DialogFragment() {

    lateinit var name: EditText
    lateinit var age: EditText
    lateinit var cancel: Button
    lateinit var ok: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_my_dialog, container, false)

        name = view.findViewById(R.id.editTextName)
        age = view.findViewById(R.id.editTextAge)
        cancel = view.findViewById(R.id.buttonCancel)
        ok = view.findViewById(R.id.buttonOk)

        //for transparency
        dialog!!.window!!.setBackgroundDrawableResource(android.R.color.transparent)

        ok.setOnClickListener {
            val userName: String = name.text.toString()
            val userAge: Int = age.text.toString().toInt()

            //access data from mainActivity using getUserData()
            val mainActivity: MainActivity = activity as MainActivity
            mainActivity.getUserData(userName, userAge)
            dialog!!.dismiss()
        }
        cancel.setOnClickListener {
            dialog!!.dismiss()
        }
        // Inflate the layout for this fragment
        return view
    }
}