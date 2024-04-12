//é necessario implementar o gets sets para o usuario conseguir mudar a sua anotaçao caso ele tenha errado, pois no codigo atual isso nao é possível(esta privado)
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
    private void validarData(){
        if((dia < 0) && (dia > 31) && (mes < 0) && (mes > 12)){
            this.dia = 0;
            this.mes = 0;
            this.ano = 0;
            this.anotacao = "Anotaçao invalida! Essa data nao existe";
        }
    }
    public void setAnotacao(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano + "/" + this.anotacao);
    }
}
