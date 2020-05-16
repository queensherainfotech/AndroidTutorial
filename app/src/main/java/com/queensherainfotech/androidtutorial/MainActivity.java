package com.queensherainfotech.androidtutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    // This is minor change for demo

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listviewMain = findViewById(R.id.listviewMain);

        listviewMain.setOnItemClickListener((parent, view, position, id) -> {
            switch (listviewMain.getItemAtPosition(position).toString()){
                case "Day 1":{
                    Intent intent = new Intent(MainActivity.this,Day1Activity.class);
                    startActivity(intent);
                    break;
                }
                case "Day 2":{
                    Intent intent = new Intent(MainActivity.this,Day2Activity.class);
                    startActivity(intent);
                    break;
                }
                case "Day 3":{
                    Intent intent = new Intent(MainActivity.this,Day3Activity.class);
                    startActivity(intent);
                    break;
                }
                case "Day 4":{
                    Intent intent = new Intent(MainActivity.this,Day4Activity.class);
                    startActivity(intent);
                    break;
                }
                default:
                    Toast.makeText(this, "Activity not done yet", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
