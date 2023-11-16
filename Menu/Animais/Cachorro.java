package Menu.Animais;

public class Cachorro extends Animal {
//atributos
    static int numeroDeCachorros;
    private int tamanhoDoRabo;

    
//------------------------------------

//construtores
    public Cachorro ( ){};
    public Cachorro(String name, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito){
        super(name,cor,altura,peso,estadoDeEspirito);
        this.tamanhoDoRabo = tamanhoDoRabo;
        numeroDeCachorros ++;
    }
//------------------------------
//metodos
    public String getName(){
        return this.name;
    }

    public String getCor(){
        return this.cor;
    }

    public String getEstadoDeEspirito(){
        return this.estadoDeEspirito;
    }

    public int getNumeroDeCachorros(){
        return this.numeroDeCachorros;
    }

    public int getAltura(){
        return this.altura;
    }

    public double getPeso(){
        return this.peso;
    }

    public int getTamanhoDoRabo(){
        return this.tamanhoDoRabo;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setNumeroDeCachorros(int numeroDeCachorros){
        this.numeroDeCachorros = numeroDeCachorros;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo){
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setName(String nome){
        this.name = nome;
    }
    
    
//---------------------------------------
    public String interagir(String acao){
        switch (acao) {
            case "carinho" :
                this.estadoDeEspirito = "feliz";
                break;

            case "vai dormir" :
            this.estadoDeEspirito = "triste";
            break;

            case "pisar na patinha" :
            this.estadoDeEspirito = "bravo";
            break;

            default:
            this.estadoDeEspirito = "di boa";
            break;
        }
        return estadoDeEspirito;
    }
    @Override
    public String toString(){
        return "Cachorro{" +
                "nome='" + name + '\'' +
                '}';
    }
    @Override
    public void soar (){
        System.out.println("AU AU!");
    }
    
}
