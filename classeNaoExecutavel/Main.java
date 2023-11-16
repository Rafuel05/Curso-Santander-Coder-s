package classeNaoExecutavel;
import classeNaoExecutavel.Animais.Cachorro;
import classeNaoExecutavel.Animais.Gato;

public class Main {
    public static void main(String[] args) {


        Cachorro cachorro_1 = new Cachorro("Tobby","marrom",25,5.5,2,"di boa");
        
        Gato gato_1 = new Gato ("Felix","preto",10,2.9,"di boa");

        cachorro_1.soar();
        gato_1.soar();
        
        
        
    
    }
}