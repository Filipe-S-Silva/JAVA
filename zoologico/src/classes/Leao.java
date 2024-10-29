package classes;

public class Leao extends Animal{

    public Leao(String nome){
        super(nome);
    }

    @Override
    public String emitirSom(){
       return  "grrrrrrrrrrrrrrrrrr";
    }

    @Override
    public String DetalheAnimal() {
        return super.DetalheAnimal();
    }

}
