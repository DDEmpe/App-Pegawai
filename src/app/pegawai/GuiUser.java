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


public class GuiUser extends javax.swing.JFrame {

    private String id,idut;
    private boolean vsimpan;
    private String tes;
    
     public String autoid(){
try {
 Integer Count;
        Connection conn =(Connection)app.pegawai.Database.koneksiDB();
        java.sql.Statement stm = conn.createStatement();
        java.sql.ResultSet sql = stm.executeQuery("select id from user order by id DESC");
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
    
    public GuiUser() {
        initComponents();
        refresh();
    }
 private void GetData(){ // menampilkan data dari database
    try {
        Connection conn =(Connection)app.pegawai.Database.koneksiDB();
        java.sql.Statement stm = conn.createStatement();
        java.sql.ResultSet sql = stm.executeQuery("select * from user");
        data.setModel(DbUtils.resultSetToTableModel(sql));

    }
    catch (SQLException | HeadlessException e) {
    }
}
 public void refresh(){

    String tes;
     
     cmbnik.addItem("");
    
     tes = "Select nik from data";
     try{
         cmbnik.removeAllItems();
         cmbnik.addItem("");
         
         Connection conn =(Connection)app.pegawai.Database.koneksiDB();
        java.sql.Statement stm = conn.createStatement();
        java.sql.ResultSet sql = stm.executeQuery(tes);
       while(sql.next()){
        cmbnik.addItem(sql.getString(1));
       }

    }
    catch (SQLException | HeadlessException e) {
    
     }
     
    txtuser.setText("");
    txtpass1.setText("");
    txtpass2.setText("");
    
    id=autoid();
    GetData();
    
     txtuser.setEnabled(false);
    txtpass1.setEnabled(false);
    txtpass2.setEnabled(false);
    cmbnik.setEnabled(false);;
    
    btnin.setEnabled(true);
    btntam.setEnabled(false);
    btnedt.setEnabled(false);
    btnhap.setEnabled(false);
    btnref.setEnabled(true);
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnkel = new javax.swing.JButton();
        btnhap = new javax.swing.JButton();
        btnedt = new javax.swing.JButton();
        btnin = new javax.swing.JButton();
        btntam = new javax.swing.JButton();
        btnref = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NIK = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        cmbnik = new javax.swing.JComboBox<>();
        txtpass1 = new javax.swing.JPasswordField();
        txtpass2 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        chkshow = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        data = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnkel.setText("Keluar");
        btnkel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkelActionPerformed(evt);
            }
        });
        jPanel1.add(btnkel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 73, -1));

        btnhap.setText("Hapus");
        btnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapActionPerformed(evt);
            }
        });
        jPanel1.add(btnhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 70, -1));

        btnedt.setText("Edit");
        btnedt.setMaximumSize(new java.awt.Dimension(63, 23));
        btnedt.setPreferredSize(new java.awt.Dimension(63, 23));
        btnedt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnedtActionPerformed(evt);
            }
        });
        jPanel1.add(btnedt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        btnin.setText("Input");
        btnin.setMaximumSize(new java.awt.Dimension(63, 23));
        btnin.setPreferredSize(new java.awt.Dimension(63, 23));
        btnin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninActionPerformed(evt);
            }
        });
        jPanel1.add(btnin, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        btntam.setText("Tambah");
        btntam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntamActionPerformed(evt);
            }
        });
        jPanel1.add(btntam, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        btnref.setText("Refresh");
        btnref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefActionPerformed(evt);
            }
        });
        jPanel1.add(btnref, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DATA USER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel2.setText("Password 1");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        NIK.setText("NIK");
        jPanel1.add(NIK, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel4.setText("UserName");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        jPanel1.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 100, -1));

        cmbnik.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbnik, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 100, -1));
        jPanel1.add(txtpass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 100, -1));
        jPanel1.add(txtpass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 100, -1));

        jLabel5.setText("Password 2");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        chkshow.setText("Show");
        chkshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkshowActionPerformed(evt);
            }
        });
        jPanel1.add(chkshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 190));

        data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIK", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(data);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 560, 200));

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
            

        
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnkelActionPerformed

    private void chkshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkshowActionPerformed
       if (chkshow.isSelected()){
            txtpass1.setEchoChar((char)0);
            txtpass2.setEchoChar((char)0);
        }else{
            txtpass1.setEchoChar('*');
            txtpass2.setEchoChar('*');
        }
    }//GEN-LAST:event_chkshowActionPerformed

    private void btninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninActionPerformed
    vsimpan = true;
    txtuser.setEnabled(true);
    txtpass1.setEnabled(true);
    txtpass2.setEnabled(true);
    cmbnik.setEnabled(true);;
    
    btnin.setEnabled(false);
    btntam.setEnabled(true);
    btnedt.setEnabled(false);
    btnhap.setEnabled(false);
    btnref.setEnabled(true);
    }//GEN-LAST:event_btninActionPerformed

    private void btnedtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnedtActionPerformed
    vsimpan = false;
    txtuser.setEnabled(true);
    txtpass1.setEnabled(true);
    txtpass2.setEnabled(true);
    cmbnik.setEnabled(true);;
    
    btnin.setEnabled(false);
    btntam.setEnabled(true);
    btnedt.setEnabled(false);
    btnhap.setEnabled(false);
    btnref.setEnabled(true);
    }//GEN-LAST:event_btnedtActionPerformed

    private void btnrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefActionPerformed
        refresh();
    }//GEN-LAST:event_btnrefActionPerformed

    private void btnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapActionPerformed
       int jawab = JOptionPane.showOptionDialog(this, 
                        "Ingin Menghapus Data??", 
                        "Hapus Data", 
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
        
        if(jawab == JOptionPane.YES_OPTION){
            
         
        try{
            String sql = "delete from user where id = '"+ id +"'";
            java.sql.Connection conn = (java.sql.Connection)app.pegawai.Database.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, " Data Telah Terhapus");
            }catch (SQLException | HeadlessException e){
            }
        refresh();
        }
        
    }//GEN-LAST:event_btnhapActionPerformed

    private void dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataMouseClicked
    try{
        int row = data.getSelectedRow();
        String table_klik = (data.getModel().getValueAt(row, 0).toString());
          java.sql.Connection conn = (java.sql.Connection)app.pegawai.Database.koneksiDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("Select * from user where id = '"+table_klik+"'");
     if(sql.next()){
         id = sql.getString("id");
         
         String user = sql.getString("username");
         txtuser.setText(user);
         String pass1 = sql.getString("password");
         txtpass1.setText(pass1);
          String pass2 = sql.getString("password");
         txtpass2.setText(pass2);
          String nik = sql.getString("nik");
         cmbnik.setSelectedItem(nik);

     }
     }catch (Exception e){}
      btnin.setEnabled(false);
      btntam.setEnabled(false);
      btnref.setEnabled(true);
      btnedt.setEnabled(true);
      btnhap.setEnabled(true);
    }//GEN-LAST:event_dataMouseClicked

    private void btntamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntamActionPerformed
        user us = new user();
        String pass1,pass2,user,nik,cari,hash;
        pass1 = new String(txtpass1.getPassword());
        pass2 = new String(txtpass2.getPassword());
        cari = "Select * from user where username = '" + txtuser.getText() + "' ";
            md5 md = new md5();
            Database db = new Database();
       if ((txtuser.getText().length()==0) || (cmbnik.getSelectedItem()=="")|| (pass1.length()==0) || (pass2.length()==0)){
           JOptionPane.showMessageDialog(null, " Data Tidak Lengkap!!!");
  }else{
           if (pass1.equals(pass2)){
               
               
               user = txtuser.getText();
               nik =(String) cmbnik.getSelectedItem();
               us.setNik(nik);
               us.setUser(user);
               us.setPass(pass1);
           
           if (vsimpan == true){
     try
     {     
       if (db.CariData(cari) == true) {
           JOptionPane.showMessageDialog(null, " Data Sudah Ada!!!");
       }else{
           hash = md.getMd5(us.getPass());
        String sql = "insert into user Values ('"+id+ "', '" + us.getNik() + "','" + us.getUser()+ "','" + hash + "')";
        java.sql.Connection conn = (java.sql.Connection)app.pegawai.Database.koneksiDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        refresh();
       }
    } catch (SQLException | HeadlessException e){
        JOptionPane.showMessageDialog(null, e);
    }
     
    }else{
         try{
                    if (db.CariData(cari) == true) {
           JOptionPane.showMessageDialog(null, " Data Sudah Ada!!!");
       }else{
                        hash = md.getMd5(us.getPass());
                   
        String sql = "update user set nik= '" + us.getNik() +"',username='" + us.getUser() + "',password='" + hash + "' where id='" + id + "'";
        java.sql.Connection conn = (java.sql.Connection)app.pegawai.Database.koneksiDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
          refresh();
                    }
            }catch (SQLException | HeadlessException e){
        JOptionPane.showMessageDialog(null, e);
                    }
       
               }        
           }
           else{JOptionPane.showMessageDialog(null, " Password Tidak Sama");
       }
       }
    }//GEN-LAST:event_btntamActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void ScreenUser() {
try {
    UIManager.setLookAndFeel( new FlatDarkLaf() );
} catch( Exception ex ) {
    System.err.println( "Failed to initialize LaF" );
}
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NIK;
    private javax.swing.JButton btnedt;
    private javax.swing.JButton btnhap;
    private javax.swing.JButton btnin;
    private javax.swing.JButton btnkel;
    private javax.swing.JButton btnref;
    private javax.swing.JButton btntam;
    private javax.swing.JCheckBox chkshow;
    private javax.swing.JComboBox<String> cmbnik;
    private javax.swing.JTable data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField txtpass1;
    private javax.swing.JPasswordField txtpass2;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
