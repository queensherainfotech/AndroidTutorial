package com.queensherainfotech.androidtutorial;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class Day2Activity extends AppCompatActivity {

    ToggleButton toggleButton;
    Switch switchOnOff;
    RadioGroup rdgFruits;
    RadioButton rdbObj;
    int rdbid=0;
    Button btnCheckFruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2);

        toggleButton = findViewById(R.id.toggleButton);
        switchOnOff = findViewById(R.id.switchOnOff);
        rdgFruits = findViewById(R.id.rdgFruits);
        btnCheckFruit = findViewById(R.id.btnCheckFruit);

        toggleButton.setAllCaps(false);

        toggleButton.setOnClickListener(v->{
            if(toggleButton.isChecked()){                       //we are checking if toggle button is on or off
                toggleButton.setBackgroundColor(Color.GREEN);
                toggleButton.setText("OK");
            }
            else{
                toggleButton.setBackgroundColor(Color.RED);
                toggleButton.setText("Not OK");
            }
        });

        switchOnOff.setOnClickListener(v->{
            if(switchOnOff.isChecked()){                       //we are checking if switch is on or off
                Toast.makeText(this, "Switch On", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Switch Off", Toast.LENGTH_SHORT).show();
            }
        });

        btnCheckFruit.setOnClickListener(v->{
            rdbid = rdgFruits.getCheckedRadioButtonId();
            if(rdbid == -1){
                Toast.makeText(this, "Please select option", Toast.LENGTH_SHORT).show();
                return;
            }
            rdbObj = findViewById(rdbid);

            Toast.makeText(this, rdbObj.getText().toString(), Toast.LENGTH_SHORT).show();
        });
    }
}
