import java.util.Scanner;

public class Calculadora {
    //Criar um programa em Java que:
    //Solicite ao usuário para inserir dois números.
    //Calcule a soma, a diferença, o produto e a média desses números.
    //Imprima os resultados.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       System.out.println("Seja bem-vindo(a) a calculadora!");
       System.out.println("Informe o primeiro número:"); 
       double numero1 = scanner.nextDouble();

       System.out.println("Informe o segundo número:");
       double numero2 = scanner.nextDouble();

       //calculos
       double soma = numero1 + numero2;
       double diferença = numero1 - numero2;
       double produto = numero1 * numero2;
       double media = (numero1 + numero2)/2;
       
       //resultados
       System.out.println("A soma dos numeros é:" + soma);
       System.out.println("A diferença é: " + diferença);
       System.out.println("O produto é: " + produto);
       System.out.println("A média é:" + media);


    }
}

