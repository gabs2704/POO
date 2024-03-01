import java.text.Format;
import java.util.Scanner;

public class Positivo {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int np;
        do{
            System.out.println("Digite um numero qualquer positivo:");
            np = entrada.nextInt();
            if(np < 0){
                System.out.println("O numero digitado é negativo!Insira um numero positivo.");
            }
        }
        while(np <= 0);
        System.out.println("O numero digitado é positivo:" +np );
    }
}
