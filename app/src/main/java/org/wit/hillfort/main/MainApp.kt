package org.wit.hillfort.main

import android.app.Application
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.wit.hillfort.models.HillfortModel

class MainApp : Application(), AnkoLogger {

    //Creating an arraylist of hillforts
    val hillforts = ArrayList<HillfortModel>()
    override fun onCreate(){
        super.onCreate()
        info("Hillfort Started")
        //hillforts.add(HillfortModel("One", "About one..."))
        //hillforts.add(HillfortModel("Two", "About two..."))
        //hillforts.add(HillfortModel("Three", "About three..."))
    }
}