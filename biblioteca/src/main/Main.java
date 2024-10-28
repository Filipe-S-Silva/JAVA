package main;
import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;
import entidades.ItemBiblioteca;
import entidades.Livro;
import entidades.Revista;

public class Main {

    public static void main(String[] args) {

        //ativação bibliotecas e varivaveis

        List<ItemBiblioteca> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int soma = 0;


        //quantidades itens
        System.out.print("Informe a quantidade de itens para adicionar: ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++){

            sc.nextLine();

            System.out.print("Informe o tipo de item ( livro(l) / revista(r) ): ");
            String tipoItem = sc.nextLine().toLowerCase();

            System.out.print("Informe o título do item: ");
            String titulo = sc.nextLine().toUpperCase();

            System.out.print("Informe o código do item: ");
            String codigo = sc.nextLine().toUpperCase();

            if ((tipoItem.equals("livro")) || (tipoItem.equals("l"))){

                System.out.print("Informe o nome do autor: ");
                String nomeAutor = sc.nextLine().toUpperCase();

                System.out.print("Informe o numero de páginas: ");
                int numeroPaginas = sc.nextInt();

                lista.add(new Livro(titulo, codigo, nomeAutor, numeroPaginas));

                soma += numeroPaginas;

            } else if ((tipoItem.equals("revista")) || (tipoItem.equals("r")) ) {

                System.out.print("Informe o mês de publicação: ");
                String mesPublicacao = sc.nextLine().toUpperCase();

                System.out.print("Informe a edicação da revista: ");
                String edicao = sc.nextLine().toUpperCase();


                lista.add(new Revista(titulo, codigo, mesPublicacao, edicao));

            } else {
                System.out.println("Tipo de item invalido tente novamente");
                i--;
            }

        }


        for (ItemBiblioteca itens: lista){
            System.out.println(itens.exibirDetalhes());
        }

        System.out.printf("Total de páginas lidas nos livros cadastrados: %d", soma);
    }
}