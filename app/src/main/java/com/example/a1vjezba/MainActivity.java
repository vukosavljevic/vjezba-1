package com.example.a1vjezba;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random; //import random klase

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //oncreate metoda, izvršava se pri stvaranju aplikacije
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button); // deklaracija buttona
        TextView t1 = (TextView)findViewById(R.id.textview1); // deklaracija textviewa
        View view = findViewById(R.id.layout); // deklaracija layouta

        button.setOnClickListener(new View.OnClickListener() { // postavljanje onClickListenera
            public void onClick(View v) { //metoda koja određuje što se događa na klik buttona
                t1.setText((new Random().nextInt(6) + 1) + "   " + (new Random().nextInt(6) + 1));
                //postavljanje teksta u textviewu na dva nasumična broja u rasponu od 1 - 6 sa razmakom između
                view.setBackgroundColor(Color.rgb(new Random().nextInt(256),new Random().nextInt(256),new Random().nextInt(256)));
                //postavljanje pozadinske boje u nasumično generiranu
            }
        });
    }
}