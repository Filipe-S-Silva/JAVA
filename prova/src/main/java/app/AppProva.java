package app;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import classes.*;
import java.util.Iterator;

public class AppProva {

    public static void menu() {

        System.out.println("==== MENU ====");
        System.out.println(" 1 --------- adicionar");
        System.out.println(" 2 --------- listar pedidos");
        System.out.println(" 0 --------- sair");

    }

    
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Pedido> pedidos = new ArrayList<>();
        Pedido pedido;
        int id = 1;
        int codigo = 0;
        
   
        
        do {

            menu();
            System.out.print("Informe o codigo desejado: ");
            codigo = sc.nextInt();

            sc.nextLine();

            switch (codigo) {
                case 1:
                    pedido = new Pedido(id);

                    while(true){
                    System.out.print("Informe o nome do alimento: ");
                    String nome = sc.nextLine();

                    System.out.print("Informe o valor do alimento: R$");
                    float preco = sc.nextFloat();

                    sc.nextLine();

                    System.out.print("Informe o tipo de alimento (Comida/c), (Bebida/bedida)");
                    String tipoAlimento = sc.nextLine().toUpperCase();

                    Alimento alimento = new Alimento(nome, tipoAlimento, preco);
                    pedido.adicionarPedido(alimento);

                    System.out.print("Deseja adicionar mais itens(sim), (nao): ");
                    String codigoItem = sc.nextLine().toLowerCase();
                    if (codigoItem.equalsIgnoreCase("sim")||codigoItem.equalsIgnoreCase("s")) {
                        pedidos.add(pedido);
                        continue;
                    } else if (codigoItem.equalsIgnoreCase("nao") || codigoItem.equalsIgnoreCase("n")) {
                        id++;
                        break;
                    }
                    }

                    break;
                case 2:

                    if (pedidos.isEmpty()) {
                        System.out.println("Não há pedidos cadastrados.");
                    } else {
                        for (Pedido p : pedidos) {
                            p.listaPedido();
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo.........");
                    break;
                default:
                    break;
            }

        } while (codigo != 0);

    }
}
