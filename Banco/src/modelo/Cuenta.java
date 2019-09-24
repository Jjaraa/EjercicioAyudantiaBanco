/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author master
 */
public class Cuenta {
    private Cliente dueño;
    private int saldo;
    
    public Cuenta(Cliente cliente){
        this.dueño = cliente;
        this.saldo = 0;
    }
    
    public Cliente getDueño(){
        return this.dueño;
    }
    
    public int getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    
}
