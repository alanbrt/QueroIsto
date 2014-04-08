package com.org.util;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.org.blood.util.R;

import android.os.Bundle;

public class MapaSimples extends MapActivity{

	   @Override
	   public void onCreate(Bundle savedInstanceState) {
	       super.onCreate(savedInstanceState);
	       setContentView(R.layout.map);
	       
	       MapView mapView = (MapView) findViewById(R.id.map_view) ;
	       mapView.setClickable(true) ;
	        
	       MyLocationOverlay mlo = new MyLocationOverlay(this, mapView) ;
	       mlo.enableCompass() ;
	       mlo.enableMyLocation() ;
	       mapView.getOverlays().add(mlo) ;
	   }
	 
	   @Override
	   protected boolean isRouteDisplayed() {
	       return false;
	   }
	   
}
