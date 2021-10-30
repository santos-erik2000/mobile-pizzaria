package com.example.platpizza.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.platpizza.R;
import com.example.platpizza.config.validations.ValidationCadastro;
import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;
import com.google.android.material.textfield.TextInputEditText;
import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;

import retrofit2.Retrofit;

public class CadastroActivity extends IntroActivity {

    private Retrofit retrofit;
    private TextInputEditText campoCPF;
    private TextInputEditText campoNome;
    private TextInputEditText campoCell;
    private TextInputEditText campoEmail;
    private TextInputEditText campoSenha;
    private TextInputEditText campoRepetirSenha;
    private Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setButtonBackVisible(false);
        configuraCampoCadastro();

        addSlide(new FragmentSlide.Builder()
                .background(R.color.black)
                .backgroundDark(R.color.black)
                .fragment(R.layout.item_cadastro_1)
                .build());

        addSlide(new FragmentSlide.Builder()
                .background(R.color.black)
                .backgroundDark(R.color.black)
                .fragment(R.layout.item_cadastro_2)
                .canGoForward(false)
                .build());



    }


    private void configuraCampoCadastro() {
        campoCPF = findViewById(R.id.item_cadastro_campo_cpf);
        campoNome = findViewById(R.id.item_cadastro_campo_nome);
        campoCell = findViewById(R.id.item_cadastro_campo_cell);
        campoEmail = findViewById(R.id.item_cadastro_campo_email);
        campoSenha = findViewById(R.id.item_cadastro_campo_senha);
        campoRepetirSenha = findViewById(R.id.item_cadastro_campo_repetir_senha);
        btnCadastrar = findViewById(R.id.item_cadastro_btn_finalizarCadastro);

    //     SimpleMaskFormatter smf = new SimpleMaskFormatter("NNN.NNN.NNN-NN");
    //     MaskTextWatcher mtw = new MaskTextWatcher(campoCPF, smf);
    //     campoCPF.addTextChangedListener(mtw);

    //    SimpleMaskFormatter smfCell = new SimpleMaskFormatter("(NN)NNNNNN-NNNN");
    //    MaskTextWatcher mtwCell = new MaskTextWatcher(campoCPF, smfCell);
    //   campoCPF.addTextChangedListener(mtwCell);
    }


}