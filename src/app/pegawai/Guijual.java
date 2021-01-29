/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.pegawai;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author deric
 */
public class Guijual extends javax.swing.JFrame {
 String id;
 boolean vsimpan;
 int tot;
 boolean vedit;
 double bay,temp_bay;
 
 
  public String autoid(){
try {
 Integer Count;
        Connection conn =(Connection)app.pegawai.Database.koneksiDB();
        java.sql.Statement stm = conn.createStatement();
        java.sql.ResultSet sql = stm.executeQuery("select id from detail_jual order by id DESC");
        if (!sql.next()){
         Count = 1;
        }else{
         Count = sql.getInt("id")+1;
        }
        id = Integer.toString(Count);
    }
    catch (SQLException | HeadlessException e) {
    }
     return id;
 }
  
    public String autotemp(){
try {
 Integer Count;
        Connection conn =(Connection)app.pegawai.Database.koneksiDB();
        java.sql.Statement stm = conn.createStatement();
        java.sql.ResultSet sql = stm.executeQuery("select id from temp_jual order by id DESC");
        if (!sql.next()){
         Count = 1;
        }else{
         Count = sql.getInt("id")+1;
        }
        id = Integer.toString(Count);
    }
    catch (SQLException | HeadlessException e) {
    }
     return id;
 }
    
      public String autojual(){
try {
 Integer Count;
        Connection conn =(Connection)app.pegawai.Database.koneksiDB();
        java.sql.Statement stm = conn.createStatement();
        java.sql.ResultSet sql = stm.executeQuery("select id from jual order by id DESC");
        if (!sql.next()){
         Count = 1;
        }else{
         Count = sql.getInt("id")+1;
        }
        id = Integer.toString(Count);
    }
    catch (SQLException | HeadlessException e) {
    }
     return id;
 }
  
   public String autokode(){
       String kode;
       kode="";
       if (autoid().length()==1) {
           kode = "JU"+"-"+"00"+autoid();
       }else if(autoid().length()==2){
           kode = "JU"+"-"+"0"+autoid();
       }else if(autoid().length()==3){
           kode = "JU"+"-"+autoid();
       }
       return kode;
 }
 
    private void GetData(){ // menampilkan data dari database
    try {
        Connection conn =(Connection)app.pegawai.Database.koneksiDB();
        java.sql.Statement stm = conn.createStatement();
        java.sql.ResultSet sql = stm.executeQuery("select * from temp_jual");
        data.setModel(DbUtils.resultSetToTableModel(sql));

    }
    catch (SQLException | HeadlessException e) {
    }
}
 public void refresh(){
     vsimpan = true;
     txtkode.setText(autokode());
     txtjum.setText("");
     txthar.setText("");
     isiJen();
     isiBah();
     txttot.setText("");
     
     GetData();
       txtkode.setEnabled(false);
         cmbjen.setEnabled(true);
         cmbbah.setEnabled(true);
         cmbfurn.setEnabled(true);
         txtjum.setEnabled(true);
         txthar.setEnabled(false);
         txttot.setEnabled(false);
         
         btnin.setEnabled(false);
         btntam.setEnabled(true);
         btnref.setEnabled(true);
         btnedt.setEnabled(false);
         btnhap.setEnabled(false);
         btnbat.setEnabled(true);
     
 }
 public void batal(){
     txtkode.setText(autokode());
     txtjum.setText("");
     txthar.setText("");
     txtbay.setText("");
     txtkem.setText("");
     isiJen();
     isiBah();
     txttot.setText("");
     bay = 0;
     biaya.setText("Rp. "+Double.toString(bay));
     GetData();
     
         txtkode.setEnabled(false);
         cmbjen.setEnabled(false);
         cmbbah.setEnabled(false);
         cmbfurn.setEnabled(false);
         txtjum.setEnabled(false);
         txthar.setEnabled(false);
         txttot.setEnabled(false);
         btnbay.setEnabled(false);
         txtkem.setEnabled(false);
         
         
         btnin.setEnabled(true);
         btntam.setEnabled(false);
         btnref.setEnabled(false);
         btnedt.setEnabled(false);
         btnhap.setEnabled(false);
         btnbat.setEnabled(false);
 }
  public void isiJen(){
         String tes;
     
    
     tes = "Select jenis from jenis";
     try{
         cmbjen.removeAllItems();
         cmbjen.addItem("");
         
         Connection conn =(Connection)app.pegawai.Database.koneksiDB();
        java.sql.Statement stm = conn.createStatement();
        java.sql.ResultSet sql = stm.executeQuery(tes);
       while(sql.next()){
        cmbjen.addItem(sql.getString(1));
       }

    }
    catch (SQLException | HeadlessException e) {
    
     }
    }
    
