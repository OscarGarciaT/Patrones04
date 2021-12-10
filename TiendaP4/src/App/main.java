/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Adapter.*;
import Singleton.Inventario;
import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class main {   
    
    public static void main(String[] args){
        
        InventarioWeb inventarioCliente = new InventarioAdapter();
        InventarioProveedor inventarioProovedor = new InventarioAdapter();
        InventarioVendedor inventarioVendedor = new InventarioAdapter();
        InventarioMantenimiento inventarioMantenimiento = new InventarioAdapter();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Que tipo de usuario es ?");
        System.out.println("1. Cliente");
        System.out.println("2. Proveedor");
        System.out.println("3. Vendedor");
        System.out.println("4. Departamento Tecnico");
        
        
        switch(scanner.nextInt()){
            case 1:
                inventarioCliente.showAll();
                break;
            case 2:
                inventarioProovedor.showFails();
                break;
            case 3:
                inventarioVendedor.showStock();
                break;
            case 4:
                inventarioMantenimiento.showReparing();
                break;
        }
        
    }
}
