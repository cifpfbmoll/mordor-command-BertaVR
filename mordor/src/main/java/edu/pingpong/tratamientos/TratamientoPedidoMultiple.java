package edu.pingpong.tratamientos;

import edu.pingpong.interfaces.Pedido;
import edu.pingpong.interfaces.TratamientoPedido;

import java.util.Set;

public class TratamientoPedidoMultiple implements TratamientoPedido {

    private final Set<Pedido> pedidos;
    private Integer pesoTotal;
    private Long numBultos;

    public TratamientoPedidoMultiple(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void calcularPesoTotal() {
        this.pesoTotal = pedidos
                .stream()
                .map(Pedido::peso)
                .reduce(0, Integer::sum);
    }

    public void calcularTotalBultos() {
        this.numBultos = pedidos
                .stream()
                .count();
    }

    @Override
    public boolean tratar() {
        calcularPesoTotal();
        calcularTotalBultos();
        return (pesoTotal > 0 && numBultos == pedidos.size());
    }

    public Integer getPesoTotal() {
        return this.pesoTotal;
    }

    public Long getNumBultos() {
        return this.numBultos;
    }


}
