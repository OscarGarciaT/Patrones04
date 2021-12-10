/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import SinPatron.Producto;
import java.util.ArrayList;

/**
 *
 * @author oscar
 */
public class Inventario {
    
    private static Inventario instancia;
    
    private static ArrayList<Producto> productos;
    
    private Inventario(){
        productos = Producto.inicializarInventario();
    }
    
    public static Inventario getInstance(){
        if(Inventario.instancia == null){
            Inventario.instancia = new Inventario();
            return Inventario.instancia;
        } else {
            return Inventario.instancia;
        }  
    }
    
    public ArrayList<Producto> getProductos(){
        return Inventario.productos;
    }
    
}
