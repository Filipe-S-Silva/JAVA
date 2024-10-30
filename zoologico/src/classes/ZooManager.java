package classes;
import java.util.List;
import java.util.ArrayList;


public class ZooManager {


    protected Leao leao;
    protected Papagaio papagaio;
    protected Elefante elefante;

    public Papagaio getPapagaio() {
        return papagaio;
    }

    public Elefante getElefante() {
        return elefante;
    }

    public Leao getLeao() {
        return leao;
    }

    protected List<Animal> animal;

    public ZooManager(){
        this.animal = new ArrayList<>();
    }

    public void listaDeAnimais(){

        for(Animal ani : animal){
            System.out.println(ani.detalheAnimal());
        }

    }

    public void adicionar(Animal ani){
        animal.add(ani);
    }

    public void som(int codigo){

        switch (codigo){

            case 1:
                System.out.println("grrrrrrrrrrrrr");
            break;

            case 2:
                System.out.println("prrrrrrrr");
                break;

            case 3:
                System.out.println("cawcaw");
            break;
        }
    }

}
