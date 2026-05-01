package com.lucpastc.bwandroid.app;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;

public class CarregandoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carregando);

        // Usamos um Handler para esperar 2000 milissegundos (2 segundos)
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                // Código que será executado após os 2 segundos
                Intent intent = new Intent(CarregandoActivity.this, HomeActivity.class);
                startActivity(intent);

                // Finaliza a CarregandoActivity para que o usuário não volte para ela ao apertar "Voltar"
                finish();
            }
        }, 2000); // 2000ms = 2 segundos
    }
}