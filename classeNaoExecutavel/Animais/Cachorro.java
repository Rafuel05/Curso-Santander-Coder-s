package classeNaoExecutavel.Animais;

public class Cachorro {

    public String name;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoDoRabo;
    public String estadoDeEspirito;


    public void comer () {}

    public void latir () {
        System.out.println("AUAU!!");
    }
    public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao){
        if (acao.equals("carinho")){
            this.estadoDeEspirito = "feliz";
        }else if (acao.equals("vai dormir")) {
            this.estadoDeEspirito = "triste"; 
        }
        else { 
            this.estadoDeEspirito = "di boa";
        }
        return estadoDeEspirito;
    }
    
}