    public void isiBah(){
          String tes;
     
    
     tes = "Select bahan from bahan";
     try{
         cmbbah.removeAllItems();
         cmbbah.addItem("");
         
         Connection conn =(Connection)app.pegawai.Database.koneksiDB();
        java.sql.Statement stm = conn.createStatement();
        java.sql.ResultSet sql = stm.executeQuery(tes);
       while(sql.next()){
        cmbbah.addItem(sql.getString(1));
       }

    }
    catch (SQLException | HeadlessException e) {
    
     }
    }

    public Guijual() {
        initComponents();
        batal();
        GetData();
        isiJen();
        isiBah();
        time tm = new time();
        tm.setTime();
        tgljual.setText(tm.getTime());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbfurn = new javax.swing.JComboBox<>();
        txtkode = new javax.swing.JTextField();
        txtjum = new javax.swing.JTextField();
        txthar = new javax.swing.JTextField();
        txttot = new javax.swing.JTextField();
        btnbat = new javax.swing.JButton();
        btnin = new javax.swing.JButton();
        btntam = new javax.swing.JButton();
        btnref = new javax.swing.JButton();
        btnedt = new javax.swing.JButton();
        btnhap = new javax.swing.JButton();
        tgljual = new javax.swing.JLabel();
        cmbjen = new javax.swing.JComboBox<>();
        cmbbah = new javax.swing.JComboBox<>();
        btnhit = new javax.swing.JButton();
        btnhit1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        data = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        btncari = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnbay = new javax.swing.JButton();
        btnkel = new javax.swing.JButton();
        biaya = new javax.swing.JLabel();
        txtkem = new javax.swing.JTextField();
        txtbay = new javax.swing.JTextField();
        btnhitung2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("TRANSAKSI JUAL");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel6.setText("Kode");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel7.setText("Nama");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel8.setText("Jumlah");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel9.setText("Harga");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, -1, -1));

        jLabel10.setText("Total");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, -1, -1));

        cmbfurn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbfurn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbfurnItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbfurn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 110, -1));
        jPanel1.add(txtkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 150, -1));

        txtjum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumActionPerformed(evt);
            }
        });
        jPanel1.add(txtjum, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 150, -1));
        jPanel1.add(txthar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 150, -1));
        jPanel1.add(txttot, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 150, 20));

        btnbat.setText("Batal");
        btnbat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatActionPerformed(evt);
            }
        });
        jPanel1.add(btnbat, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, -1, -1));

        btnin.setText("Input");
        btnin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninActionPerformed(evt);
            }
        });
        jPanel1.add(btnin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        btntam.setText("Tambah");
        btntam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntamActionPerformed(evt);
            }
        });
        jPanel1.add(btntam, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        btnref.setText("Refresh");
        btnref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefActionPerformed(evt);
            }
        });
        jPanel1.add(btnref, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        btnedt.setText("Edit");
        btnedt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnedtActionPerformed(evt);
            }
        });
        jPanel1.add(btnedt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        btnhap.setText("Hapus");
        btnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapActionPerformed(evt);
            }
        });
        jPanel1.add(btnhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));

        tgljual.setText("TGL");
        jPanel1.add(tgljual, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        cmbjen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbjen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbjenItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbjen, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 70, -1));

        cmbbah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbbah.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbbahItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 80, -1));

        btnhit.setText("Hitung");
        btnhit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitActionPerformed(evt);
            }
        });
        jPanel1.add(btnhit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        btnhit1.setText("Hitung");
        btnhit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhit1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnhit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 800, 270));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(data);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, 110));

        jLabel5.setText("Cari Data");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel2.add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 290, -1));

        btncari.setText("Cari");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });
        jPanel2.add(btncari, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 810, 140));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Biaya");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 10));

        jLabel2.setText("Bayar");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setText("Kembalian");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        btnbay.setText("Bayar");
        btnbay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbayActionPerformed(evt);
            }
        });
        jPanel3.add(btnbay, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, -1, -1));

        btnkel.setText("Keluar");
        btnkel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkelActionPerformed(evt);
            }
        });
        jPanel3.add(btnkel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, -1, -1));

        biaya.setText("Rp.");
        jPanel3.add(biaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));
        jPanel3.add(txtkem, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 150, -1));
        jPanel3.add(txtbay, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 150, -1));

        btnhitung2.setText("Hitung");
        btnhitung2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitung2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnhitung2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 810, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnkelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkelActionPerformed
