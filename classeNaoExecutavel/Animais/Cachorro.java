package classeNaoExecutavel.Animais;

public class Cachorro {
//atributos
    private String name;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private String estadoDeEspirito;
//------------------------------------

//construtores
    public Cachorro ( ){};
    public Cachorro(String name, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito){
        this.name = name;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
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
    
    public void comer () {}

    public void latir () {
        System.out.println("AUAU!!");
    }
    public String pegar(){
        return "Bolinha";
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
    
}
