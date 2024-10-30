package classes;

public class Leao extends Animal{

    protected String som = "grrrrrrrrrrrrr";

    public Leao(String nome){
     super(nome, "Leao");
    }
    @Override
    public String emitirSom(){
     return som;
    }
    @Override
    public String detalheAnimal(){
        return super.detalheAnimal();
    }

}
