package edu.pingpong.tratamientos;

import edu.pingpong.interfaces.PedidoPeligroso;
import edu.pingpong.interfaces.TratamientoPedido;

public class TratamientoPedidoPeligroso implements TratamientoPedido {

    private final PedidoPeligroso pedido;
    public TratamientoPedidoPeligroso(PedidoPeligroso pedidoPeligroso) {
        this.pedido=pedidoPeligroso;
    }

    public boolean tratar(){
        return (this.pedido.instrucciones().equals("No ponerselo en el dedo") ? false : true);
    };
    public PedidoPeligroso getPedido(){
        return this.pedido;
    };
}
