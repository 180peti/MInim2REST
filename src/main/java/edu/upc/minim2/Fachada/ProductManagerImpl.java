package edu.upc.minim2.Fachada;

import edu.upc.minim2.Modelos.Pedido;
import edu.upc.minim2.Modelos.Producto;
import edu.upc.minim2.Modelos.Usuario;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductManagerImpl implements ProductManager {

    private List<Producto> productos;
    private HashMap<String,Usuario> usuarios;
    private List<Pedido> pedidos,realizados;
    private static ProductManagerImpl instance;
    final Logger log= Logger.getLogger(ProductManagerImpl.class);

    public ProductManagerImpl() {
        org.apache.log4j.BasicConfigurator.configure();
        this.setProductos(new ArrayList<Producto>());
        this.setUsuarios(new HashMap<String, Usuario>());
        this.setPedidos(new ArrayList<Pedido>());
        this.setRealizados(new ArrayList<Pedido>());

        Producto a=new Producto("Leche",5);
        this.setProducto(a);
        a=new Producto("Pan",2);
        this.setProducto(a);
        a=new Producto("Huevos",10);
        this.setProducto(a);
        a=new Producto("Jamon",7);
        this.setProducto(a);
        a=new Producto("Pizza",15);
        this.setProducto(a);
        a=new Producto("Pescado",13);
        this.setProducto(a);

        Usuario u=new Usuario("Pepe","1234");
        this.setUsuario(u);
        u=new Usuario("Pol","contraseña");
        this.setUsuario(u);
        u=new Usuario("Ruben","admin");
        this.setUsuario(u);
    }

    public static ProductManagerImpl getInstance(){
        if(instance==null) instance=new ProductManagerImpl();
        return instance;
    }

    private void ordenarP(List<Producto> cosas){

        //this.setProductos(new ArrayList<Producto>(cosas.size()));
        Producto buf;
        for(int i=0;i<cosas.size();i++){
            for(int j=0;j<cosas.size();j++){
                if(i!=j){
                    if(cosas.get(i).getPrecio()>cosas.get(j).getPrecio()&&i<j){
                        buf=cosas.remove(i);
                        cosas.add(i,cosas.remove(j-1));
                        cosas.add(j,buf);
                    }
                }
            }
        }
        this.setProductos(cosas);

    }

    public List<Producto> productosPrecio() {
        log.info(productos);
        this.ordenarP(productos);
        log.info(productos);
        return productos;
    }


    public ArrayList<Pedido> pedidosUsuario(String user) {
        ArrayList<Pedido> realizados=new ArrayList<Pedido>();
        if(this.getUsuarios().containsKey(user))
        {
            realizados=this.getUsuarios().get(user).getRealizados();
        }
        log.info(realizados);
        return realizados;
    }

    public boolean logIn(String user, String pass){
        boolean hecho=false;
        if(this.getUsuarios().containsKey(user))
        {
            hecho=this.getUsuarios().get(user).comprobarContr(pass);
        }
        return hecho;
    }


    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void setProducto(Producto p){this.getProductos().add(p);}

    public HashMap<String, Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashMap<String, Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void setUsuario(Usuario u){this.getUsuarios().put(u.getNombre(),u);}

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public List<Pedido> getRealizados() {
        return realizados;
    }

    public void setRealizados(List<Pedido> realizados) {
        this.realizados = realizados;
    }

    public static void setInstance(ProductManagerImpl instance) {
        ProductManagerImpl.instance = instance;
    }

    @Override
    public String toString(){
        String cosas="Productos[";
        for(Producto p:this.getProductos()){
            cosas=cosas+p+"\n";
        }
        cosas=cosas+"]";
        return cosas;
    }
}
