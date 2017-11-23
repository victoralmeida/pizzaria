package com.example.admin.pizzariafei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastrarClienteActivity extends AppCompatActivity {
    Button btadd;
    EditText nome,senha,endereco,numero,complemtne,telefone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_cliente);
        btadd = (Button)findViewById(R.id.btn_cadastro);
        nome = (EditText)findViewById(R.id.campo_Nome);
        senha = (EditText)findViewById(R.id.campo_pasword);
        endereco = (EditText)findViewById(R.id.campo_endereco);
        numero = (EditText)findViewById(R.id.campo_numero);
        complemtne = (EditText)findViewById(R.id.campo_Complemento);
        telefone = (EditText)findViewById(R.id.campo_telefone);
    }
    public void Cadastrar(View view){
        String name = nome.getText().toString();
        String senhaa = senha.getText().toString();
        String enderec = endereco.getText().toString();
        String numer = numero.getText().toString();
        String compemento = complemtne.getText().toString();
        String telfone = telefone.getText().toString();
        String type = "Register";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, name,senhaa,telfone,enderec,numer,compemento);
        nome.setText(null);
        senha.setText(null);
        endereco.setText(null);
        numero.setText(null);
        complemtne.setText(null);
        telefone.setText(null);
    }
}
