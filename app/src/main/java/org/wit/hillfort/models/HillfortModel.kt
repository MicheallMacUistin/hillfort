package org.wit.hillfort.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import androidx.room.Entity
import androidx.room.PrimaryKey

//Field references
@Parcelize
@Entity
data class HillfortModel(@PrimaryKey(autoGenerate = true)var id: Long =0,
                         var title: String="",
                         var description: String="",
                         var image: String = "",
                         var lat : Double = 0.0,
                         var lng : Double = 0.0,
                         var zoom: Float = 0f) : Parcelable

@Parcelize
data class Location(var lat : Double = 0.0,
                    var lng: Double = 0.0,
                    var zoom: Float = 0f) : Parcelable


