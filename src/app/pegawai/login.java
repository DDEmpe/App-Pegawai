/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.pegawai;

/**
 *
 * @author deric
 */
public class login {
    String username,password;
    public login(String user,String pass){
        username = user;
        password = pass;
    } 
    public void setUser(String user){
        username = user;
    }
    public void setPass(String pass){
        password = pass;
    }
    public String getUser(){
        return username;
    }
    public String getPass(){
        return password;
    }
}
