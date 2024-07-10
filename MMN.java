import java.util.Scanner;

public class MMN {
 // Criar um programa em Java que:
 //Solicite ao usuário para inserir a quantidade de números que ele deseja informar.
 //Solicite ao usuário para inserir os números.
 //Armazene os números em um array.
 //Determine o maior e o menor número no array.
 //Imprima o maior e o menor número.
 
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Seja bem-vindo(a)!");
    System.out.println("Informe a quantidade de numeros que desejar:");
    double quantidade = scanner.nextDouble();

    //armazenando os numeros
    int[] numeros = new int[(int) quantidade];

    for(double i = 0; i < quantidade; i++){
        System.out.println("Informe o numero" + (i+1) + ":");
        numeros[(int) i] = (int) scanner.nextDouble();
    }
    double maior = numeros[0];
    double menor = numeros[0];

    //mostrando maior e menor 
    for (int i = 1; i < numeros.length; i++) {
        if (numeros[i] > maior) {
            maior = numeros[i];
        }
        if (numeros[i] < menor) {
            menor = numeros[i];
        }
    }
    System.out.println("Maior número: " + maior);
    System.out.println("Menor número: " + menor);
 }
}
