import java.util.Random;

public class parimpar {
//Crie uma função que receba um número inteiro como parâmetro e retorne true caso ele seja par e false caso ele seja impar.Use 
//essa função par a percorrer umvetor de 10 números aleatório se imprimir se cada posição é par ou impar.

public static boolean Par(int numero) {
    return numero % 2 == 0; //ou seja,se o numero for divisivel por 2 
}
public static void main(String[] args) {
    Random random = new Random();

    int[] numeros = new int[10];
    for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10);
        }
     for (int i = 0; i < numeros.length; i++) {
        if (Par(numeros[i])) {
           System.out.println("Número " + numeros[i] + " na posição " + i + " é par.");
        } else {
            System.out.println("Número " + numeros[i] + " na posição " + i + " é ímpar.");
        }
}
}
}
