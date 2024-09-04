
public class Exercicio1_PublicClass {
        public static void main(String[] args) {
            Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879);
            Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);
    
            int diaAtual = 3;
            int mesAtual = 9;
            int anoAtual = 2024;
    
            einstein.calculaIdade(diaAtual, mesAtual, anoAtual);
            newton.calculaIdade(diaAtual, mesAtual, anoAtual);
    
            System.out.println(einstein.informaNome() + " teria " + einstein.informaIdade() + " anos se estivesse vivo.");
            System.out.println(newton.informaNome() + " teria " + newton.informaIdade() + " anos se estivesse vivo.");
        }
    }
class Pessoa {
    private int idade;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private String nome;

    public Pessoa(String nome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        ajustaDataDeNascimento(diaNascimento, mesNascimento, anoNascimento);
    }
    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        idade = anoAtual - anoNascimento;
        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento))
         {idade--;
        }
    }
    public int informaIdade() {
        return idade;
    }
    public String informaNome() {
        return nome;
    }
    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
        this.diaNascimento = dia;
        this.mesNascimento = mes;
        this.anoNascimento = ano;
    }
}
