package com.queensherainfotech.androidtutorial;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Day4Activity extends AppCompatActivity {

    TextView txvSeekbarValue,txvProgrebarValue;
    SeekBar seekbarDemo;
    ProgressBar progressbarDemo;
    public int progress=0;
    WebView webviewDemo;
    EditText edtInputUrl;
    Button btnOpenLink;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day4);

        // seekbar program
        txvSeekbarValue = findViewById(R.id.txvSeekbarValue);
        seekbarDemo = findViewById(R.id.seekbarDemo);

        seekbarDemo.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String progressValue = String.valueOf(progress);
                txvSeekbarValue.setText("Seekbar value: "+progressValue);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                txvSeekbarValue.setBackgroundColor(Color.GREEN);
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                txvSeekbarValue.setBackgroundColor(Color.RED);
            }
        });

        // Progressbar program
        txvProgrebarValue = findViewById(R.id.txvProgressbarValue);
        progressbarDemo = findViewById(R.id.progressbarDemo);

        Thread thread = new Thread(){
            @Override
            public void run() {
                try{
                    for(int i=0;i<=100;i++) {
                        sleep(100);
                        progress=i;
                        runOnUiThread(() -> {
                            progressbarDemo.setProgress(progress);
                            txvProgrebarValue.setText("Progressbar value: "+progress);
                            if(progress==100){
                                txvProgrebarValue.setText("Progress completed");
                                progressbarDemo.setVisibility(View.INVISIBLE);
                            }
                        });
                    }
                }
                catch (InterruptedException e){}
            }
        };
        thread.start();

        // Webview program

        webviewDemo = findViewById(R.id.webviewDemo);
        edtInputUrl = findViewById(R.id.edtInputUrl);
        btnOpenLink = findViewById(R.id.btnOpenLink);

        webviewDemo.loadUrl("https://www.google.com");

        btnOpenLink.setOnClickListener(view->{
            String htmltext = edtInputUrl.getText().toString();
            webviewDemo.loadData(htmltext,"text/html","utf-8");
        });
    }
}
