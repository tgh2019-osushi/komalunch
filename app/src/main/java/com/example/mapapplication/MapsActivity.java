package com.example.mapapplication;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Locale;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        test0();

    }

    private void test0(){

        // 起点
        //String start = "駒場 ５号館";
        //String mid = "駒場　７号館";

        // 目的地
        //String destination = "マクドナルド 駒場東大前店";

        // 移動手段：電車:r, 車:d, 歩き:w
        String[] dir = {"r", "d", "w"};

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setClassName("com.google.android.apps.maps",
                "com.google.android.maps.MapsActivity");

        // 出発地, 目的地, 交通手段
        String str = String.format(Locale.US,
                "http://www.google.com/maps/dir/%s/%s/%s/dirflg=%s",
                "駒場 ５号館", "マクドナルド 駒場東大前店","駒場 ７号館", dir[1]);

        intent.setData(Uri.parse(str));
        startActivity(intent);

    }

    // 緯度経度を入れて経路を検索
    private void test1(){
        // 起点の緯度経度
        String src_lat = "35.661140";
        String src_ltg = "139.684286";



        // 目的地の緯度経度
        String des_lat = "35.658828";
        String des_ltg = "139.683296";

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);

        intent.setClassName("com.google.android.apps.maps",
                "com.google.android.maps.MapsActivity");

        // 起点の緯度,経度, 目的地の緯度,経度
        String str = String.format(Locale.US,
                "https://www.google.com/maps/dir/Tokyo+Station,+1+Chome+Marunouchi,+Chiyoda+City,+Tokyo/The+University+of+Tokyo,+7+Chome-3-1+Hongo,+Bunkyo+City,+Tokyo+113-8654/Tokyo+Tower,+4+Chome-2-8+Shibakoen,+Minato+City,+Tokyo+105-0011/@35.6856936,139.7215856,13z/data=!3m1!4b1!4m20!4m19!1m5!1m1!1s0x60188bfbd89f700b:0x277c49ba34ed38!2m2!1d139.7671248!2d35.6812362!1m5!1m1!1s0x60188c2ffa206ea3:0x30e407498313ba95!2m2!1d139.761989!2d35.7126775!1m5!1m1!1s0x60188bbd9009ec09:0x481a93f0d2a409dd!2m2!1d139.7454329!2d35.6585805!3e2",
                src_lat, src_ltg, des_lat, des_ltg);

        intent.setData(Uri.parse(str));
        startActivity(intent);
    }
    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
//        LatLng sydney = new LatLng(35.659854, 139.68465);
//        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Komaba"));
//        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
//        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 16));
//
        LatLng tokyo = new LatLng(35.659854, 139.68465);
        mMap.addMarker(new MarkerOptions().position(tokyo).title("東京駅です！"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tokyo, 15));

    }

}
