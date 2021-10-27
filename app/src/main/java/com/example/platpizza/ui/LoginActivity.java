package com.example.platpizza.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.platpizza.R;
import com.example.platpizza.api.UserService;
import com.example.platpizza.model.UserLogin;
import com.example.platpizza.ui.CadastroActivity;
import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;
import com.google.android.material.textfield.TextInputEditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginActivity extends AppCompatActivity {

    private TextInputEditText campoCPFLogin;
    private TextInputEditText campoSenhaLogin;
    private Button btnEntrarLogin;
    private Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.0.10:8080/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        configCampo();
        btnEntrarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valorCampoCPFLogin = campoCPFLogin.getText().toString();
                String valorCampoSenhaLogin = campoSenhaLogin.getText().toString();
                UserLogin userLogin = new UserLogin(valorCampoCPFLogin, valorCampoSenhaLogin);

                Log.i("INFORMACAO", "CLICOU" + valorCampoCPFLogin + " SENHA: " + valorCampoSenhaLogin);
            }
        });

    }



    private void configCampo() {
        campoCPFLogin = findViewById(R.id.activity_login_campo_cpf);
        campoSenhaLogin = findViewById(R.id.activity_login_campo_senha);

        btnEntrarLogin = findViewById(R.id.activity_login_btn_entrar);

        SimpleMaskFormatter smf = new SimpleMaskFormatter("NNN.NNN.NNN-NN");
        MaskTextWatcher mtw = new MaskTextWatcher(campoCPFLogin, smf);
        campoCPFLogin.addTextChangedListener(mtw);
    }


    public void abreFormularioCadastro(View view) {
        startActivity(new Intent(this, CadastroActivity.class));
    }
}