public class Main {
    public static void main(String[] args) {
        //conta normal

        System.out.println("Bem vindo ao Banco NoMoney!\n");
        System.out.println("Sua conta:");

        contaBancaria contaBancaria = new contaBancaria();
        contaBancaria.depositar(1500);
        contaBancaria.consultarSaldo();
        contaBancaria.sacar(29);
        contaBancaria.consultarSaldo();

        System.out.println("\n");
        System.out.println("Conta Corrente:");

        //conta corrente
        contaCorrente contaCorrente = new contaCorrente();
        contaCorrente.depositar(777);
        contaCorrente.consultarSaldo();
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();

    }
}
