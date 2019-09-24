/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Banco;
import modelo.Cliente;

/**
 *
 * @author master
 */
public class ControllerBanco {
    private Banco banco;
    
    public ControllerBanco(Banco banco){
        this.banco = banco;
    }
    
    //La contraseña automatica generada será el identificador del cliente mas las letras "aabbcc"
    private String generarPassword(Cliente cliente){
        String pass = Integer.toString(cliente.getIdentificador())+"aabbcc";
        return pass;
    }
    
    public boolean añadirCliente(int identificador, String nombreUsuario){
        Cliente clienteNuevo = new Cliente(identificador, nombreUsuario);
        String passCliente = generarPassword(clienteNuevo);
        clienteNuevo.setContraseña(passCliente);
        this.banco.agregarCliente(clienteNuevo);
        return true;
    }
}
