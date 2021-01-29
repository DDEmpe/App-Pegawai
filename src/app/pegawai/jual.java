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
public class jual extends transaksi{
String jenistrans,nama,jenis,bahan,kode;
double harga, total;
int jumlah;

public jual(){
    jenistrans="";
    harga = 0;
    total = 0;
    jumlah = 0;
    nama="";
    jenis="";
    bahan="";
    kode="";
}
@Override
public void setKode(String kode){
    this.kode = kode;
}
@Override
public void setNama(String nama){
    this.nama = nama;
}
@Override
public void setJenis(String jen){
    jenis = jen;
}
@Override
public void setBahan(String bah){
    bahan = bah;
}

@Override
public void setTrans(String jenis){
    jenistrans = jenis;
}
@Override
public void setHarga(double Harga){
    harga = Harga;
}
@Override
public void setJumlah(int Jumlah){
    jumlah = Jumlah;
}
@Override
public String getKode(){
    return kode;
}

@Override
public String getNama(){
    return nama;
}
@Override
public String getJenis(){
    return jenis;
}
@Override
public String getBahan(){
    return bahan;
}
@Override
public String getTrans(){
    return jenistrans;
}
@Override
public double getHarga(){
    return harga;
}

@Override
public int getJumlah(){
    return jumlah;
}
@Override
public double getTotal(){
    total=harga*jumlah;
    return(total);
}

}
