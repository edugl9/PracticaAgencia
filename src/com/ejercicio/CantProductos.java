package com.ejercicio;

public class CantProductos {
    private float porcentaje;
    private int cantidad;
    private Cliente cliente;
    private double descuento;

    Venta v=new Venta();
    Pasaje p=new Pasaje();

    public void getDescuento(double descuento){
        double descuento1;
        double descuento2;
        double descuento3;

        Cliente c=new Cliente("",0);
        if (c.getVentas() > 3) {
            descuento1= v.getTotal() *0.05;
        }else {
            descuento1=0;
        }

        if (getCantidad() > 4){
            descuento2= v.getTotal() *0.03;
        }else {
            descuento2=0;
        }

        if (p.getDestino() == "Europa"){
            descuento3= v.getTotal()*0.03;
        }else {
            descuento3=0;
        }
        descuento=descuento1+descuento2+descuento3;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
