package org.wit.hillfort.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hillfort.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast
import org.wit.hillfort.R
import org.wit.hillfort.models.HillfortModel

class HillfortActivity : AppCompatActivity(), AnkoLogger {  //Includes AnkoLogger feature

    //Creating a hillfort as a class member
    var hillfort = HillfortModel()
    //Creating an arraylist of hillforts
    var hillforts = ArrayList<HillfortModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hillfort)

        //Event handler for button
        btnAdd.setOnClickListener() {
            hillfort.title = hillfortTitle.text.toString()
            hillfort.description = description.text.toString()
            if (hillfort.title.isNotEmpty()) {
                hillforts.add(hillfort.copy())
                info("add Button Pressed: $hillfort")
                for(i in hillforts.indices){
                    info("Hillfort[$i]:${this.hillforts[i]}")
                }
            }
            else {
                //Will ask for entry if left blank
                toast ("Please Enter a title")
            }
        }
    }
}
