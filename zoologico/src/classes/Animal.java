package classes;

public abstract class Animal {

     protected String nome;
     public String getNome(){
         return nome;
     }

     public abstract String emitirSom();

     public Animal(String nome){
         this.nome = nome;
     }

     public String DetalheAnimal(){
         return "Nome do animal: " + nome +
                 "\nSom animal: " + emitirSom();
     }

}
