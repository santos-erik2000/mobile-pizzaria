package com.example.platpizza.config.validations;

public class ValidationCadastro {

    public static Boolean validateNome(String campoNome){
        return !(campoNome.isEmpty() || campoNome.equals(null));
    }

    public static Boolean validateCPF(String campoCPF){
        return !(campoCPF.isEmpty() || campoCPF.equals(null));
    }

    public static Boolean validateCelular(String campoCell){
        return !(campoCell.isEmpty() || campoCell.equals(null));
    }

    public static Boolean validateEmail(String campoEmail){
        return !(campoEmail.isEmpty() || campoEmail.equals(null)) && campoEmail.contains("@");
    }

    public static Boolean validateSenha(String campoSenha){
        return campoSenha.length() > 6;
    }
}
