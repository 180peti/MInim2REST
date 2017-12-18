package edu.upc.minim2.Modelos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pedido {



    List<Producto> productos;
    HashMap<String, Integer> cantidades;
    String usuario;

    public Pedido(String usuario) {
        this.usuario = usuario;
        this.productos=new ArrayList<Producto>();
        this.cantidades=new HashMap<String, Integer>();

    }


    public void añadirProducto(Producto pr,int cantidad){
        if(productos.contains(pr)){
            cantidades.put(pr.getNombre(),cantidades.get(pr.getNombre())+cantidad);
        }else{
            productos.add(pr);
            cantidades.put(pr.getNombre(),cantidad);
        }
    }

    //GETTERS Y SETTERS


    public List<Producto> getProductos() {
        return productos;
    }

    public HashMap<String, Integer> getCantidades() {
        return cantidades;
    }

    public String getUsuario() {
        return usuario;
    }

}
