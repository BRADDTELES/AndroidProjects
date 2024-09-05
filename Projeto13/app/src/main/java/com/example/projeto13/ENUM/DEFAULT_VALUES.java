package com.example.projeto13.ENUM;

public enum DEFAULT_VALUES {

    USUARIO_DEFAUL_VALUE("admin"),
    SENHA_DEFAULT_VALUE("12345678");

    public String value;

    DEFAULT_VALUES(String value) {
        this.value = value;
    }

}
