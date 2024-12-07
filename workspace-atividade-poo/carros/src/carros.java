public class carros {
    private String nomeModelo;
    private double[] precos; //Array para armazenar os preços medios nos tres anos

    // construtor
    public carros(String nomeModelo, double[] precos) {
        this.nomeModelo = nomeModelo;
        this.precos = precos;
    }

    // Getter e Setter
    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public double[] getPrecos() {
        return precos;
    }

    public void setPrecos(double[] precos) {
        this.precos = precos;
    }

    //calcula o menor preço

    public double calcularMenorPreco() {
        double menor = precos[0];
        for (double preco : precos) {
            if (preco < menor) {
                menor = preco;
            }
        }
        return menor;
    }

    //calcular o maior preço

    public double calcularMaiorPreco() {
        double maior = precos[0];
        for (double preco : precos) {
            if (preco > maior) {
                maior = preco;
            }
        }
        return maior;
    }

    //Prints
    public void exibirInformacoes() {
        System.out.println("Modelo do carro: " + nomeModelo);
        System.out.print("Preços: ");
        for (double preco : precos) {
            System.out.print(preco + " ");
        }
        System.out.println("\nMenor preço: " + calcularMenorPreco());
        System.out.println("Maior preço: " + calcularMaiorPreco());
    }
}