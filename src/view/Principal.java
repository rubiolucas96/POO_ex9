package view;

import model.ContaEspecial;
import model.ContaPoupanca;

public class Principal {
    public static void main(String[] args) {

        ContaPoupanca contaPoupanca = new ContaPoupanca("João", 123, 1000, 1);
        ContaEspecial contaEspecial = new ContaEspecial("Maria", 456, 2000, 500);
        contaPoupanca.sacar(200);
        contaEspecial.sacar(2300);
        contaPoupanca.sacar(2000);
        contaEspecial.sacar(2500);
        contaPoupanca.depositar(500);
        contaEspecial.depositar(100);
        contaPoupanca.calcularNovoSaldo(0.05f);

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("Dados da conta poupança:");
        System.out.println("Cliente: " + contaPoupanca.cliente);
        System.out.println("Número da conta: " + contaPoupanca.num_conta);
        System.out.println("Saldo: " + contaPoupanca.saldo);
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("Dados da conta especial:");
        System.out.println("Cliente: " + contaEspecial.cliente);
        System.out.println("Número da conta: " + contaEspecial.num_conta);
        System.out.println("Saldo: " + contaEspecial.saldo);
        System.out.println("Limite: " + contaEspecial.limite);
    }
}




