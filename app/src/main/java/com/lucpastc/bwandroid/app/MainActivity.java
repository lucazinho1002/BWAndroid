package com.lucpastc.bwandroid.app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Conecta ao XML activity_main.xml
        setContentView(R.layout.activity_main);

        // Encontra o botão pelo ID definido no XML
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnIrParaCarregando = findViewById(R.id.button);

        // Define a ação de clique
        btnIrParaCarregando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cria a intenção para mudar de tela
                Intent intent = new Intent(MainActivity.this, CarregandoActivity.class);
                startActivity(intent);
            }
        });
    }
}