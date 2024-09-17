package entidade;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeProduto;
    public double getPreco() {
        return preco;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public Produto(String nome, double preco, int quantidade){

        this.nome = nome;
        this.preco = preco;
        this.quantidadeProduto = quantidade;

    }

    public double totalestoque(){
        return quantidadeProduto * preco;
    }

    public void addProduto(int quantidade){
        quantidadeProduto += quantidade;
    }
    public void removerProduto(int quantidade){
        quantidadeProduto -= quantidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome
                + ", preço: R$" + preco
                 + ", quantidade estoque: " + quantidadeProduto
                  + ", valor total do estoque: R$" + String.format("%.2f", totalestoque());
    }

}
