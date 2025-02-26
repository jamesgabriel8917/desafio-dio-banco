package com.dio.banco.banco;

import com.dio.banco.pessoa.Pessoa;

public abstract class Banco {

    private String nome;
    private String cnpj;
    private Pessoa responsavel;


    public Banco(String nome, String cnpj, Pessoa responsavel) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.responsavel = responsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
