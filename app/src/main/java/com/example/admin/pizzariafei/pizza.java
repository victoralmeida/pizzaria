package com.example.admin.pizzariafei;

/**
 * Created by Gustavo Diniz on 24/11/2017.
 */

public class pizza {
    private String nome;
    private String tipo;
    private String preco;

    public pizza( String nome, String tipo, String preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
    }



    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPreco() {
        return preco;
    }
}

