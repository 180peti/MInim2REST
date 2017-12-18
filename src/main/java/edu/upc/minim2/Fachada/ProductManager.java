package edu.upc.minim2.Fachada;

import edu.upc.minim2.Modelos.Pedido;
import edu.upc.minim2.Modelos.Producto;

import java.util.ArrayList;
import java.util.List;

public interface ProductManager {


    List<Producto> productosPrecio();

    ArrayList<Pedido> pedidosUsuario(String user);

    boolean logIn(String user, String pass);
}
