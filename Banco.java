import java.text.Format;
import java.util.Scanner;

public class Banco{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        float saldo=0, saque=0,deposito=0;
        int op=0;
        do{
            System.out.println("MENU");
            System.out.println("1)Consulta de saldo;");
            System.out.println("2)Saque;");
            System.out.println("3)Deposito;");
            System.out.println("4)Sair;");
            op=entrada.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Seu saldo é:R$" +saldo);
                    break;
                case 2:
                    System.out.println("Valor do saque:R$");
                    saque=entrada.nextFloat();
                    saldo=saldo-saque;
                    break;
                case 3:
                    System.out.println("Seu deposito é:R$");
                    deposito=entrada.nextFloat();
                    saldo=saldo+deposito;
                    break;
                case 4:
                    System.out.println("Voce saiu!");
                    break;
                default:
                    break;
            } 
        }while(op<4);
        
    }
}
