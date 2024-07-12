package Gabriela_Queiroz;

public class Cliente{
    private String nome;
    private String CPF;
    private int categoria;
    private int compra;
    public Cliente(String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
        this.categoria = 0;
        this.compra = 0;
    }
    public void compras(){
        this.compra++;
        if(this.compra % 3 == 0){
            this.categoria++;
            this.compra = 0;
        }
    }
    public String get_nome() {
        return nome;
    }
    public void set_nome(String nome) {
        this.nome = nome;
    }
    public String get_CPF(){
        return CPF;
    }
    public void set_CPF(String CPF){
        this.CPF = CPF;
    }
    public int get_categoria() {
        return categoria;
    }
    public void set_categoria(int categoria) {
        this.categoria = categoria;
    }
    public int get_compra() {
        return compra;
    }
    public void set_compras(int compra) {
        this.compra = compra;
    }
}
//segunda parte
package Gabriela_Queiroz;

public class Principal{
    public static void main(String[] args){
        Cliente cliente_1 = new Cliente("Gabriela Queiroz","15625436606");
        Cliente cliente_2 = new Cliente("Felipe Brito","06663452651");
        System.out.println("------------------------------");
        System.out.println("Dados do primeiro cliente:");
        System.out.println("Nome:" +cliente_1.get_nome());
        System.out.println("CPF:" +cliente_1.get_CPF());
        System.out.println("Compra:" +cliente_1.get_compra());
        System.out.println("Categoria:" +cliente_1.get_categoria());
        System.out.println("--------------------------------");
        System.out.println("Dadps do segundo cliente:");
        System.out.println("Nome:" +cliente_2.get_nome());
        System.out.println("CPF:" +cliente_2.get_CPF());
        System.out.println("Compra:" +cliente_2.get_compra());
        System.out.println("Categoria:" +cliente_2.get_categoria());
        System.out.println("--------------------------------");

        cliente_2.compras();
        System.out.println("Primeira compra do cliente Felipe Brito:");
        System.out.println("Compra:" +cliente_2.get_compra());
        System.out.println("Categoria:" +cliente_2.get_categoria());
        System.out.println("--------------------------------");

        cliente_2.compras();
        System.out.println("Terceira compra do cliente Felpe Brito finalizada:");
        System.out.println("Compra:" +cliente_1.get_compra());
        System.out.println("Categoria" +cliente_1.get_categoria());
        System.out.println("--------------------------------");

        Cliente[] clientes = new Cliente[5];
        clientes[0] = cliente_1;
        clientes[1] = cliente_2;
        clientes[2] = new Cliente("Tulio Taveira", "12345678910");
        clientes[2].set_compras(20);
        clientes[2].set_categoria(2);
        clientes[3] = new Cliente("Antonio Dornelas", "01987654321");
        clientes[3].set_compras(15);
        clientes[3].set_categoria(1);
        clientes[4] = new Cliente("Humberto Filho", "32165410987");
        clientes[4].set_compras(26);
        clientes[4].set_categoria(3);

        Cliente cliente_fiel = topCliente(clientes);
        System.out.println("Cliente mais fiel:");
        System.out.println("CPF:" + cliente_fiel.get_CPF());
        System.out.println("Nome:" + cliente_fiel.get_nome());
        System.out.println("Categoria:" + cliente_fiel.get_categoria());
        System.out.println("Compras:" + cliente_fiel.get_compra());
        System.out.println("--------------------------------");
    }
    public static Cliente topCliente(Cliente[] clientes){
        Cliente maisFiel = clientes[0];
        for(int i = 1;i < clientes.length;i++) {
            if (clientes[i].get_categoria() > maisFiel.get_categoria()||(clientes[i].get_categoria() == maisFiel.get_categoria() && clientes[i].get_compra() > maisFiel.get_compra())) {
                maisFiel = clientes[i];
            }
        }
        return maisFiel;
    }
}