int jawab = JOptionPane.showOptionDialog(this, 
                        "Ingin Keluar?", 
                        "Keluar", 
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
        
        if(jawab == JOptionPane.YES_OPTION){
            GuiMain main = new GuiMain();
            main.Screenmenu();
            
            setVisible(false);
            

        
        }            // TODO add your handling code here:
    }//GEN-LAST:event_btnkelActionPerformed

    private void btnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapActionPerformed
   int jawab = JOptionPane.showOptionDialog(this, 
                        "Ingin Menghapus Data??", 
                        "Hapus Data", 
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
        
        if(jawab == JOptionPane.YES_OPTION){
            
         
        try{
            String sql = "delete from temp_jual where id = '"+ id +"'";
            java.sql.Connection conn = (java.sql.Connection)app.pegawai.Database.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, " Data Telah Terhapus");
            
            }catch (SQLException | HeadlessException e){
            }
        bay = bay - temp_bay;
        biaya.setText("Rp. "+bay);
        refresh();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnhapActionPerformed

    private void cmbjenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbjenItemStateChanged
     String tes,jenis, bahan;
     if (cmbbah.getSelectedItem()!= ""){
     jenis = (String) cmbjen.getSelectedItem();
     bahan = (String) cmbbah.getSelectedItem();
     
     tes = "Select nama from furnitur where bahan = '" + bahan + "' And jenis = '"+ jenis + "' ";
     try{
         cmbfurn.removeAllItems();
         cmbfurn.addItem("");
         
         Connection conn =(Connection)app.pegawai.Database.koneksiDB();
        java.sql.Statement stm = conn.createStatement();
        java.sql.ResultSet sql = stm.executeQuery(tes);
       while(sql.next()){
        cmbfurn.addItem(sql.getString(1));
       }

    }
    catch (SQLException | HeadlessException e) {
    
     }
     }
    }//GEN-LAST:event_cmbjenItemStateChanged

    private void txtjumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumActionPerformed

            
    }//GEN-LAST:event_txtjumActionPerformed

    private void btntamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntamActionPerformed
            transaksi trans = new jual();
  if ((txtkode.getText().length()==0) || (cmbjen.getSelectedItem()=="")|| (cmbbah.getSelectedItem()=="")|| (cmbfurn.getSelectedItem()=="") || (txtjum.getText().length()==0) || (txthar.getText().length()==0) || (txttot.getText().length()==0)){
   JOptionPane.showMessageDialog(null, " Data Tidak Lengkap!!!");
  }else{
     String kode = txtkode.getText();
     String nama = (String)cmbfurn.getSelectedItem();
     String jenis = (String) cmbjen.getSelectedItem();
     String bahan = (String) cmbbah.getSelectedItem();
     Integer jumlah = Integer.parseInt((txtjum.getText()));
     double harga = Double.parseDouble((txthar.getText()));
     double total = Double.parseDouble((txttot.getText()));
     trans.setKode(kode);
     trans.setNama(nama);
     trans.setJumlah(jumlah);
     trans.setHarga(harga);
     trans.setJenis(jenis);
     trans.setBahan(bahan);
     
     String cari = "Select * from temp_jual where nama = '" + trans.getNama() + "' and jenis = '" + trans.getJenis()+"' and bahan = '" + trans.getBahan() + "' ";
     Database db = new Database();
   if (vsimpan == true){
     try
    {
       if (db.CariData(cari) == true) {
           JOptionPane.showMessageDialog(null, " Data Sudah Ada!!!");
       }else{
        String sql = "insert into temp_jual Values ('"+autotemp()+ "', '" + trans.getKode() + "','" + trans.getNama()+ "','" + trans.getJenis()+ "','" + trans.getBahan()+ "','" + trans.getJumlah() + "','" + trans.getHarga() + "','" + trans.getTotal() + "')";
        java.sql.Connection conn = (java.sql.Connection)app.pegawai.Database.koneksiDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        bay = bay + trans.getTotal();
        biaya.setText("Rp. "+Double.toString(bay));
        
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        refresh();
       }
    } catch (SQLException | HeadlessException e){
        JOptionPane.showMessageDialog(null, e);
    }
     
    }else{
         try{
        String sql = "update temp_jual set kode= '" + trans.getKode() +"',nama='" + trans.getNama() + "',jenis = '" + trans.getJenis()+ "', baahn ='" + trans.getBahan()+ "',jumlah='" + trans.getJumlah() + "',harga='" + trans.getHarga() + "',total='" + trans.getTotal() + "' where id='" + id + "'";
        java.sql.Connection conn = (java.sql.Connection)app.pegawai.Database.koneksiDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
          refresh();
                    
            }catch (SQLException | HeadlessException e){
        JOptionPane.showMessageDialog(null, e);
    }
       
}       
        
         } 
    }//GEN-LAST:event_btntamActionPerformed

    private void cmbbahItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbbahItemStateChanged
 String tes,jenis, bahan;
     if (cmbjen.getSelectedItem()!= ""){
     jenis = (String) cmbjen.getSelectedItem();
     bahan = (String) cmbbah.getSelectedItem();
     
     tes = "Select nama from furnitur where bahan = '" + bahan + "' And jenis = '"+ jenis + "' ";
     try{
         cmbfurn.removeAllItems();
         cmbfurn.addItem("");
         
         Connection conn =(Connection)app.pegawai.Database.koneksiDB();
        java.sql.Statement stm = conn.createStatement();
        java.sql.ResultSet sql = stm.executeQuery(tes);
       while(sql.next()){
        cmbfurn.addItem(sql.getString(1));
       }

    }
    catch (SQLException | HeadlessException e) {
    
     }
     }
    }//GEN-LAST:event_cmbbahItemStateChanged

    private void cmbfurnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbfurnItemStateChanged
