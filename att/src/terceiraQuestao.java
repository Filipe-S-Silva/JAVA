import java.util.Scanner;

public class terceiraQuestao {

    public static void menu() {
        System.out.println(" CÓDIGO ---------- PRODUTO -------- PREÇO");
        System.out.println("    1     ---  Cachorro Quente --- R$ 4.00");
        System.out.println("    2   -------   X-Salada   ----- R$ 4.50");
        System.out.println("    3   --------  X-Bacon   ------ R$ 5.00");
        System.out.println("    4     ---  Torrada simples --- R$ 2.00");
        System.out.println("    5    ----   Refrigerante  ---- R$ 1.50");
        System.out.println("    6    ---  Finalizar pedido --- R$ 0.00");
    }

    public static void main(String[] args) {

        //Scanner
        Scanner sc = new Scanner(System.in);

        System.out.printf("%n%n====== TERCEIRA QUESTAO =======%n%n");
        //variaveis
        byte codigo;
        double valorTotal = 0;
        double valorCompra = 0;
        int quantidade = 0;
        int quantidadeCachorroQuente = 0;
        int quantidadeX_Salada = 0;
        int quantidadeX_Bacon = 0;
        int quantidadeTorradaSimples = 0;
        int quantidadeRefrigerante = 0;
        int quantidadeTotal;

        //usuario
        do {

            menu();

            System.out.print("Digite o codigo desejado: ");
            codigo = sc.nextByte();

            if (codigo < 6 && codigo > 0 ){
                System.out.print("Digite a quantidade desejada: ");
                quantidade = sc.nextInt();
            }

            switch (codigo) {
                case 1:
                    quantidadeCachorroQuente += quantidade;
                    valorCompra = 4.00;
                    break;
                case 2:
                    quantidadeX_Salada += quantidade;
                    valorCompra = 4.50;
                    break;
                case 3:
                    quantidadeX_Bacon += quantidade;
                    valorCompra = 5.00;
                    break;
                case 4:
                    quantidadeTorradaSimples += quantidade;
                    valorCompra = 2.00;
                    break;
                case 5:
                    quantidadeRefrigerante += quantidade;
                    valorCompra = 1.50;
                    break;
                case 6:
                    System.out.println("Pedido finalizado..........");
                    break;
                default:
                    System.out.println("Codigo digitado invalido");
                    break;
            }

            valorTotal += (quantidade * valorCompra);

        } while (codigo != 6);

        System.out.printf("%n====== Produtos selecionados ========%n%n");
        System.out.println("  PRODUTO  ========  QUANTIDADE  =======  VALOR PRODUTO  ======= VALOR TOTAL");
        System.out.printf("Cachorro Quente  ======  %d  =========   R$4.00  ================  R$%.2f %n", quantidadeCachorroQuente, (double)quantidadeCachorroQuente * 4);
        System.out.printf(" X-Salada  ======  %d  =========   R$4.00  ================  R$%.2f %n", quantidadeX_Salada, (double)quantidadeX_Salada * 4.5);
        System.out.printf(" X-Bacon  ======  %d  =========   R$4.00  ================  R$%.2f %n", quantidadeX_Bacon, (double)quantidadeX_Bacon * 5);
        System.out.printf(" Torrada Simples  ======  %d  =========   R$4.00  ================  R$%.2f %n", quantidadeTorradaSimples, (double)quantidadeTorradaSimples * 2);
        System.out.printf(" Refrigerante  ======  %d  =========   R$4.00  ================  R$%.2f %n%n", quantidadeRefrigerante, (double)quantidadeRefrigerante * 1.5);

        quantidadeTotal = quantidadeCachorroQuente + quantidadeX_Salada + quantidadeX_Bacon + quantidadeTorradaSimples + quantidadeRefrigerante;

        System.out.printf("Quantidade total de produtos: %d %n", quantidadeTotal);
        System.out.printf("Valor total a pagar: R$ %.2f %n", valorTotal);

        sc.close();
    }
}
