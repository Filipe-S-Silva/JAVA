package entidades;

public class ProdutoImportado extends Produto {

    private double taxa;

    public double getTaxa() {
        return taxa;
    }

    public ProdutoImportado(String nome, double preco, double taxaAlfandega) {
        super(nome, preco);
        this.taxa = taxaAlfandega;
    }

    @Override
    public String precoEntiqueta() {
        double precoFinal = preco + taxa;
        return "\nProduto: " + nome
                + "\nPreço: R$" + String.format("%.2f", precoFinal)
                + "\nTaxa alfandega: R$" + String.format("%.2f", taxa);
    }

}
