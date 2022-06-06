public class Negocio {
    private Cliente[] clientes = new Cliente[50];
    private int quantidadeClientes = 0;
    private int getQuantidadeClientesOuro = 0;

    public void adicionarCliente(Cliente cliente) {
        this.clientes[quantidadeClientes] = cliente;
        this.quantidadeClientes++;
    }

    public void adicionarClienteOuro(ClienteOuro cliente) {
        this.clientes[getQuantidadeClientesOuro] = cliente;
        this.getQuantidadeClientesOuro++;
        this.quantidadeClientes++;
    }

    public float totalMensalidades() {
        float mensalidade = 0;
        for(int i = 0; i < quantidadeClientes; i++) {
            mensalidade += clientes[i].getMensalidade();
        }
        return mensalidade;
    }

    public float totalBeneficios() {
        float beneficio = 0;
        for(int i = 0; i < quantidadeClientes; i++) {
            beneficio += clientes[i].getBeneficio();
        }
        return beneficio;
    }

    public String[] listaNomeClientesOuro() {
        String[] nomes = new String[getQuantidadeClientesOuro];
        for(int i = 0; i < quantidadeClientes; i++) {
            if (clientes[i] instanceof  ClienteOuro) {
                nomes[i] = clientes[i].getNome();
            }
        }
        return nomes;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public Cliente[] getClientesOuro() {
        return clientes;
    }
}
