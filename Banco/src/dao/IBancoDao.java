/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Banco;

/**
 *
 * @author dci
 */
public interface IBancoDao {
    
    public void guardarBanco(Banco banco);
    public void cargarBanco();
}
