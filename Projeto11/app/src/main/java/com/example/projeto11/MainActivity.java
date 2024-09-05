package com.example.projeto11;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.projeto11.util.UtilToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void msgCurtaButtonAction(View view) {
        UtilToast.alertaCurto(this, "Esta mensagem se " + "auto-destruirá em 2 segundos...");
    }

    public void msgLongaaButtonAction(View view) {
        UtilToast.alertaLong(this, "Esta mensagem se " + "auto-destruirá em 5 segundos...");
    }
}