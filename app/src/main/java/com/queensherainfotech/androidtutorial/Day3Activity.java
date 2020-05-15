package com.queensherainfotech.androidtutorial;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Day3Activity extends AppCompatActivity {

    CheckBox chkboxMango,chkboxPineapple,chkboxGrapes;
    Button btnCheckFruit;
    ImageButton imgbtnDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day3);

        chkboxMango = findViewById(R.id.chkboxMango);
        chkboxPineapple = findViewById(R.id.chkboxPineapple);
        chkboxGrapes = findViewById(R.id.chkboxGrapes);
        btnCheckFruit = findViewById(R.id.btnCheckFruit);
        imgbtnDemo = findViewById(R.id.imgbtnDemo);

        btnCheckFruit.setOnClickListener(view->{
            String selectedFruits="You have selected: ";
            if(chkboxMango.isChecked()){
                selectedFruits += chkboxMango.getText().toString()+" ";
            }
            if(chkboxPineapple.isChecked()){
                selectedFruits += chkboxPineapple.getText().toString()+" ";
            }
            if(chkboxGrapes.isChecked()){
                selectedFruits += chkboxGrapes.getText().toString()+" ";
            }

            Toast.makeText(this, selectedFruits, Toast.LENGTH_SHORT).show();
        });

        imgbtnDemo.setOnClickListener(view->{
            Toast.makeText(this, "You have clicked image button", Toast.LENGTH_SHORT).show();
        });
    }
}
