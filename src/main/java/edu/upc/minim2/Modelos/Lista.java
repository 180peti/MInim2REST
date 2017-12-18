package edu.upc.minim2.Modelos;

import java.util.List;

public class Lista {

    List<Producto> lista;

    public Lista(List<Producto> lista) {
        this.lista = lista;
    }

    public List<Producto> getLista() {
        return lista;
    }

    public void setLista(List<Producto> lista) {
        this.lista = lista;
    }

    @Override
    public String toString(){
        return "{lista :" + lista + "}";
    }
}
