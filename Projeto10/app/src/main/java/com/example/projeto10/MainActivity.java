package com.example.projeto10;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.projeto10.util.UtilAlertDialog;

public class MainActivity extends AppCompatActivity {

    TextView resultadoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultadoTextView = findViewById(R.id.resultadoTextView);
    }

    public void testeDeAvisoButtonAction(View view) {
        UtilAlertDialog.alerta(this, "Atenção!", "Você foi avisado!");
    }

    public void testeDeConfirmacaoButtonAction(View view) {
        UtilAlertDialog.alertaConfirmacao(this, "Formatar!", "Deseja Formatar seu Celular ?", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                resultadoTextView.setText("Formatando o seu celular agora...");
            }
        });

    }
}