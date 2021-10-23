package com.example.platpizza;

import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;

public class CadastroActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(new FragmentSlide.Builder()
                .background(R.color.black)
                .backgroundDark(R.color.black)
                .fragment(R.layout.item_cadastro_1)
                .build());

        addSlide(new FragmentSlide.Builder()
                .background(R.color.black)
                .backgroundDark(R.color.black)
                .fragment(R.layout.item_cadastro_2)
                .build());
    }
}