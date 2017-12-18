package edu.upc.minim2.Modelos;

public class Producto {

    String nombre;
    int precio,ventas;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.ventas=0;
    }


    //GETTERS Y SETTERS


    public void setVentas(int ventas) {
        this.ventas = this.ventas + ventas;
    }

    public int getPrecio() {
        return precio;
    }

    public int getVentas() {
        return ventas;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString(){
        return "Producto {nomre="+this.nombre+", precio="+this.precio+", ventas="+this.ventas+"}";
    }

}
