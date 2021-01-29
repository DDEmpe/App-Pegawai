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
public class transaksi {
String jenistrans,kode,nama,jenis,bahan;
double harga, total;
int jumlah;

public transaksi(){
    jenistrans="";
    harga = 0;
    total = 0;
    jumlah = 0;
}

public void setKode(String kode){
    this.kode = kode;
}

public void setNama(String nama){
    this.nama = nama;
}
public void setJenis(String jen){
    jenis = jen;
}

public void setBahan(String bah){
    bahan = bah;
}

public void setTrans(String jenis){
   jenistrans = jenis;
}

public void setHarga(double Harga){
  harga = Harga;
}

public void setJumlah(int Jumlah){
     jumlah = Jumlah;
}

public String getKode(){
    return kode;
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
public String getTrans(){
    return jenistrans;
}

public double getHarga(){
    return harga;
}

public int getJumlah(){
    return jumlah;
}
public double getTotal(){
    total=harga*jumlah;
    return(total);
}

}
