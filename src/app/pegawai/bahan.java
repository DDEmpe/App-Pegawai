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
public class bahan extends furniture {
String bahan;

public bahan(){
    bahan="";
}
@Override
public void setBahan(String bah){
    bahan = bah;
}
@Override
public String getBahan(){
    return (bahan);
}

}
