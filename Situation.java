import java.util.Scanner;

public class Situacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float nota1 = entrada.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float nota2 = entrada.nextFloat();

        System.out.print("Digite a frequencia do aluno (em %): ");
        float frequencia = entrada.nextFloat();

        String resultado = calculo(nota1, nota2, frequencia);
        System.out.println(resultado);
    }

    public static String calculo(float nota1, float nota2, float frequencia) {
        float nota_media = (nota1 + nota2) / 2;
        if (nota_media >= 60 && frequencia >= 75) {
            if (nota_media >= 85) {
                System.out.println("O aluno foi aprovado com conceito A");
            } else if (nota_media >= 70) {
                System.out.println("O aluno foi aprovado com conceito B");
            } else if (nota_media >= 60) {
                System.out.println("O aluno foi aprovado com conceito C");
            } else {
                System.out.println("O aluno foi reprovado");
            }
        } else {
            System.out.println("O aluno foi reprovado");
        }
        }
    }
