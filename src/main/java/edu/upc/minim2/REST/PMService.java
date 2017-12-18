package edu.upc.minim2.REST;

import edu.upc.minim2.Fachada.ProductManagerImpl;
import edu.upc.minim2.Modelos.Lista;
import edu.upc.minim2.Modelos.Pedido;
import edu.upc.minim2.Modelos.Producto;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/cafeteria/")
public class PMService {

    ProductManagerImpl test=ProductManagerImpl.getInstance();

        @Path("/productos/precio")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Producto> productosPrecio(){
        //NO consigo que salga en el navegador la lista (me estaba fijando en "rest-example-lluis")
        Lista converter=new Lista(test.productosPrecio());
        return converter.getLista();
    }

    @Path("/{user}/realizados")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pedido> pedidosRealizados(@PathParam("user") String user){
        return test.pedidosUsuario(user);
    }

    @Path("/{user}/")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Boolean logIn(@PathParam("user") String user,@QueryParam("pass") String pass){
        return test.logIn(user,pass);
    }
}
