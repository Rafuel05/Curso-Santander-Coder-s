package classeNaoExecutavel;
import classeNaoExecutavel.Animais.Cachorro;

public class Main {
    public static void main(String[] args) {


        Cachorro cachorro_1 = new Cachorro("Tobby","marrom",25,5.5,2,"di boa");
        System.out.println(cachorro_1.getNumeroDeCachorros());
        Cachorro cachorro_2 = new Cachorro("Luli","marrom",25,5.5,2,"di boa");
        System.out.println(cachorro_2.getNumeroDeCachorros());
        System.out.println(cachorro_1.getNumeroDeCachorros());
        
        
        
    
    }
}