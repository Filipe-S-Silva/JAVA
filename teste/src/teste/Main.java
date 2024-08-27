package teste;
import xadrez.Peao;
import xadrez.Bispo;
import xadrez.Cavalo;

public class Main {
    public static void main(String[] args) {

        Peao pl = new Peao();
        Bispo bp = new Bispo();
        Cavalo cl = new Cavalo();

        pl.mover();
        bp.mover();
        cl.mover();

    }
}