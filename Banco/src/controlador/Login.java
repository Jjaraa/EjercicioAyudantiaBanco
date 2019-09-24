/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author master
 */
public class Login {
    private int identificador;
    private String password;
    
    public Login(int identificador, String password){
        this.identificador = identificador;
        this.password = password;
    }
    
    public boolean iniciarSesion(int iPrueba, String pPrueba){
    if((iPrueba==this.identificador)&&(pPrueba==this.password)){
        return true;
    }else{
        return false;
    }
    }
}
