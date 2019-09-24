/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modelo.Cliente;

/**
 *
 * @author dci
 */
public interface IClienteDao {

       public void guardarCliente(Cliente cliente);
       public void actualizarCliente(Cliente cliente);
       public void cargarClientes();
       
}
