package com.example.projeto10.util;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

public class UtilAlertDialog {

    public static void alerta(Context context, String titulo, String mensagem) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(titulo)
                .setMessage(mensagem)
                .setPositiveButton("OK", null)
                .show();
    }

    public static void alertaConfirmacao(Context context, String titulo, String mensagem,
                                         DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(titulo)
                .setMessage(mensagem)
                .setPositiveButton("Sim", onClickListener)
                .setNegativeButton("Cancelar", null)
                .show();
    }
}
