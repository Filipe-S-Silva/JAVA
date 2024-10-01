package entidades;

public abstract class Produto {

    String nome;
    double preco;


    public Produto(String nome, double preco) {

        this.nome = nome;
        this.preco = preco;

    }

    public abstract String precoEntiqueta();

}