String tes,nama,jenis,bahan;
double harga;
nama =(String) cmbfurn.getSelectedItem();
jenis = (String) cmbjen.getSelectedItem();
bahan = (String) cmbbah.getSelectedItem();
if (cmbfurn.getSelectedItem()!="") {
try
{
    
    tes = "Select harga from furnitur where nama='" + nama + "' And jenis = '" + jenis + "' and bahan = '" + bahan + "' ";
     Connection conn =(Connection)app.pegawai.Database.koneksiDB();
        java.sql.Statement stm = conn.createStatement();
        java.sql.ResultSet sql = stm.executeQuery(tes);
       while(sql.next()){
        txthar.setText(sql.getString(1));
       }
    }catch (SQLException | HeadlessException e) {
    
     }}else{
    txthar.setText("");
}

    }//GEN-LAST:event_cmbfurnItemStateChanged

    private void btnhitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitActionPerformed
        int jumlah;
        double harga,total;
        transaksi trans = new transaksi();
        if(txtjum.getText().length() != 0){
        jumlah = Integer.parseInt(txtjum.getText());
        harga = Double.parseDouble(txthar.getText());
        
            trans.setJumlah(jumlah);
            trans.setHarga(harga);
            
        total = trans.getTotal();
        txttot.setText(Double.toString(total));
        }else{
            txttot.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnhitActionPerformed

    private void btnbatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatActionPerformed
  try{
            String sql = "delete from temp_jual";
            java.sql.Connection conn = (java.sql.Connection)app.pegawai.Database.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            }catch (SQLException | HeadlessException e){
            }
        
        batal();
    }//GEN-LAST:event_btnbatActionPerformed

    private void btnrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefActionPerformed
        if (vedit){
        bay = bay + temp_bay;
        biaya.setText("Rp. "+(bay));}
        refresh();
    }//GEN-LAST:event_btnrefActionPerformed

    private void btninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninActionPerformed
        vsimpan=true; 
        txtkode.setEnabled(false);
         cmbjen.setEnabled(true);
         cmbbah.setEnabled(true);
         cmbfurn.setEnabled(true);
         txtjum.setEnabled(true);
         txthar.setEnabled(false);
         txttot.setEnabled(false);
         temp_bay=0;
         btnbay.setEnabled(true);
         btnin.setEnabled(false);
         btntam.setEnabled(true);
         btnref.setEnabled(true);
         btnedt.setEnabled(false);
         btnhap.setEnabled(false);
         btnbat.setEnabled(true);
    }//GEN-LAST:event_btninActionPerformed

    private void btnedtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnedtActionPerformed
