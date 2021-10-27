package com.example.platpizza.api;

import com.example.platpizza.model.Endereco;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EnderecoService {

    @GET("endereco/all")
    Call<List<Endereco>> recuperaListaEndereco();
}
