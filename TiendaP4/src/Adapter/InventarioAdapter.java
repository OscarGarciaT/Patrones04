/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import Singleton.Inventario;

/**
 *
 * @author oscar
 */
public class InventarioAdapter implements InventarioWeb, InventarioVendedor, InventarioProveedor, InventarioMantenimiento {
    
    private Inventario inventario = Inventario.getInstance();
    
    public void show(){
        for(int i = 0; i < inventario.getProductos().size(); i++ ){
            System.out.println((i+1) + ". " + inventario.getProductos().get(i).getNombre() + "\n");
        }
    }

    @Override
    public void showAll() {
        for(int i = 0; i < inventario.getProductos().size(); i++ ){
           System.out.println((i+1) + ". " + inventario.getProductos().get(i).getNombre() + "\n");
        }
    }

    @Override
    public void showStock() {
        System.out.println("Se imprime el stock");
    }

    @Override
    public void showFails() {
         System.out.println("Se imprime los productos con fallas");
    }

    @Override
    public void showReparing() {
         System.out.println("Se imprime los productos en mantenimiento");
    }
}
