package com.example.projeto13.ENUM;

public enum SHARED_PREFERENCES {

    USUARIO_KEY("USUARIO.KEY"),
    SENHA_KEY("SENHA.KEY");

    public String key;

    SHARED_PREFERENCES(String key) {
        this.key = key;
    }

}
