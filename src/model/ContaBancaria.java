package model;

public class ContaBancaria {
    public String cliente;
    public int num_conta;
    public float saldo;

    public ContaBancaria(String cliente, int num_conta, float saldo) {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }

    public void sacar(float valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " na conta bancaria realizado com sucesso. Nome do cliente é :" + cliente);
        } else {
            System.out.println("Saldo insuficiente para saque na conta bancaria, não tem como sacar " + valor + ".Nome do cliente é :" + cliente);
        }
    }

    public void depositar(float valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso na conta bancaria.Nome do cliente é :" + cliente);
    }
}
