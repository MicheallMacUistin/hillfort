package org.wit.hillfort.views.map

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.Marker
import org.wit.hillfort.R
import kotlinx.android.synthetic.main.activity_hillfort_map.*
import kotlinx.android.synthetic.main.activity_hillfort_map.*
import kotlinx.android.synthetic.main.content_hillfort_map.*
import org.wit.hillfort.helpers.readImageFromPath
import org.wit.hillfort.models.HillfortModel
import org.wit.placemark.views.map.HillfortMapPresenter

class HillfortMapView : AppCompatActivity(), GoogleMap.OnMarkerClickListener {

    lateinit var presenter: HillfortMapPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hillfort_map)
        setSupportActionBar(toolbar)
        presenter = HillfortMapPresenter(this)

        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync {
            presenter.doPopulateMap(it)
        }
    }

    fun showHillfort(hillfort: HillfortModel) {
        currentTitle.text = hillfort.title
        currentDescription.text = hillfort.description
        currentImage.setImageBitmap(readImageFromPath(this, hillfort.image))
    }

    override fun onMarkerClick(marker: Marker): Boolean {
        presenter.doMarkerSelected(marker)
        return true
    }

    override fun onDestroy() {
        super.onDestroy()
        mapView.onDestroy()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView.onLowMemory()
    }

    override fun onPause() {
        super.onPause()
        mapView.onPause()
    }

    override fun onResume() {
        super.onResume()
        mapView.onResume()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        mapView.onSaveInstanceState(outState)
    }
}


