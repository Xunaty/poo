
public class main {
    public static void main(String[] args) {

        cachorro cachorro = new cachorro();
        System.out.println("funçoes do cachorro:");
        cachorro.emitirSom();
        cachorro.abanarRabo();
        cachorro.cavarBuraco();
        cachorro.buscarBola();
        cachorro.protegerCasa();
        cachorro.dormir();

        gato gato = new gato();
        System.out.println("\nfunçoes do gato:");
        gato.emitirSom();
        gato.arranharMoveis();
        gato.ronronar();
        gato.brincarComBolinha();
        gato.dormir();

        //gatos

        gato frajola = new gato();
        System.out.println("\nO Frajola está:");
        frajola.emitirSom();
        frajola.arranharMoveis();
        frajola.cacarPiuPiu();

        gato garfield = new gato();
        System.out.println("\nO Garfield está:");
        garfield.dormir();
        System.out.println("Afinal, ele só sabe fazer isso mesmo!");

        gato panteraCorDeRosa = new gato();
        System.out.println("\nA Pantera Cor de Rosa está:");
        panteraCorDeRosa.emitirSom();
        panteraCorDeRosa.escalarArvores();
        panteraCorDeRosa.arranharMoveis();

        gato gatoGalatico = new gato();
        System.out.println("\nO Gato Galático está:");
        gatoGalatico.brincarComBolinha();
        gatoGalatico.dormir();

        //cachorros

        cachorro boltz = new cachorro();
        System.out.println("\nO Boltz Super Cão está:");
        boltz.emitirSom();
        boltz.buscarBola();
        boltz.salvarACidade();

        cachorro pitbullDoFunk = new cachorro();
        System.out.println("\nO Pitbull do Funk está:");
        pitbullDoFunk.emitirSom();
        pitbullDoFunk.protegerCasa();

        cachorro cachorraoLanches = new cachorro();
        System.out.println("\nO Cachorrão Lanches está:");
        cachorraoLanches.emitirSom();
        cachorraoLanches.abanarRabo();

        cachorro bethoven = new cachorro();
        System.out.println("\nO Bethoven está:");
        bethoven.emitirSom();
        bethoven.cavarBuraco();
        bethoven.protegerCasa();
    }
}

