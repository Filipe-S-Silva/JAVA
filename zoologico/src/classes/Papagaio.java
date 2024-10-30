package classes;

public class Papagaio extends Animal{

    public Papagaio(String nome){
        super(nome, "Papagaio");
    }

    @Override
    public String emitirSom(){
        return "cawcaw";
    }
    @Override
    public String detalheAnimal() {
        return super.detalheAnimal();
    }
}
