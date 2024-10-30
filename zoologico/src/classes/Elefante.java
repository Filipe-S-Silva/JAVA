package classes;

public class Elefante extends Animal{

    public Elefante (String nome){
        super(nome, "Elefante");
    }

    @Override
    public String emitirSom(){
        return "prrrrrrrr";
    }

    @Override
    public String detalheAnimal(){
        return super.detalheAnimal();
    }

}
