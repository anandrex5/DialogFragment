# DialogFragment
When the user opens the app the DialogFragment Button will Appears, when he clicks the button the DialogFragment will open 
which takes Name, and Age as input, and displays to MainActivity's TextViews



--------------------------------------NOTE ---------------------------------------------------------------
/*There is an issue in DialogFragment when a user doesn't give any input to the dialog fragment and clicks on the Ok button 
the app is gonna crashed.So, Replace this code with the main code of the MyDialogFragment class - 

 ok.setOnClickListener {
            val userName: String = name.text.toString()
            val userAge: String = age.text.toString()
            
     if (userName.isEmpty() || userAge.isEmpty()) {
                Toast.makeText(activity, "Please Enter Details", Toast.LENGTH_SHORT).show()
            } else {
                val userAge: Int = userAge.toInt()
                // access data from MainActivity using getUserData()
                val mainActivity: MainActivity = activity as MainActivity
                mainActivity.getUserData(userName, userAge)
                dialog!!.dismiss()
            }
        }
        cancel.setOnClickListener {
            dialog!!.dismiss()
        }
        // Inflate the layout for this fragment
        return view
    }}



*/
