package com.example.platpizza.ui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.platpizza.R;
import android.widget.Button;

public class ErroCadastroActivity extends AppCompatActivity {
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erro_cadastro);
        configBtnVoltar();
    }
    private void configBtnVoltar(){
       btnVoltar = findViewById(R.id.activity_erro_btn_voltar_incio);
    }
}