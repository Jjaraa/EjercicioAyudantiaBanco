/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author master
 */
public class Cliente {
    private int identificador;
    private String nombreCliente;
    private String contraseña;
    private ArrayList<Cuenta> cuentas;
    
    public Cliente(int identificador, String nombreCliente, String contraseña){
        this.cuentas = new ArrayList<>();
        this.identificador = identificador;
        this.nombreCliente = nombreCliente;
        this.contraseña = contraseña;
        
    }
    
    public Cliente(int identificador, String nombreCliente){
        this.cuentas = new ArrayList<>();
        this.identificador = identificador;
        this.nombreCliente = nombreCliente;        
    
    }
    
    public int getIdentificador(){
        return this.identificador;
    }
    
    public String getNombreCliente(){
        return this.nombreCliente;
    }
    
    public String getContraseña(){
        return this.contraseña;
    }
    
    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }
    
    public ArrayList<Cuenta> getCuentas(){
        return this.cuentas;
    }
    
    public boolean agregarCuenta(Cuenta cuentaNueva){
        this.cuentas.add(cuentaNueva);
        return true;
    }
}
