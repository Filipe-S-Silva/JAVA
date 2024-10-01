package entidades;

public class ProdutoUsado extends Produto {
    private String data;


    public String getData() {
        return data;
    }

    public ProdutoUsado(String nome, double preco, String data) {
        super(nome, preco);
        this.data = data;
    }

    @Override
    public String precoEntiqueta() {
        return "\nProduto: " + nome
                + "\n Preço: R$" + String.format("%.2f", preco)
                + "\n Data fabricação: " + data;
    }
}
