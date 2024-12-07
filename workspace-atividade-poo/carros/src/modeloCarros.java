public class modeloCarros extends carros {

    // construtor da classe pai
    public modeloCarros(String nomeModelo, double[] precos) {
        super(nomeModelo, precos);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Informaçoes do modelo especifico:");
        super.exibirInformacoes(); // metodo calsse pai
    }
}