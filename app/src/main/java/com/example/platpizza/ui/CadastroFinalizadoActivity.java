package com.example.platpizza.ui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import  android.widget.Button;
import com.example.platpizza.R;

public class CadastroFinalizadoActivity extends AppCompatActivity {

    private Button btnEntrarCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_finalizado);
        configButton();
    }

    private void configButton(){
        btnEntrarCadastro = findViewById(R.id.activity_cadastro_finalizado_btn_entrar);
    }
}