package com.dio.banco;

import com.dio.banco.pessoa.Cliente;
import com.dio.banco.conta.Conta;
import com.dio.banco.conta.ContaCorrente;
import com.dio.banco.conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Nestor Gabriel", "Silva Neto", 56);

        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);

        cc.depositar(4555.00);
        cp.depositar(757.00);

        cc.trasferir(400, cp);


        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }







}