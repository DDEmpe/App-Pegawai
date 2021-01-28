/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.pegawai;


public class user {
String username,password,nik;

    public user(String user,String pass,String nik ){
        username=user;
        password=pass;
        this.nik=nik;
    }
    
    public void setUser(String user){
        username = user;
    }
    public void setPass(String pass){
        password = pass;
    }
    public void setNik(String nik){
        this.nik = nik;
    }
    
    public String getUser(){
        return (username);
    }
    public String getPass(){
        return (password);
    }
    public String getNik(){
        return(nik);
    }
    

}
