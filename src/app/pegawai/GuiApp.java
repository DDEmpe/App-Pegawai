
package app.pegawai;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import net.proteanit.sql.DbUtils;
import com.formdev.flatlaf.FlatDarkLaf;

public class GuiApp extends javax.swing.JFrame {

   Boolean vsimpan;
   String id;

    private void GetData(){ // menampilkan data dari database
    try {
        Connection conn =(Connection)app.pegawai.Database.koneksiDB();
        java.sql.Statement stm = conn.createStatement();
        java.sql.ResultSet sql = stm.executeQuery("select * from data");
        data.setModel(DbUtils.resultSetToTableModel(sql));

    }
    catch (SQLException | HeadlessException e) {
    }
}
    
 public String autoid(){
try {
 Integer Count;
        Connection conn =(Connection)app.pegawai.Database.koneksiDB();
        java.sql.Statement stm = conn.createStatement();
        java.sql.ResultSet sql = stm.executeQuery("select id from data order by id DESC");
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
 
 
public void refresh(){
    txtnik.setText("");
    txtnam.setText("");
    txtumur.setText("");
    txtal.setText("");
    txtlahir.setText("");
    txtno.setText("");
    txtcari.setText("");
    cmbkel.removeAllItems();
    cmbkel.addItem("");
    cmbkel.addItem("Laki - Laki");
    cmbkel.addItem("Perempuan");
    cmbkat.removeAllItems();
    cmbkat.addItem("");
    cmbkat.addItem("NIK");
    cmbkat.addItem("Nama");
    cmbstat.removeAllItems();
    cmbstat.addItem("");
    cmbstat.addItem("Admin");
    cmbstat.addItem("Kantor");
    cmbstat.addItem("Security");
    cmbstat.addItem("Reseosionis");
    id=autoid();
    GetData();
    
    
    txtnik.setEnabled(false);
    txtnam.setEnabled(false);
    txtumur.setEnabled(false);
    txtal.setEnabled(false);
    txtlahir.setEnabled(false);
    txtno.setEnabled(false);
    cmbkel.setEnabled(false);
    cmbstat.setEnabled(false);
    
      btnin.setEnabled(true);
      btnsim.setEnabled(false);
      btnref.setEnabled(true);
      btned.setEnabled(false);
      btnhap.setEnabled(false);
}
    public GuiApp() {
        initComponents();
        refresh();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtnik = new javax.swing.JTextField();
        txtnam = new javax.swing.JTextField();
        txtumur = new javax.swing.JTextField();
        txtal = new javax.swing.JTextField();
        txtlahir = new javax.swing.JTextField();
        txtno = new javax.swing.JTextField();
        btnin = new javax.swing.JButton();
        btnsim = new javax.swing.JButton();
        btnref = new javax.swing.JButton();
        btned = new javax.swing.JButton();
        btnhap = new javax.swing.JButton();
        btnkel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        cmbkat = new javax.swing.JComboBox<>();
        btncari = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        data = new javax.swing.JTable();
        cmbkel = new javax.swing.JComboBox<>();
        cmbstat = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("DATA PEGAWAI");

        jLabel2.setText("NIK");

        jLabel3.setText("Nama");

        jLabel4.setText("Umur");

        jLabel5.setText("Jenis Kelamin");

        jLabel6.setText("Tanggal Lahir");

        jLabel7.setText("Alamat");

        jLabel8.setText("No. Telepon");

        jLabel9.setText("Status");

        btnin.setText("Input");
        btnin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninActionPerformed(evt);
            }
        });

