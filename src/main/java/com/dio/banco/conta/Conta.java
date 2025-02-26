package com.dio.banco.conta;

import com.dio.banco.pessoa.Cliente;

public class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL;

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL++;
        this.cliente = cliente;

    }

    public void sacar(double valor){
        saldo -= valor;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void trasferir(double valor, Conta contaDestino){
        saldo -= valor;
        contaDestino.depositar(valor);
    }

    public void imprimirExtrato(){
        System.out.println("======Extrato======");
        System.out.println("Cliente "+ this.cliente.getNome() + " "+ this.cliente.getSobrenome());
        System.out.println("Agencia "+ this.agencia);
        System.out.println("Conta " + this.numero);
        System.out.println("Saldo "+ this.saldo);
        System.out.println("====================");
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente(){
        return cliente;
    }
    public double getSaldo() {
        return saldo;
    }
}
