/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinPatron;

import java.util.ArrayList;

/**
 *
 * @author oscar
 */
public class Producto {
    String nombre;
    String estado;
    //String tienda;
    
    public Producto(String nombre){
        this.nombre = nombre;   
    }
    
    public Producto(String nombre, String estado){
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public static ArrayList<Producto> inicializarInventario(){
        ArrayList<Producto> retorno = new ArrayList<>();
        
        retorno.add(new Producto("computer 1","Reparacion"));
        retorno.add(new Producto("computer 2","Falla"));
        retorno.add(new Producto("computer 3","Reparacion"));
        retorno.add(new Producto("computer 4","Normal"));
        retorno.add(new Producto("computer 5","Falla"));
        retorno.add(new Producto("computer 6","Normal"));
        retorno.add(new Producto("computer 7","Normal"));
        
        return retorno;
    }

    
}
