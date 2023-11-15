
public class Funcoes {
    public static void main(String[] args){
        String name = "Rafael";
        saudacao(name);
        int result = soma (2,3);
        System.out.println(result);
    }
    public static void saudacao(String nome){
        System.out.println("Hello, "+nome);
    }
    public static int soma (int a, int b) {
        return a + b;
    }
}
