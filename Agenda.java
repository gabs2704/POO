package Agenda;

public class Agenda {
    private int dia;
    private int mes;
    private int ano;
    private String anotacao;


    public void anote( int dia, int mes, int ano, String nota){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.anotacao = nota; 
        validarData(); 
    } 
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAnotacao() {
        return anotacao;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }

    private void validarData(){
        if((dia < 0) && (dia > 31) && (mes < 0) && (mes > 12) && (ano < 0)){
            this.dia = 0;
            this.mes = 0;
            this.ano = 0;
            this.anotacao = "Anotaçao invalida! Essa data nao existe";
        }
    }
    public void mostrarAnotacao(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano + "/" + this.anotacao);
    }
}
