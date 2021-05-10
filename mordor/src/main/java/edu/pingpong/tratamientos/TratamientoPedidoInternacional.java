package edu.pingpong.tratamientos;

import edu.pingpong.interfaces.TratamientoPedido;
import edu.pingpong.pedidos.PedidoInternacional;

public class TratamientoPedidoInternacional implements TratamientoPedido {

    private final PedidoInternacional pedido;
    public TratamientoPedidoInternacional(PedidoInternacional pedido) {
        this.pedido=pedido;
    }

    public boolean tratar(){
        return (!this.pedido.destino().equals("Mordor"));
    };
    public PedidoInternacional getPedido(){
        return this.pedido;
    };
}
