public class Cliente {
    private String nome;
    private float mensalidade;
    private float beneficio;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getMensalidade() {
        return mensalidade - beneficio;
    }

    public void setMensalidade(float valor) {
        this.mensalidade = valor;
    }

    public float getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(float valor) {
        this.beneficio = valor;
    }

    public String toString() {
        return this.nome;
    }
}
