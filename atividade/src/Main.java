import java.util.Scanner;

public class Main {
    public static void menuSegunda(){
        System.out.println("CODIGO ======== FUNCAO");
        System.out.println("   1   ======== ALCOOL");
        System.out.println("   2    ====== GASOLINA");
        System.out.println("   3   ======== DIESEL");
        System.out.println("   4   ========   FIM");
    }

    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        //PRIMEIRA QUESTAO

        //variaveis
        String senhaTeste = "";

        //retorno e usuario
        do {

            System.out.print("Digite a senha");
            senhaTeste = sc.next();

            if (senhaTeste != "2002"){
                System.out.println("Senha invalida");
            }else {
                System.out.println("Acesso Permitido");
            }


        }while (senhaTeste != "2002");

        //SEGUNDA QUESTAO
        //variaveis
        byte codigo;
        int quantidadeAlcool = 0;
        int quantidadeGasolina = 0;
        int quantidadeDiesel = 0;

        do {
            //USUARIO
            menuSegunda();
            System.out.print("Informe o codigo desejado: ");
            codigo = sc.nextByte();

            //VALIDAÇÃO
            switch (codigo){
                case 1:
                    quantidadeAlcool++;
                    break;
                case 2:
                    quantidadeGasolina++;
                    break;
                case 3:
                    quantidadeDiesel++;
                    break;
                case 4:
                    System.out.println("MUITO OBRIGADO");
                    break;
                default:
                    System.out.println("Código invalido, tente novamente");
                    break;

            }

        } while (codigo != 4);

        //RETORNO
        System.out.printf("Alcool: %d %n",quantidadeAlcool);
        System.out.printf("Gasolina: %d %n",quantidadeGasolina);
        System.out.printf("Diesel: %d %n",quantidadeDiesel);

        //TERCEIRAO QUESTAO
        //VARIAVEIS
        int numero;
        int impar = 0;
        int par = 0;

        //usuario e valição
        do {

            System.out.println("Para sair insira um numero menor que 0");
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();

            if (numero > 0 && numero != 0){
               numero = numero % 2 == 0 ? par++ : impar++;
            }

        }while (numero < 0);

        //retorno
        System.out.printf("Quantidade par: %d%n", par);
        System.out.printf("Quantidade impar: %d%n", impar);

        //QUARTA QUESTAO
        //variaveis
        int n;

        //validacao
        do {
            System.out.print("Digite um numero: ");
            n = sc.nextInt();
            if (n >= 1  || n <= 5){
                System.out.println("Numero inserido entre 1 e 5");
            }
        }while (n >= 1  || n <= 5);

        //QUINTA QUESTAO
        //variaveis
        int valor;

        //usuario
        do {
            System.out.print("Digite o valor entre 1 e 1000");
            valor = sc.nextInt();

            if (valor < 1 || valor > 1000){
                System.out.println("Valor inserido menor que 1 ou maior que 1000");
            } else {
                System.out.println("Valores impares: ");
                //validacoes
                for (int i = 0; i <= valor; i++){
                    if (i % 2 == 1){
                        System.out.println(i);
                    }
                }
            }
        }while (valor < 1 || valor > 1000);

        //SEXTA QUESTAO
        //variaveis
        int in = 0;
        int out = 0;

        System.out.print("Digite a quantidade: ");
        valor = sc.nextInt();

        for (int i = 0; i <= valor; i++){

        }
    }
}