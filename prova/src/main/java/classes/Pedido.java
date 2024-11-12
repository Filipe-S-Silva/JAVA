package classes;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    protected int id;
    protected List<Alimento> alimento;
    protected float valor;

    public Pedido(int id) {
        this.id = id;
        this.alimento = new ArrayList<>();
        this.valor = 0;
    }
    
    public void adicionarPedido(Alimento alimento_) {
        alimento.add(alimento_);
        valor += alimento_.getValor();
    }
    
    public float valorTotal(){
        return valor;
    }  
    

    public void listaPedido() {
        System.out.println("Id do pedido " + id);
        for(Alimento alimentos: alimento){
            System.out.println(alimentos.AlimentoPedido());
        }
        System.out.println("Valor pagar: R$" + valor);
        System.out.printf("\n\n==================");

    }



}
