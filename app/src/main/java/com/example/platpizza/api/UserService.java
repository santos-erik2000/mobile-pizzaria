package com.example.platpizza.api;

import com.example.platpizza.model.UserCadastro;
import com.example.platpizza.model.UserLogin;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserService {

    @POST("cliente/cadastro")
    Call<UserCadastro> salvaCliente(@Body UserCadastro userCadastro);
}
