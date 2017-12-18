package edu.upc.minim2.Modelos;

public class Producto {

    String nombre;
    int precio,ventas;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.ventas=0;
    }
    public Producto(){

    }


    //GETTERS Y SETTERS


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    @Override
    public String toString(){
        return "Producto {nombre="+this.nombre+", precio="+this.precio+", ventas="+this.ventas+"}";
    }

}
