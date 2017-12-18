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

    public Pedido(){
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

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public HashMap<String, Integer> getCantidades() {
        return cantidades;
    }

    public void setCantidades(HashMap<String, Integer> cantidades) {
        this.cantidades = cantidades;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString(){
        String cosas="Productos[";
        for(Producto p:productos){
            cosas=cosas+p.getNombre()+" "+cantidades.get(p.getNombre())+"\n";
        }
        cosas=cosas+"]";
        return cosas;
    }
}
