import java.util.*;

public class Principal {
    public static Negocio negocio = new Negocio();
    public static Scanner scan = new Scanner(System.in);
    public static void cadastrarCliente() {
        Cliente cliente = new Cliente();
        System.out.println("Qual é o nome do cliente");
        cliente.setNome(scan.nextLine());
        System.out.println("Quanto é a mensalidade do cliente");
        cliente.setMensalidade(scan.nextFloat());
        System.out.println("Qual é o beneficio do cliente");
        cliente.setBeneficio(scan.nextFloat());

        negocio.adicionarCliente(cliente);
    }
    public static void cadastrarClienteOuro() {
        ClienteOuro cliente = new ClienteOuro();
        System.out.println("Qual é o nome do cliente");
        cliente.setNome(scan.nextLine());
        System.out.println("Quanto é a mensalidade do cliente");
        cliente.setMensalidade(scan.nextFloat());
        System.out.println("Qual é o beneficio do cliente");
        cliente.setBeneficio(scan.nextFloat());

        negocio.adicionarClienteOuro(cliente);
    }
    public static void totalMensalidades() {
        System.out.println("O total de mensalidades é: " + negocio.totalMensalidades());
    }
    public static void totalBeneficios() {
        System.out.println("O total de beneficios é: " + negocio.totalBeneficios());
    }
    public static void listaNomeClientesOuro() {
        System.out.println("Lista de nomes de clientes de ouro: " + negocio.listaNomeClientesOuro());
    }
    public static void main(String[] args) {
        int escolha = -1;
        while (escolha != 0) {
            System.out.println("Qual opcao voce deseja?");
            System.out.println("0 - Sair");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Cliente Ouro");
            System.out.println("3 - Mostrar o total de mensalidade");
            System.out.println("4 - Mostrar o total de beneficios");
            System.out.println("5 - Mostrar lista de nomes de clientes de ouro");
            escolha = scan.nextInt();
            switch (escolha) {
                case 0:
                    break;
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarClienteOuro();
                    break;
                case 3:
                    totalMensalidades();
                    break;
                case 4:
                    totalBeneficios();
                    break;
                case 5:
                    listaNomeClientesOuro();
                    break;
                default:
                    System.out.println("Escolha uma opcao valida");
                    break;
            }
        }
    }
}
