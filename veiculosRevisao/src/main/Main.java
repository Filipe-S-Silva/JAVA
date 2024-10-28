package main;

import entidades.Carro;
import entidades.Moto;
import entidades.Veiculo;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Classes e array
        Veiculo vei;
        List<Veiculo> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantiade de veiculos para adicionar: ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {

            sc.nextLine();

            System.out.print("Informe a marca do veiculo: ");
            String marcaVeiculo = sc.nextLine();

            System.out.print("Informe o modelo do veiculo: ");
            String modeloVeiculo = sc.nextLine();

            System.out.print("Informe o tipo do veiculo, carro(c)/moto(m)");
            String tipoVeiculo = sc.nextLine().toLowerCase();

            if (tipoVeiculo.equals("carro") || tipoVeiculo.equals("c")){

                System.out.print("Informe o numero de portas do veiculo: ");
                int quantidadePortas = sc.nextInt();

                vei = new Carro(marcaVeiculo,modeloVeiculo, quantidadePortas);

                list.add(vei);

            } else if (tipoVeiculo.equals("moto") || tipoVeiculo.equals("m")) {

                System.out.print("Informe as cilindradas do veiculo: ");
                int quantidadeCilindradas = sc.nextInt();

                vei = new Moto(marcaVeiculo,modeloVeiculo, quantidadeCilindradas);
                list.add(vei);

            } else {
                System.out.println("Tipo de veiculo invalido tente novamente");
                i--;
            }

        }

        for (Veiculo veiculo:list){
            System.out.print(veiculo.exibirDetalhes());
        }

    }
}