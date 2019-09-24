/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Cuenta;

/**
 *
 * @author master
 */
public class ControllerCuenta {
    public Cuenta cuenta;
    
    public ControllerCuenta(Cuenta cuenta){
        this.cuenta = cuenta;
    }
    
    public boolean añadirSaldo(int cantidad){
        this.cuenta.setSaldo(this.cuenta.getSaldo() + cantidad);
        return true;
    }
    
    public boolean girarDinero(int cantidad){
        if(this.cuenta.getSaldo()>cantidad){
            this.cuenta.setSaldo(this.cuenta.getSaldo()-cantidad);
            return true;
        }else{
            return false;
        }
    }
}
