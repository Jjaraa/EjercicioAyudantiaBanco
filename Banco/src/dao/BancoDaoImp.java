/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.Conector.conectarDB;
import static dao.Conector.ps;
import java.sql.SQLException;
import modelo.Banco;


/**
 *
 * @author dci
 */
public class BancoDaoImp extends Conector implements IBancoDao{
    Banco banco;
    
    public BancoDaoImp(){
        banco = new Banco();
    }
    
    @Override
    public void guardarBanco(Banco banco) {
        conectarDB();
            try {
            ps = conn.prepareStatement("insert into Banco (codigo) values ("+banco.getCodigo()+");");
            
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
    public void cargarBanco() {
            conectarDB();
        try {
            ps = conn.prepareStatement("select * from Banco;");
            rs = ps.executeQuery();
            while(rs.next()){
                this.banco = new Banco(rs.getInt("codigo"));
                
            }
            
            cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    }
    

