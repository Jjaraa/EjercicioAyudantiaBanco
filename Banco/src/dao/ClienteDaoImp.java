/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Cliente;

/**
 *
 * @author dci
 */
public class ClienteDaoImp extends Conector implements IClienteDao {
    ArrayList<Cliente> clientes;
    
    public ClienteDaoImp(){
        clientes = new ArrayList<>();
    }
    
    @Override
    public void guardarCliente(Cliente cliente) {
        conectarDB();
        try {
            ps = conn.prepareStatement("insert into Clientes (identificador,nombreCliente,contraseña) values ("+cliente.getIdentificador()+cliente.getNombreCliente()+cliente.getContraseña()+");");
            
            int res = ps.executeUpdate();
            
            if(res>0){
                System.out.println("Dato ingresado correctamente");
            }else{
                System.out.println("Dato no ingresado");
            }
            
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
    }


    @Override
    public void cargarClientes() {
        conectarDB();
        try {
            ps = conn.prepareStatement("select * from Cliente;");
            rs = ps.executeQuery();
            while(rs.next()){
                Cliente cliente = new Cliente(rs.getInt("identificador"),rs.getString("nombreCliente"),rs.getString("contraseña"));
                this.clientes.add(cliente);
            }
            
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void actualizarCliente(Cliente cliente) {
        conectarDB();
        try {
            ps = conn.prepareStatement("update Clientes set contraseña="+cliente.getContraseña()+" where identificador="+cliente.getIdentificador()+";");
            
            int res = ps.executeUpdate();
            
            if(res>0){
                System.out.println("Dato actualizado correctamente");
            }else{
                System.out.println("Dato no actualizado");
            }
            
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public ArrayList<Cliente> getClientes(){
        return this.clientes;
    }
    
}
