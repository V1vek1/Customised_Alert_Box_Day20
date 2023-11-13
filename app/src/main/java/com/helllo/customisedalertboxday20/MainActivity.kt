package com.helllo.customisedalertboxday20

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    //Create a Variable of type Dialog
    //Dialog ek Class h joki int, Float sabhi type ka hota h

    lateinit var dialog: Dialog  //Yha maine ek "dialog" name ka Variable bnaya joki Code me Baad me use hoga

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Yha maine "lateinit" vale "dialog" Variable ko Call kiya h Or usme bahut si chizjhe assign kiya
        dialog = Dialog(this)
        dialog.setContentView(R.layout.cutom_dialogue)

        //maine "dialog" variable me ek bacground add karne keliye uska Size liya or phir isko background me set
        //karne ke liye uska Address likha jha per background h
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_alert_box))


        var myButton = findViewById<Button>(R.id.btnClick)
        myButton.setOnClickListener {
            dialog.show()
        }



        //Yha mai Variable 2 Button bna rha hu, "custom_dialogue.xml" se call honge ya use honge
        var buttonGood = dialog.findViewById<Button>(R.id.btnGood)
        var buttonFeedback = dialog.findViewById<Button>(R.id.btnFeedback)

        buttonGood.setOnClickListener {
            dialog.dismiss()
        }

        buttonFeedback.setOnClickListener {
            //yha ta yo mai koi intent add kardu ya koi toast Add kardu, per mai abhi kuch add nahi kar rha hu
        }
        
    }
}