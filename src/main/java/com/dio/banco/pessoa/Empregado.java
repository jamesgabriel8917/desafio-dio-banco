package com.dio.banco.pessoa;

import com.dio.banco.conta.Conta;

import java.util.Date;

public class Empregado extends Pessoa{
    private Date contratacao;
    private double salario;
    private String setor;
    private Conta conta;

    public Empregado(String nome, String sobrenome, int idade) {
        super(nome, sobrenome, idade);
    }


}
