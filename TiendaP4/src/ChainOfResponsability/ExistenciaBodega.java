/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsability;

import SinPatron.Producto;

/**
 *
 * @author oscar
 */
public class ExistenciaBodega implements CambioProducto{
    
    @Override
    public boolean verificar(Producto p) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public boolean masDe1000(){
        return true;
    }
    
}
