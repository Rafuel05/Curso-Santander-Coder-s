package classeNaoExecutavel;
import classeNaoExecutavel.Animais.Cachorro;

public class Main {
    public static void main(String[] args) {


        Cachorro cachorro_1 = new Cachorro("Tobby","marrom",25,5.5,2,"di boa");

        //cachorro_1.setName("Tobby");
        //cachorro_1.setCor("marrom");
        //cachorro_1.setAltura(25);
        //cachorro_1.setPeso(5.5);
        //cachorro_1.setTamanhoDoRabo(2);

        
        cachorro_1.latir();
        System.out.println("O cachorro achou a " + cachorro_1.pegar());
        System.out.println("Apos o carinho o cachorro esta " + cachorro_1.interagir("carinho"));
        System.out.println("Apos mandar o cachorro ir dormir ele ficou " + cachorro_1.interagir("vai dormir"));
        System.out.println("Apos pisar na patinha o cachorro ficou " + cachorro_1.interagir("pisar na patinha") );
        System.out.println("Vc nao pediu nada ao cachorro ele esta " + cachorro_1.interagir("nada") );
    }
}