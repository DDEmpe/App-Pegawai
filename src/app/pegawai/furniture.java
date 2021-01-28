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
public class furniture {
String nama,jenis,bahan;
double harga;

public furniture(){
    nama="";
    jenis="";
    bahan="";
    harga=0;
}

public void setNama(String nam){
    nama = nam;
}

public void setJenis(String jen){
    
}

public void setBahan(String bah){
    
}

public void setHarga(double Harga){
    harga = Harga;
}

public String getNama(){
    return nama;
}
public String getJenis(){
    return jenis;
}

public String getBahan(){
    return bahan;
}
public double getHarga(){
    return harga;
}

 
}
