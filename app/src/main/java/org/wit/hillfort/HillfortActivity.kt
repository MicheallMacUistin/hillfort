package org.wit.hillfort

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

class HillfortActivity : AppCompatActivity(), AnkoLogger {  //Includes AnkoLogger feature

    override fun onCreate(savedInstanceState: Bundle?) {
        info("Hillfort Activity started")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hillfort)
    }
}
