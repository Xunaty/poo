public class main {
    public static void main(String[] args) {

        double[] precosModelo1 = {49990, 55000, 59000};
        double[] precosModelo2 = {17000, 22000, 12000};
        double[] precosModelo3 = {100000, 5000, 210000};
        double[] precosModelo4 = {100, 150, 89.9};
        double[] precosModelo5 = {20000, 47000, 12000};
        double[] precosModelo6 = {99999, 1000, 2};

        modeloCarros modelo1 = new modeloCarros("Celta Preto", precosModelo1);
        modeloCarros modelo2 = new modeloCarros("Carro dos FlindSones", precosModelo2);
        modeloCarros modelo3 = new modeloCarros("Ferrari Aventador", precosModelo3);
        modeloCarros modelo4 = new modeloCarros("Carinho de mao", precosModelo4);
        modeloCarros modelo5 = new modeloCarros("Carrinho de batebate", precosModelo5);
        modeloCarros modelo6 = new modeloCarros("Relampago MacQueen", precosModelo6);


        System.out.println("Todos os modelos:");
        modelo1.exibirInformacoes();
        System.out.println("\n");
        modelo2.exibirInformacoes();
        System.out.println("\n");
        modelo3.exibirInformacoes();
        System.out.println("\n");
        modelo4.exibirInformacoes();
        System.out.println("\n");
        modelo5.exibirInformacoes();
        System.out.println("\n");
        modelo6.exibirInformacoes();
    }

}