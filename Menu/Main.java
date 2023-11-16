package Menu;
import Menu.Animais.Animal;
import Menu.Animais.Cachorro;
import Menu.Animais.Gato;
import Menu.Lojas.PetShop;

public class Main {
    public static void main(String[] args) {


        Cachorro cachorro_1 = new Cachorro("Tobby","marrom",25,5.5,2,"di boa");
        
        Gato gato_1 = new Gato ("Felix","preto",10,2.9,"di boa");

        Animal gato_2 = new Gato ("Cleyton","bolinha preta",10,2.9,"di boa");
        
        PetShop petshop = new PetShop();

        
        petshop.tosar(cachorro_1);
        System.out.println("cachorro ficou "+ cachorro_1.getEstadoDeEspirito());
        cachorro_1.soar();
        petshop.darBanho(gato_1);
        System.out.println("gato ficou " + gato_1.getEstadoDeEspirito());
        gato_1.soar();
    }
}