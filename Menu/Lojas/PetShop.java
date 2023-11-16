package Menu.Lojas;

import Menu.Animais.Animal;
import Menu.Animais.Cachorro;

public class PetShop {
    public void darBanho(Animal animal){
        animal.setEstadoDeEspirito("Limpo");
    }

    public void tosar(Cachorro cachorro){
        cachorro.setEstadoDeEspirito("peladin");
    }

}
