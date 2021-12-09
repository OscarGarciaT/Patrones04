/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import SinPatron.Producto;

/**
 *
 * @author oscar
 */
public class AereaStrategy implements EntregaStrategy {

    @Override
    public void entrega(Producto p) {
        System.out.println("Se ha realizado la entrega de [ " + p.getNombre() + " ] mediante via aerea");;
    }
    
}
