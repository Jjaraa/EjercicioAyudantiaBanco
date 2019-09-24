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
public class Banco {
    private ArrayList<Cliente> clientes;
    private int codigo;
    
    public Banco(){
        this.clientes = new ArrayList<>();
    }
    
    public Banco(int codigo){
        this.clientes = new ArrayList<>();
        this.codigo = codigo;
    }
    
    public boolean agregarCliente(Cliente clienteNuevo){
        clientes.add(clienteNuevo);
        return true;
    }
    
    public ArrayList<Cliente> getClientes(){
        return this.clientes;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
}
