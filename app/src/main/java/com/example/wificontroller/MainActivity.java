package com.example.wificontroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.net.wifi.WifiManager;
import android.content.Context;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        WifiManager wifiManager = (WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        if(wifiManager.isWifiEnabled()){
            wifiManager.setWifiEnabled(false);
            Toast.makeText(this, "Wi-Fi Turned OFF",Toast.LENGTH_LONG).show();
        }
        else{
            wifiManager.setWifiEnabled(true);
            Toast.makeText(this, "Wi-Fi may take a moment to turn on",Toast.LENGTH_LONG).show();
        }
        finish();
    }
}