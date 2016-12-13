package com.ctm.noassemblyrequired;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {
    Button dresser, bike, deck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button dresser = (Button) findViewById(R.id.btnDresser);
        Button bike = (Button) findViewById(R.id.btnBike);
        Button deck = (Button) findViewById(R.id.btnDeck);
        dresser.setOnClickListener(bDresser);
        bike.setOnClickListener(bBike);
        deck.setOnClickListener(bDeck);
    }

    Button.OnClickListener bDresser = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, DresserActivity.class));
        }
    };
    Button.OnClickListener bBike = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, BikeActivity.class));
        }
    };
    Button.OnClickListener bDeck = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, DeckActivity.class));
        }
    };
}
