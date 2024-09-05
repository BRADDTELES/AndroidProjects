package com.example.projeto07;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    TextView gorgetaTextView;
    CheckBox gorgetaCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gorgetaTextView = findViewById(R.id.gorgetaTextView);
        gorgetaCheckBox = findViewById(R.id.gorgetaCheckBox);
        gorgetaTextView.setText("Modo de Pagamento: Sem Gorjeta");
        gorgetaCheckBox.setText("Gorjeta");
        gorgetaCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    gorgetaTextView.setText("Modo de Pagamento: Com Gorjeta");
                }else {
                    gorgetaTextView.setText("Modo de Pagamento: Sem Gorjeta");
                }
            }
        });
    }
}