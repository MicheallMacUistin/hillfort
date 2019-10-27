package org.wit.hillfort

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hillfort.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast

class HillfortActivity : AppCompatActivity(), AnkoLogger {  //Includes AnkoLogger feature

    override fun onCreate(savedInstanceState: Bundle?) {
        info("Hillfort Activity started")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hillfort)

        //Event handler for button
        btnAdd.setOnClickListener() {
            val hillfortTitle = hillfortTitle.text.toString()
            if (hillfortTitle.isNotEmpty()) {
                info("add Button Pressed: $hillfortTitle")
            }
            else {
                //Will ask for entry if left blank
                toast ("Please Enter a title")
            }
        }
    }
}
