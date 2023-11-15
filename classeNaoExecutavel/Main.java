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

        System.out.println(cachorro_1.name);
        System.out.println(cachorro_1.cor);



    }
}