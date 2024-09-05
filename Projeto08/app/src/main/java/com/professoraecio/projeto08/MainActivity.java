package com.professoraecio.projeto08;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    Switch darkModeSwitch;
    Switch noticiasSwitch;
    ConstraintLayout activity_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        darkModeSwitch = findViewById(R.id.darkModeSwitch);
        noticiasSwitch = findViewById(R.id.noticiasSwitch);
        activity_main = findViewById(R.id.activity_main);

        darkModeSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    activity_main.setBackgroundColor(Color.GRAY);
                    darkModeSwitch.setText(R.string.label_ligado);
                }else{
                    activity_main.setBackgroundColor(Color.WHITE);
                    darkModeSwitch.setText(R.string.label_desligado);
                }
            }
        });
        noticiasSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    noticiasSwitch.setText(R.string.label_ligado);
                }else{
                    noticiasSwitch.setText(R.string.label_desligado);
                }
            }
        });
    }
}