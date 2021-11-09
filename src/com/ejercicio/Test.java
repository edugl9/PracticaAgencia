package com.ejercicio;

public class Test {
    public static void main(String[] arg){

        Cliente c=new Cliente("Eduardo Garcia",01);
        c.getNombre();
        c.getDni();
        c.setVentas(4);

        CantProductos cp=new CantProductos();
        cp.setCantidad(5);

        Venta v=new Venta();
        v.setTotal(1500);

        Pasaje p=new Pasaje();
        p.setCompañia("AeroMEX");
        p.setDestino("Europa");

        System.out.println("Nombre: "+c.getNombre());
        System.out.println("Ide cliente: "+c.getDni());
        System.out.println("Compra: "+cp.getCantidad()+" producto(s)");
        System.out.println("Pasaje aereo: "+p.getCompañia()+" con destino a: "+p.getDestino());
        System.out.println("Total: $"+v.getTotal());
    }
}
