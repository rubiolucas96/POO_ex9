package model;

public class ContaPoupanca extends ContaBancaria {
    int diaDeRendimento;

    public ContaPoupanca(String cliente, int num_conta, float saldo, int diaDeRendimento) {
        super(cliente, num_conta, saldo);
        this.diaDeRendimento = diaDeRendimento;
    }

    public void calcularNovoSaldo(float taxaRendimento) {
        saldo += saldo * taxaRendimento;
        System.out.println("Novo saldo após rendimento: " + saldo + "Nome do cliente é :" + cliente);
    }
}
