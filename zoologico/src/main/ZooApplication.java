package main;


import java.util.Scanner;

import classes.*;


public class ZooApplication {

    public static void menuGeral(){

        System.out.println("======  Menu zoologico  ======");
        System.out.println("  1 -------- Registrar animal");
        System.out.println("  2 -------- Listar animais");
        System.out.println("  3 -------- Som animais");
        System.out.println("  0 -------- Sair");


    }

    public static void menuSom(){
        System.out.println("====  Som animais  ====");
        System.out.println("  1 -------- LEÃO");
        System.out.println("  2 -------- ELEFANTE");
        System.out.println("  3 -------- PAPAGAIO");
        System.out.println("  0 -------- Sair");

    }

    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     int codigo = 0;
     ZooManager zm = new ZooManager();
       

     do {


     menuGeral();

     System.out.print("Informe o coóigo que se deseja: ");
     codigo = sc.nextInt();

     sc.nextLine();
     switch (codigo){


         case 1:
             System.out.println("Registrar animal");
             
             System.out.print("Informe o nome do animal: ");
             String nome = sc.nextLine();

             System.out.print("Informe o tipo de animal (Leão / l), (Papagaio / p) e (Elefante - e): ");
             String tipoAnimal = sc.nextLine().toLowerCase();
             
             if (tipoAnimal.equals("leão") || tipoAnimal.equals("leao") || tipoAnimal.equals("l")){
                zm.adicionar(new Leao(nome)); 
             } else if (tipoAnimal.equals("papagaio") || tipoAnimal.equals("p")) {
                zm.adicionar(new Papagaio(nome));
             } else if (tipoAnimal.equals("elefante") || tipoAnimal.equals("e")) {
                zm.adicionar(new Elefante(nome));
             } else {
                 System.out.println("Tipo de animal inválido");
             }
             break;

         case 2:
             System.out.println("Lista animais");
              zm.listaDeAnimais();
              break;

         case 3:
             menuSom();
             System.out.print("Informe o coóigo que se deseja: ");
             codigo = sc.nextInt();

             switch (codigo){
                 case 1:
                 case 2:
                 case 3:
                     zm.som(codigo);
                     break;
                 case 0:
                     System.out.println("Saindo.........");
                     break;
                 default:
                     System.out.println("Opção inválida");
                     break;

             }
             break;

         case 0:
             System.out.println("Saindo.......");
             break;


     }


     }while(codigo != 0);


    }
}
