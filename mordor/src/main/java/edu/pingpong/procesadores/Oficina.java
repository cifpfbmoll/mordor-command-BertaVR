package edu.pingpong.procesadores;

import edu.pingpong.interfaces.Pedido;
import edu.pingpong.interfaces.Procesador;
import edu.pingpong.interfaces.Status;
import edu.pingpong.interfaces.TratamientoPedido;

public class Oficina implements Procesador {
    @Override
    public boolean procesa(TratamientoPedido tratamientoPedido) {
        return tratamientoPedido.tratar();
    }


    public String printarStatus(boolean isTratable, Pedido pedido) {
        return isTratable ? pedido.destino() + ' ' + Status.ACEPTADO.name()
                : pedido.destino() + ' ' + Status.RECHAZADO.name();

    }
}
