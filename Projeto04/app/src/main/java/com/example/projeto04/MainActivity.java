package com.example.projeto04;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    String [] personagens = new String[3];

    TextView personagemTextView;
    ImageView personagemImageView;
    NumberPicker personagemNumberPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personagemTextView = findViewById(R.id.personagemTextView);
        personagemImageView = findViewById(R.id.personagemImageView);
        personagemNumberPicker = findViewById(R.id.personagemNumberPicker);

        personagens[0] = "Tio Donald";
        personagens[1] = "Mickey";
        personagens[2] = "Tio Patinhas";

        personagemNumberPicker.setDisplayedValues(personagens);

        personagemNumberPicker.setMinValue(0);
        personagemNumberPicker.setMaxValue(2);

        personagemNumberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                String  personagemSelecionado = personagens[newVal];
                if(personagemSelecionado.equalsIgnoreCase("Tio Donald")){
                    personagemImageView.setImageResource(R.drawable.donald);
                    personagemTextView.setText("Donald's");
                }else {
                    if(personagemSelecionado.equalsIgnoreCase("Mickey")){
                        personagemImageView.setImageResource(R.drawable.mickey);
                        personagemTextView.setText("Mickey");

                    }else {
                        personagemImageView.setImageResource(R.drawable.tio_patinhas);
                        personagemTextView.setText("Tio Patinhas");
                    }
                }
            }
        });
    }
}