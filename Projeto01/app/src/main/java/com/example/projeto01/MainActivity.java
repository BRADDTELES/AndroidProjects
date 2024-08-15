package com.example.projeto01;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText nomeEditText;
    EditText alturaEditText;
    TextView resultadoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeEditText = findViewById(R.id.nomeEditText);
        alturaEditText = findViewById(R.id.alturaEditText);
        resultadoTextView = findViewById(R.id.resultadoTextView);
    }

    public void lerDadosButton(View view){
        String nome = nomeEditText.getText().toString();
        String altura = alturaEditText.getText().toString();
        resultadoTextView.setText(nome + " " + altura);

    }
}