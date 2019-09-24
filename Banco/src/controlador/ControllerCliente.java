/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.Cuenta;
import modelo.CuentaAhorro;
import modelo.CuentaCorriente;
import modelo.CuentaVista;

/**
 *
 * @author master
 */
public class ControllerCliente {
    
    public Cliente cliente;
    
    public ControllerCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public ArrayList<Cuenta> obtenerCuentas(){
        return this.cliente.getCuentas();
    }
    
    private boolean validarCuentas(){
        if(this.cliente.getCuentas().size()<=2){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean añadirCuentaAhorros(){
        if(validarCuentas()){
            CuentaAhorro cuentaNueva = new CuentaAhorro(this.cliente);
            this.cliente.getCuentas().add(cuentaNueva);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean añadirCuentaVista(){
        if(validarCuentas()){
            CuentaVista cuentaNueva = new CuentaVista(this.cliente);
            this.cliente.getCuentas().add(cuentaNueva);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean añadirCuentaCorriente(){
        if(validarCuentas()){
            CuentaCorriente cuentaNueva = new CuentaCorriente(this.cliente);
            this.cliente.getCuentas().add(cuentaNueva);
            return true;
        }else{
            return false;
        }        
    }
    
    private boolean validarContraseña(String contraseña){
        int numeroLetras = 0;
        int numeroDigitos = 0;
        char[] caracteres = contraseña.toCharArray();
        for(int i=0; i<caracteres.length; i++){
            if(Character.isDigit(caracteres[i])){
                numeroDigitos++;
            }
            if(Character.isLetter(caracteres[i])){
                numeroLetras++;
            }
        }
        if((numeroLetras>0)&&(numeroDigitos>0)){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean cambiarContraseña(String contraseña){
        if(validarContraseña(contraseña)){
            this.cliente.setContraseña(contraseña);
            return true;
        }else{
            return false;
        }
    }
}
