package app.pegawai;


class AppPegawai {

    String nik,nama,alamat,no,kelamin,lahir,status;
    Integer umur;
    
public AppPegawai(){
       nik="";
       nama="";
       alamat="";
       no="";
       kelamin="";
       lahir="";
       status="";
       umur=0;
       
}
    public void setAppPegawai(String ni,String na,String al,String nom,String kel,String la,String sta, Integer um){
        nik = ni;
        nama = na;
        alamat = al;
        no = nom;
        kelamin = kel;
        lahir = la;
        status = sta;
        umur=um;
    }
    public String getnik(){
        return(nik);
    }
    public String getnam(){
        return(nama);
    }
    public String getal(){
        return(alamat);
    }
    public String getno(){
        return(no);
    }
    public String getkel(){
        return(kelamin);
    }
    public String getlah(){
        return(lahir);
    }
    public String getstat(){
        return(status);
    }
    public Integer getumr(){
        return(umur);
    }
}
