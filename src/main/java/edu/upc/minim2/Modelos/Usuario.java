package edu.upc.minim2.Modelos;

import java.util.ArrayList;

public class Usuario {
    String nombre;
    String pass;
    ArrayList<Pedido> pendientes,realizados;

    public Usuario(String nombre,String pass) {
        this.pendientes=new ArrayList<Pedido>();
        this.realizados=new ArrayList<Pedido>();
        this.nombre = nombre;
        this.pass=pass;
    }

    public void pedidoRealizado(){
        this.realizados.add(pendientes.remove(0));
    }

    public boolean comprobarContr(String pass){
        return this.contraseña(pass);
    }

    //GETTERS Y SETTERS

    private boolean contraseña(String pass){
        if(pass.equals(this.pass)){return true;}else{return false;}
    }

    public void setPedido(Pedido p) {
        this.pendientes.add(p);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Pedido> getRealizados() {
        return realizados;
    }

}
