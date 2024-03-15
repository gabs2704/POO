import java.util.Scanner;
 public class Media_Status{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a primeira nota:");
        int n1 = entrada.nextInt();

        System.out.println("Informe a segunda nota:");
        int n2 = entrada.nextInt();

        System.out.println("Informe a terceira nota:");
        int n3 = entrada.nextInt();
      
        float media = Cmedia(n1, n2, n3);
        System.out.println("A media do aluno é:" + media);
        
        String situacao = Status(media);
        System.out.println("O aluno esta "+ situacao); 
    }
    public static int Cmedia(int n1,int n2,int n3) {
       return (n1+n2+n3)/3;
    }
    public static String Status(int media) {
        if(media >=6 && media <=10){
            return "Aprovado";
        }
        else if(media >=4 && media < 6){
            return "Verificação Suplementar";
        }
            else if(media < 4){
            return "Reprovado";
        }
        return "Nota inválida";
    }
}
