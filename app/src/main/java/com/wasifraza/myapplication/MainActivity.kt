package com.wasifraza.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val btn: Button = findViewById(R.id.btn)

        btn.setOnClickListener {
            // Do something in response to button click
            var rMeat:RadioGroup= findViewById(R.id.rMeat)
            var meat=rMeat.checkedRadioButtonId
            var me=findViewById<RadioButton>(meat)

            var cheese:CheckBox= findViewById(R.id.cheese)
            var ch=cheese.isChecked
            var onions:CheckBox= findViewById(R.id.onions)
            var on=onions.isChecked
            var salad:CheckBox= findViewById(R.id.salad)
            var sa=salad.isChecked
            var ord="You ordered:\n"+
                    "${me.text}"+
                    (if(ch)"\nCheese" else "")+
                    (if(sa)"\nSalad" else "")+
                    (if(on)"\nOnions" else "")
            var tV:TextView= findViewById(R.id.tV)
            tV.setText(ord)





        }


    }


}