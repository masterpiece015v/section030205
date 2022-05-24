package com.example.section030205

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spn = findViewById<Spinner>(R.id.spinner)

        spn.onItemSelectedListener = object:AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                Toast.makeText(
                    this@MainActivity,
                    "選択項目:${(p0 as Spinner).selectedItem}",
                    Toast.LENGTH_SHORT
                ).show()

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {}

        }
    }
}