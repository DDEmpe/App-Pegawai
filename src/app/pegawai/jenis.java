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
public class jenis extends furniture {
String jenis;

public jenis(){
    jenis ="";
}
@Override
public void setJenis(String jen){
    jenis = jen;
}
@Override
public String getJenis(){
    return(jenis);
}

}
