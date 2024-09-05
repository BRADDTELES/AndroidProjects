package com.example.projeto13.persistencia;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.projeto13.ENUM.DEFAULT_VALUES;
import com.example.projeto13.ENUM.SHARED_PREFERENCES;
import com.example.projeto13.util.UtilSharedPreferences;

public class Persistencia {



    public static void setUsuario(Context context, String usuario) {
        UtilSharedPreferences.setString(context, SHARED_PREFERENCES.USUARIO_KEY.key, usuario);
    }

    public static String getUsuario(Context context) {
        return UtilSharedPreferences.getString(context, SHARED_PREFERENCES.USUARIO_KEY.key, DEFAULT_VALUES.USUARIO_DEFAUL_VALUE.value);
    }

    public static void setSenha(Context context, String senha) {
        UtilSharedPreferences.setString(context, SHARED_PREFERENCES.SENHA_KEY.key, senha);
    }

    public static String getSenha(Context context) {
        return UtilSharedPreferences.getString(context, SHARED_PREFERENCES.SENHA_KEY.key, DEFAULT_VALUES.SENHA_DEFAULT_VALUE.value);
    }
}
