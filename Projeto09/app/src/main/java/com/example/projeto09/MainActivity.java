package com.example.projeto09;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioGroup formaPgtoRadioGroup;
    TextView formaPgtoSelecionadaTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        formaPgtoRadioGroup = findViewById(R. id.formaPgtoRadioGroup);
        formaPgtoSelecionadaTextView = findViewById(R. id.formaPgtoSelecionadaTextView);

        formaPgtoRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);
                String opcaoSelecionada = radioButton.getText().toString();
                formaPgtoSelecionadaTextView.setText(opcaoSelecionada);
            }
        });
    }
}