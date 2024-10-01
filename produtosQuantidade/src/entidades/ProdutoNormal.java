package entidades;

public class ProdutoNormal extends Produto{


    public ProdutoNormal(String nome, double preco){
        super(nome, preco);
    }

    @Override
    public String precoEntiqueta(){
        return "\nProduto: " + nome
                + "\nPreço: R$" + String.format("%.2f", preco);
    };

}
