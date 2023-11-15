package classeNaoExecutavel;
import classeNaoExecutavel.Animais.Cachorro;

public class Main {
    public static void main(String[] args) {


        Cachorro cachorro_1 = new Cachorro();

        cachorro_1.name = "Tobby";
        cachorro_1.cor = "marrom";
        cachorro_1.altura = 25;
        cachorro_1.peso = 5.5;
        cachorro_1.tamanhoDoRabo = 2;

        
        cachorro_1.latir();
        System.out.println("O cachorro achou a " + cachorro_1.pegar());
        System.out.println("Apos o carinho o cachorro esta " + cachorro_1.interagir("carinho"));
        System.out.println("Apos mandar o cachorro ir dormir ele ficou " + cachorro_1.interagir("vai dormir"));

    }
}