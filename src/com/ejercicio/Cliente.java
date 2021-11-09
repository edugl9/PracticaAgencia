package com.ejercicio;

import java.util.Collection;

public class Cliente {
    private int dni;
    private String nombre;
    private String telefono;
    private String mail;
    private int ventas;

    public int getCantVentas(int CantVentas){;
        return CantVentas;
    }

    public Cliente(String nombre, int dni){
        this.nombre=nombre;
        this.dni=dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
}
