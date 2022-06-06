public class ClienteOuro extends Cliente{
    public ClienteOuro() {
        super();
    }
    private int quantDependentes;

    public int getQuantDependentes() {
        return quantDependentes;
    }

    public void setQuantDependentes(int quantDependentes) {
        this.quantDependentes = quantDependentes;
    }

    @Override
    public float getMensalidade() {
        float mensalidade = super.getMensalidade();
        return (float) (mensalidade * 0.8);
    }

    @Override
    public float getBeneficio() {
        float beneficio = super.getBeneficio();
        return (float) ( beneficio * 1.1);
    }

}
