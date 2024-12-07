public class contaCorrente extends contaBancaria {

    //tarifa fixa

    private double tarifaMensal = 10; //tarifa fixa

    //tarifa mensal

    public void cobrarTarifaMensal() {
        System.out.println("Cobrando tarifa mensal de R$" + tarifaMensal);
        sacar(tarifaMensal); //classe pai
    }

    @Override
    public void consultarSaldo() {
        System.out.print("Conta Corrente - ");
        super.consultarSaldo(); //metodo da classe pai
    }
}