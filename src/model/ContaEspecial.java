package model;

public class ContaEspecial extends ContaBancaria {
    public float limite;

    public ContaEspecial(String cliente, int num_conta, float saldo, float limite) {
        super(cliente, num_conta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(float valor) {
        float saldoDisponivel = saldo + limite;
        if (saldoDisponivel >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso na conta especial. Nome do cliente é :" + cliente);
        } else {
            System.out.println("Saque não autorizado na conta especial do valor " + valor + " . Valor excede o limite. Nome do cliente é :" + cliente);
        }
    }
}

