package com.example.projeto13;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projeto13.persistencia.Persistencia;

public class MainActivity extends AppCompatActivity {

    EditText usuarioEditText;
    EditText senhaEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuarioEditText = findViewById(R.id.usuarioEditText);
        senhaEditText = findViewById(R.id.senhaEditText);
    }

    public void salvarButtonAction(View view) {
        String usuario = usuarioEditText.getText().toString();
        String senha = senhaEditText.getText().toString();
        Persistencia.setUsuario(this, usuario);
        Persistencia.setSenha(this, senha);
    }

    public void carregarButtonAction(View view) {
        String usuario = Persistencia.getUsuario(this);
        String senha = Persistencia.getSenha(this);
        usuarioEditText.setText(usuario);
        senhaEditText.setText(senha);
    }
}