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

            if (senhaTeste.intern() != "2002"){
                System.out.println("Senha invalida");
            }else {
                System.out.println("Acesso Permitido");
            }


        }while (senhaTeste.intern() != "2002");

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

        //usuario
        System.out.print("Digite a quantidade: ");
        valor = sc.nextInt();

        //usuario e validação
        for (int i = 0; i <= valor; i++){
            System.out.print("Digite o valor: ");
            n = sc.nextInt();
            n = (n >= 10 && n <= 20) ? in++ : out++;
        }

        //retorno
        System.out.printf("In: %d %n", in);
        System.out.printf("Out: %d %n", out);

        //SETIMA QUESTAO
        //variaveis
        float nota [] [] = new float [3][2];
        String [] nomeAluno = new String[3];
        String [] resultadoNomeAluno = new String[3];
        float [] media = new float[3];
        float soma = 0;
        int j;

        //usuario
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do aluno: ");
            nomeAluno[i] = sc.next();

            for (j = 0; j < 2; j++) {
                System.out.printf("Digite a %d° nota: ", j);
                nota[i][j] = sc.nextFloat();
                soma += nota[i][j];
            }
          media[i] = soma / j;
            soma = 0;
            if (media[i] >= 7){
                resultadoNomeAluno[i] = "APROVADO";
            } else {
                resultadoNomeAluno[i] = "REPROVADO";
            }
        }

        //retorno
        for (int i = 0; i < 3; i++) {
            System.out.printf("Nome do aluno: %s %n",nomeAluno[i]);

            for (j = 0; j < 2; j++) {
                System.out.printf("%d° nota: %.2f %n", j, nota[i][j]);
            }
            System.out.printf("Situação: %s %n", resultadoNomeAluno[i]);
        }

        //OITAVA QUESTAO
        //usuario
        System.out.print("Digite um valor: ");
        n = sc.nextInt();

        //retorno
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d x %d = %d %n", n, i, n*i);
        }

        //NOVE QUESTAO
        System.out.print("Digite o valor: ");
        valor = sc.nextInt();

            System.out.println("Valores impares: ");
            //validacoes
            for (int i = 0; i <= valor; i++){
                if (i % 2 == 1){
                    System.out.println(i);
                }
            }
        }
    }
