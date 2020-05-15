package com.queensherainfotech.androidtutorial;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Day1Activity extends AppCompatActivity {

    TextView txvDisplay;
    EditText edtInput;
    Button btnClickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day1);

        txvDisplay = findViewById(R.id.txvDisplay);
        edtInput = findViewById(R.id.edtInput);
        btnClickMe = findViewById(R.id.btnClickMe);

        btnClickMe.setOnClickListener(view -> {
            String text = edtInput.getText().toString();
            txvDisplay.setText(text);
            Toast.makeText(this, "button single click", Toast.LENGTH_SHORT).show();
        });
    }
}
