public class Vetores {
    public static void main(String[] args) {
       int [] numeros = { 1,2,3,9,22,41,63,0};
        int maior = numeros[0];
       int menor = numeros[0];
       int media = numeros[0];
       for (int i = 0; i < numeros.length;i++)
       {
           if (numeros[i]>maior)
               maior = numeros[i];
           if (numeros[i]<menor)
               menor = numeros[i];
           media += numeros[i];
       }
       media = media/2;
        System.out.println("maior:"+maior+" menor:"+menor+" media:"+media );
    }
}