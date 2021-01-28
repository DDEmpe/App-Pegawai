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
String jenistrans;
double harga, total;
int jumlah;

public jual(){
    jenistrans="";
    harga = 0;
    total = 0;
    jumlah = 0;
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
