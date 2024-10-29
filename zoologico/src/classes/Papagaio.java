package classes;

public class Papagaio extends Animal{
    public Papagaio(String nome){
        super(nome);
    }

    @Override
    public String emitirSom(){
        return  "cawcaw";
    }

    @Override
    public String DetalheAnimal() {
        return super.DetalheAnimal();
    }
}
