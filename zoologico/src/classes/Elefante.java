package classes;

public class Elefante extends Animal{
    public Elefante(String nome){
        super(nome);
    }

    @Override
    public String emitirSom(){
        return  "prrrrrrrr";
    }

    @Override
    public String DetalheAnimal() {
        return super.DetalheAnimal();
    }
}