vedit = true;
        vsimpan=false; 
        txtkode.setEnabled(false);
         cmbjen.setEnabled(true);
         cmbbah.setEnabled(true);
         cmbfurn.setEnabled(true);
         txtjum.setEnabled(true);
         txthar.setEnabled(false);
         txttot.setEnabled(false);
         
         bay = bay - temp_bay;
         biaya.setText("Rp. "+bay);
         
         btnbay.setEnabled(true);
         btnin.setEnabled(false);
         btntam.setEnabled(true);
         btnref.setEnabled(true);
         btnedt.setEnabled(false);
         btnhap.setEnabled(false);
         btnbat.setEnabled(true);
    }//GEN-LAST:event_btnedtActionPerformed

    private void dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataMouseClicked
 vedit=false;
        try{
        int row = data.getSelectedRow();
        String table_klik = (data.getModel().getValueAt(row, 0).toString());
          java.sql.Connection conn = (java.sql.Connection)app.pegawai.Database.koneksiDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("Select * from temp_jual where id = '"+table_klik+"'");
     if(sql.next()){
         id = sql.getString("id");
         
         String kode = sql.getString("kode");
         txtkode.setText(kode);
         String nama = sql.getString("nama");
 
             String jenis = sql.getString("jenis");
             
             String bahan = sql.getString("bahan");
             
             cmbjen.setSelectedItem(jenis);
             cmbbah.setSelectedItem(bahan);
         
         cmbfurn.setSelectedItem(nama);
          String jumlah = sql.getString("jumlah");
         txtjum.setText(jumlah);
          String harga = sql.getString("harga");
         txthar.setText(harga);
        
          String total = sql.getString("total");
         txttot.setText(total);
         temp_bay = Double.parseDouble(total);
     }
     }catch (Exception e){}
     txtkode.setEnabled(false);
         cmbjen.setEnabled(false);
         cmbbah.setEnabled(false);
         cmbfurn.setEnabled(false);
         txtjum.setEnabled(false);
         txthar.setEnabled(false);
         txttot.setEnabled(false);
         
      btnin.setEnabled(false);
      btntam.setEnabled(false);
      btnref.setEnabled(true);
      btnedt.setEnabled(true);
      btnhap.setEnabled(true);
      
      
    }//GEN-LAST:event_dataMouseClicked

    private void btnbayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbayActionPerformed
        String ids,date,nama,kode,jenis,bahan;
        double harga,total;
        int i,itot,jumtot,jumlah;
        i=0;
        itot=0;
        jumtot = 0;
        jumlah = 0;
        harga = 0;
        total = 0;
        nama = "";
        date=tgljual.getText();
        kode="";
        jenis="";
        bahan="";
        ids="";
        if (txtbay.getText().length()!=0){
            
        
        try{
             java.sql.Connection conn = (java.sql.Connection)app.pegawai.Database.koneksiDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("Select id from temp_jual order by id ASC");
            while(sql.next()){
                i=sql.getInt("id");
            }
            itot = i;
            while(itot>0){
                java.sql.ResultSet tes = stm.executeQuery("Select * from temp_jual where id = '" + itot + "' ");
                while(tes.next()){
                    ids = tes.getString("id");
                    kode=tes.getString("kode");
                    nama = tes.getString("nama");
                    jenis=tes.getString("jenis");
                    bahan=tes.getString("bahan");
                    jumlah=tes.getInt("jumlah");
                    harga=tes.getDouble("harga");
                    total=tes.getDouble("total");
                }
                jumtot = jumtot + jumlah;
                try{
                String sql1 ="insert into jual values('"+autojual()+"', '"+kode+"','"+nama+"', '"+jumlah+"', '"+harga+"', '"+total+"', '"+date+"'  )";
                java.sql.PreparedStatement pst1 = conn.prepareStatement(sql1);
                pst1.execute();
                }catch (SQLException | HeadlessException e){
            }
                try{
                String sql4 ="update furnitur set jumlah = jumlah - '"+ jumlah +"' where nama = '"+nama+"' and jenis = '"+jenis+"' and bahan = '"+bahan+"' ";
                java.sql.PreparedStatement pst4 = conn.prepareStatement(sql4);
                pst4.execute();
                }catch (SQLException | HeadlessException e){
            }
                try{
                String sql2 ="delete from temp_jual where id='"+ids+"' ";
                java.sql.PreparedStatement pst2 = conn.prepareStatement(sql2);
                pst2.execute();
                }catch (SQLException | HeadlessException e){
            }
               itot = itot - 1;
            }
            try{
            String sql3 ="insert into detail_jual values('"+autoid()+"', '"+kode+"', '"+jumtot+"',  '"+bay+"', '"+date+"'  )";
                java.sql.PreparedStatement pst3 = conn.prepareStatement(sql3);
                pst3.execute();
            }catch (SQLException | HeadlessException e){
            }
                
        }catch (SQLException | HeadlessException e){
            }
       batal();
        }else{
            JOptionPane.showMessageDialog(null, " Belum Bayar !!!");
        }
        
        
    }//GEN-LAST:event_btnbayActionPerformed

    private void btnhit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnhit1ActionPerformed

    private void btnhitung2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitung2ActionPerformed
  double bayar,harus,kembali;
        double harga,total;
        transaksi trans = new transaksi();
        if(txtbay.getText().length() != 0){
        harus = bay;
        bayar = Double.parseDouble(txtbay.getText());
        
        kembali = bayar - harus;
        
            
   
        txtkem.setText(Double.toString(kembali));
        }else{
            txtkem.setText("0");
        }  
    }//GEN-LAST:event_btnhitung2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            GetData();
            txtcari.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
 if ((txtcari.getText().length()==0)){
         JOptionPane.showMessageDialog(null, " Data Tidak Lengkap!!!!");
        }else{
        try {
        Connection conn =(Connection)app.pegawai.Database.koneksiDB();
        java.sql.Statement stm = conn.createStatement();
    
        java.sql.ResultSet sql = stm.executeQuery("select * from temp_jual Where nama like '%" +txtcari.getText()+"%'");
        data.setModel(DbUtils.resultSetToTableModel(sql));
      
        
       
        
    }
    catch (SQLException | HeadlessException e) {
    }
        }              // TODO add your handling code here:
    }//GEN-LAST:event_btncariActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void ScreenJual() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Guijual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guijual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guijual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guijual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
try {
    UIManager.setLookAndFeel( new FlatDarkLaf() );
} catch( Exception ex ) {
    System.err.println( "Failed to initialize LaF" );
}
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guijual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel biaya;
    private javax.swing.JButton btnbat;
    private javax.swing.JButton btnbay;
    private javax.swing.JButton btncari;
    private javax.swing.JButton btnedt;
    private javax.swing.JButton btnhap;
    private javax.swing.JButton btnhit;
    private javax.swing.JButton btnhit1;
    private javax.swing.JButton btnhitung2;
    private javax.swing.JButton btnin;
    private javax.swing.JButton btnkel;
    private javax.swing.JButton btnref;
    private javax.swing.JButton btntam;
    private javax.swing.JComboBox<String> cmbbah;
    private javax.swing.JComboBox<String> cmbfurn;
    private javax.swing.JComboBox<String> cmbjen;
    private javax.swing.JTable data;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tgljual;
    private javax.swing.JTextField txtbay;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txthar;
    private javax.swing.JTextField txtjum;
    private javax.swing.JTextField txtkem;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txttot;
    // End of variables declaration//GEN-END:variables
}
