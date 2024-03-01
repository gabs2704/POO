import java.util.Scanner;

public class Banco{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        float saldo=0, saque=0,deposito=0;
        String op;
        do {
            System.out.println("MENU");
            System.out.println("a) Consulta de saldo;");
            System.out.println("b) Saque;");
            System.out.println("c) Deposito;");
            System.out.println("d) Sair;");
            op=entrada.nextLine();
            System.out.println("-------------------------");
            switch (op) {
                case "a":
                    System.out.println("Seu saldo é:R$" +saldo);
                    break;
                case "b":
                    System.out.println("Valor do saque:R$");
                    saque=entrada.nextFloat();
                    saldo=saldo-saque;
                    break;
                case "c":
                    System.out.println("Seu deposito é:R$");
                    deposito=entrada.nextFloat();
                    saldo=saldo+deposito;
                    break;
                case "d":
                    System.out.println("Voce saiu!");
                    break;
                default:
                    break;
            } 
        }while(op!="d");
        
    }
}
