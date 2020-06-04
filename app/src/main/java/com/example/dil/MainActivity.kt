package com.example.dil


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Anadiller = resources.getStringArray(R.array.AnaDil)

        // access the spinner
        val AnaDilspinner = findViewById<Spinner>(R.id.AnaSpinner)
        if ( AnaDilspinner != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, Anadiller)
            AnaDilspinner.adapter = adapter

            AnaDilspinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@MainActivity,
                        getString(R.string.Secili_İtem) + " " +
                                "" + Anadiller[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }
        val Ogrdil = resources.getStringArray(R.array.OgrDil)

        // access the spinner
        val Ogrspinner = findViewById<Spinner>(R.id.OgrSpinner)
        if (Ogrspinner != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, Ogrdil)
            Ogrspinner.adapter = adapter

            Ogrspinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@MainActivity,
                        getString(R.string.Secili_İtem) + " " +
                                "" + Ogrdil[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }

    }
}