        btnsim.setText("Simpan");
        btnsim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimActionPerformed(evt);
            }
        });

        btnref.setText("Refresh");
        btnref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefActionPerformed(evt);
            }
        });

        btned.setText("Edit");
        btned.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnedActionPerformed(evt);
            }
        });

        btnhap.setText("Hapus");
        btnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapActionPerformed(evt);
            }
        });

        btnkel.setText("Keluar");
        btnkel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkelActionPerformed(evt);
            }
        });

        jLabel10.setText("Cari Data");

        cmbkat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btncari.setText("Cari");

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
        jScrollPane2.setViewportView(data);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbkat, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btncari)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btncari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cmbkel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbstat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnik, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnam, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtumur, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbkel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtlahir, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtno, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(txtal)
                                    .addComponent(cmbstat, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btned, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnref, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnsim, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnhap, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnkel, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtumur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnref))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btned)
                    .addComponent(cmbkel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtlahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhap))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbstat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapActionPerformed
   
        try{
            String sql = "delete from data where nik = '"+txtnik.getText()+"'";
            java.sql.Connection conn = (java.sql.Connection)app.pegawai.Database.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Hapus Data?");
           vsimpan = true;

            }catch (SQLException | HeadlessException e){
            }
        refresh();
    }//GEN-LAST:event_btnhapActionPerformed

    private void btnkelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnkelActionPerformed

    private void btnrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefActionPerformed
        refresh();
    }//GEN-LAST:event_btnrefActionPerformed

    private void btnsimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimActionPerformed
     AppPegawai peg = new AppPegawai();
     String ni = txtnik.getText();
     String nam = txtnam.getText();
     Integer Umr = Integer.parseInt((txtumur.getText()));
     String Lahir = txtlahir.getText();
     String al = txtal.getText();
     String no = txtno.getText();
     String sta =(String) cmbstat.getSelectedItem();
     String kel = (String) cmbkel.getSelectedItem();
     
     peg.setAppPegawai(ni,nam,al,no,kel,Lahir,sta,Umr);
        if (vsimpan == true){

     
    try
    {
        String sql = "insert into data Values ('"+id+ "', '" + peg.getnik() + "','" + peg.getnam()+ "','" + peg.getumr() + "','" + peg.getkel() + "','" + peg.getlah() + "','" + peg.getal() + "','" + peg.getno() +"', '" + peg.getstat() + "')";
        java.sql.Connection conn = (java.sql.Connection)app.pegawai.Database.koneksiDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
    } catch (SQLException | HeadlessException e){
        JOptionPane.showMessageDialog(null, e);
    }
    }else{
         try{
        String sql = "update data set nik= '" + peg.getnik() +"',nama='" + peg.getnam() + "',umur='" + peg.getumr() + "',kelamin='" + peg.getkel() + "',lahir='" + peg.getlah() + "',alamat='" + peg.getal() + "',no='" + peg.getno() + "',jabatan='"+ peg.getstat() +"' where id='" + id + "'";
        java.sql.Connection conn = (java.sql.Connection)app.pegawai.Database.koneksiDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
            }catch (SQLException | HeadlessException e){
        JOptionPane.showMessageDialog(null, e);
    }
}       
        refresh();
    }//GEN-LAST:event_btnsimActionPerformed

    private void dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataMouseClicked
   try{
        int row = data.getSelectedRow();
        String table_klik = (data.getModel().getValueAt(row, 0).toString());
          java.sql.Connection conn = (java.sql.Connection)app.pegawai.Database.koneksiDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("Select * from data where id = '"+table_klik+"'");
     if(sql.next()){
         id = sql.getString("id");
         
         String nik = sql.getString("nik");
         txtnik.setText(nik);
         String nama = sql.getString("nama");
         txtnam.setText(nama);
          String umur = sql.getString("umur");
         txtumur.setText(umur);
          String kel = sql.getString("kelamin");
         cmbkel.setSelectedItem(kel);
          String lahir = sql.getString("lahir");
         txtlahir.setText(lahir);
          String bonus = sql.getString("alamat");
         txtal.setText(bonus);
          String no = sql.getString("no");
         txtno.setText(no);
         String stat = sql.getString("jabatan");
         cmbstat.setSelectedItem(stat);
     }
     }catch (Exception e){}
      btnin.setEnabled(false);
      btnsim.setEnabled(false);
      btnref.setEnabled(true);
      btned.setEnabled(true);
      btnhap.setEnabled(true);
      
      
    }//GEN-LAST:event_dataMouseClicked

    private void btninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninActionPerformed

            vsimpan = true;
    txtnik.setEnabled(true);
    txtnam.setEnabled(true);
    txtumur.setEnabled(true);
    txtal.setEnabled(true);
    txtlahir.setEnabled(true);
    txtno.setEnabled(true);
    cmbkel.setEnabled(true);
    cmbstat.setEnabled(true);
    
      btnin.setEnabled(false);
      btnsim.setEnabled(true);
      btnref.setEnabled(true);
      btned.setEnabled(false);
      btnhap.setEnabled(false);
    }//GEN-LAST:event_btninActionPerformed

    private void btnedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnedActionPerformed
    vsimpan = false;
    txtnik.setEnabled(false);
    txtnam.setEnabled(false);
    txtumur.setEnabled(false);
    txtal.setEnabled(false);
    txtlahir.setEnabled(false);
    txtno.setEnabled(false);
    cmbkel.setEnabled(false);
    cmbstat.setEnabled(false);
    
      btnin.setEnabled(false);
      btnsim.setEnabled(true);
      btnref.setEnabled(true);
      btned.setEnabled(false);
      btnhap.setEnabled(false);
    }//GEN-LAST:event_btnedActionPerformed


    public static void main(String args[]) {
try {
    UIManager.setLookAndFeel( new FlatDarkLaf() );
} catch( Exception ex ) {
    System.err.println( "Failed to initialize LaF" );
}
    

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncari;
    private javax.swing.JButton btned;
    private javax.swing.JButton btnhap;
    private javax.swing.JButton btnin;
    private javax.swing.JButton btnkel;
    private javax.swing.JButton btnref;
    private javax.swing.JButton btnsim;
    private javax.swing.JComboBox<String> cmbkat;
    private javax.swing.JComboBox<String> cmbkel;
    private javax.swing.JComboBox<String> cmbstat;
    private javax.swing.JTable data;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtal;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtlahir;
    private javax.swing.JTextField txtnam;
    private javax.swing.JTextField txtnik;
    private javax.swing.JTextField txtno;
    private javax.swing.JTextField txtumur;
    // End of variables declaration//GEN-END:variables
}
