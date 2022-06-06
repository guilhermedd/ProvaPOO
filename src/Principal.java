import java.util.*;

public class Principal {
    public static Negocio negocio = new Negocio();
    public static Scanner scan = new Scanner(System.in);
    public static void cadastrarCliente(){
        Cliente cliente = new Cliente();
        System.out.println("Qual é o nome do cliente");
        cliente.setNome(scan.nextLine());
        System.out.println("Quanto é a mensalidade do cliente");
        cliente.setMensalidade(scan.nextFloat());
        System.out.println("Qual é o beneficio do cliente");
        cliente.setBeneficio(scan.nextFloat());
        
        negocio.adicionarCliente(cliente);
    }
    public static void cadastrarClienteOuro(){}
    public static void totalMensalidades(){}
    public static void totalBeneficios(){}
    public static void listaNomeClientesOuro(){}
    public static void main(String[] args) {

    }
}
