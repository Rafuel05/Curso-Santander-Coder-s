package Menu.Animais;

public abstract class Animal {
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
        this.estadoDeEspirito = estadoDeEspirito;

    }

    public String getName(){
        return this.name;
    }

    public String getCor(){
        return this.cor;
    }

    public String getEstadoDeEspirito(){
        return this.estadoDeEspirito;
    }

    public int getAltura(){
        return this.altura;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    
    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setName(String nome){
        this.name = nome;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito){
        this.estadoDeEspirito = estadoDeEspirito;
    }

    protected void comer(){ }

    protected void dormir(){ }

    public abstract void soar();
}
