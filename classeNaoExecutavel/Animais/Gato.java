package classeNaoExecutavel.Animais;

public class Gato extends Animal{
    
    static int numeroDeGatos;

    public Gato(String name, String cor, int altura, double peso, String estadoDeEspirito)
    {
        super(name,cor,altura,peso,estadoDeEspirito);
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

    public int getNumeroDeGatos(){
        return this.numeroDeGatos;
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

    public void setNumeroDeCachorros(int numeroDeGatos){
        this.numeroDeGatos = numeroDeGatos;
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
    
    
    @Override
    public String toString(){
        return "Gato{" +
                "nome='" + name + '\'' +
                '}';
    }
    @Override
    public void soar(){
        System.out.println("MIAAAAAAU!");
    }
}
