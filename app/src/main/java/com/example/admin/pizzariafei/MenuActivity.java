package com.example.admin.pizzariafei;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btn_meus_pedidos = (Button) findViewById(R.id.btn_meus_pedidos);
        Button btn_novo_pedido = (Button) findViewById(R.id.btn_novo_pedido);

        //Ação Botão Ver Pedidos
        btn_meus_pedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAbrirMeusPedidos = new Intent(MenuActivity.this, MeusPedidosActivity.class);
                startActivity(intentAbrirMeusPedidos);
            }
        });


        //Ação Botão Novo Pedido
        btn_novo_pedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAbrirNovoPedido = new Intent(MenuActivity.this, NovoPedidoActivity.class);
                startActivity(intentAbrirNovoPedido);
            }
        });

    }
}
