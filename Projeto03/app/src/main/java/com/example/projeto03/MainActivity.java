package com.example.projeto03;

import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView idadeTextView;
    NumberPicker idadeNumberPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idadeTextView = findViewById(R.id.idadeTextView);
        idadeNumberPicker = findViewById(R.id.idadeNumberPicker);

        idadeNumberPicker.setMinValue(0);
        idadeNumberPicker.setMaxValue(150);

        idadeNumberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int oldVal, int newVal) {
                idadeTextView.setText("Idade: " + newVal);
            }
        });
    }
}