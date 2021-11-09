package com.ejercicio;

import java.util.Date;

public class Pasaje {
    private Date fecha;
    private String compañia;
    private String destino;

    public String getDestino() {
        return destino;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
