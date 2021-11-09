package com.ejercicio;

import java.util.Collection;

public class Venta {
    private int num;
    private Collection items;
    private Cliente cliente;
    private double total;

    public double getTotal(Collection descuentos){
        return total;
    }

    public boolean validarDestino(String destino){
        return true;
    }

    public void confirmarVenta(){

    }

    public double getTotal() {
        CantProductos cp=new CantProductos();
        double descuento=cp.getDescuento();
        total-= descuento;
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
