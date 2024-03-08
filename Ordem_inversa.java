import java.util.Scanner;

public class Ordem_inversa{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

int vetor[];
int quantidade;
int numeros[] = new int[10]; 

System.out.println("Informe a quantidade de numeros a serem digitados:");
    quantidade = entrada.nextInt();
    vetor = new int[quantidade];

System.out.println("Insira os numeros:");
for(int i = 0; i < quantidade ; i++){
    numeros[i] = entrada.nextInt();
}
System.out.println("Os numeros inseridos em ordem inversa:");
for(int i = quantidade - 1 ; i >=0; i--){
    System.out.println(numeros[i]);
}
    }
}
