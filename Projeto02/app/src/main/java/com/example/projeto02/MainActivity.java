package com.example.projeto02;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView alturaTextView;
    SeekBar alturaSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alturaTextView = findViewById(R.id.alturaTextView);
        alturaSeekBar = findViewById(R.id.alturaSeekBar);

        alturaSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                String alturaFormatado;
                if (progress < 10){
                    alturaFormatado = "00" + progress;
                }else {
                    if (progress > 99){
                        alturaFormatado = "" + progress;
                    }else {
                        alturaFormatado = "0" + progress;
                    }
                }
                alturaTextView.setText("" + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}