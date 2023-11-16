package classeNaoExecutavel.Animais;

public class Animal {
    protected String name;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;

    public Animal ( ){};
    public Animal(String name, String cor, int altura, double peso, String estadoDeEspirito){
        this.name = name;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;

    }


    protected void comer(){ }

    protected void dormir(){ }

    public void soar(){ 
        System.out.println("nada");
     }
}
