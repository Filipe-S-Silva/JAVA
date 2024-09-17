package app;
import java.util.Scanner;
import entidade.Produto;

public class Program {
    public static void main(String[] args) {

        //variaveis
        Scanner sc = new Scanner(System.in);

        //entrada

        System.out.print("Informe o nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Informe o valor do preço: R$");
        double preco = sc.nextDouble();

        System.out.print("Informe a quantidade: ");
        int quantidade = sc.nextInt();

        //ligando o objeto
        Produto produto = new Produto(nome, preco, quantidade);

        //mostrando dados do produto
        System.out.println(produto);

        //entrada produto
        System.out.println("Adicionar mais produtos");
        System.out.print("Informe a quantidade para adicionar: ");
        quantidade = sc.nextInt();

        //metodo adicionar quantidade
        produto.addProduto(quantidade);

        //mostrando dados do produto com nova quantidae
        System.out.println(produto);

        //saida produto
        System.out.println("Saida dos produtos");
        System.out.print("Informe a quantidade para retirar: ");
        quantidade = sc.nextInt();

        //metodo retirar quantidade
        produto.removerProduto(quantidade);

        //mostrando dados do produto com nova quantidae
        System.out.println(produto);







    }
}
