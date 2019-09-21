package com.example.mapapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class shop_info_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_info_activity);

<<<<<<< HEAD
        Button sendButton = findViewById(R.id.map_button);
        sendButton.setOnClickListener(new View.OnClickListener() {
=======

        Button nextButton = findViewById(R.id.next_button);
        nextButton.setOnClickListener(new View.OnClickListener() {
>>>>>>> 0f362bcebb539a5c8b38e7a5d00327f1a3b43359
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MapsActivity.class);
                // String message = "マクドナルド駒場東大前店";
                // intent.putExtra(EXTRA_MESSAGE,message);
                startActivity(intent);
            }
        });
    }

}
