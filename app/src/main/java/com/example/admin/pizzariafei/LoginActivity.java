package com.example.admin.pizzariafei;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button btn_entrar = (Button) findViewById(R.id.btn_entrar);
        EditText campo_usuario = (EditText) findViewById(R.id.campo_usuario);
        EditText campo_senha = (EditText) findViewById(R.id.campo_senha);

        String usuario = campo_usuario.getText().toString();   //Valor obtido do campo usuário
        String senha = campo_senha.getText().toString();       //Valor obtido do campo senha


        btn_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent IntentAbrirMenu = new Intent(LoginActivity.this, MenuActivity.class);

                if(1==1)  //Onde deverá ser feita a verificação se o usuário existe
                    startActivity(IntentAbrirMenu);

                finish();
            }
        });

    }
}
