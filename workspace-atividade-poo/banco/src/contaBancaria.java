public class contaBancaria {
    // Atributo privado
    private double saldo;

    //depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado: R$" + valor);
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    //sacar dinheiro
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado: R$" + valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    //consultar o saldo
    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}