package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoUsado;
import entidades.ProdutoNormal;
import entidades.ProdutoImportado;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Produto> lista = new ArrayList<>();
        String tipoProduto;


        System.out.print("Informe a quantidade de produtos: ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {

            System.out.print("Informe o tipo de produto(normal/importado/usado): ");
            tipoProduto = sc.next().toLowerCase();

            sc.nextLine();

            System.out.print("Informe o nome do produto: ");
            String nome = sc.nextLine();

            System.out.print("Informe o valor do produto: R$");
            double preco = sc.nextDouble();
            switch (tipoProduto) {

                case "normal":

                    lista.add(new ProdutoNormal(nome, preco));

                    break;

                case "importado":

                    System.out.print("Informe o valor da taxa Alfandegaria do produto: R$");
                    double taxa = sc.nextDouble();

                    lista.add(new ProdutoImportado(nome, preco, taxa));


                    break;

                case "usado":

                    System.out.print("Informe a data fabricação: ");
                    String data = sc.nextLine();

                    lista.add(new ProdutoUsado(nome, preco, data));

                    break;

                default:

                    System.out.println("Tipo não encontrado tente novamente..........");

                    break;

            }



        }

        System.out.printf("Lista produtos \n");

        for(Produto list: lista){
            System.out.print(list.precoEntiqueta());
        }

    }


}
