/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.pegawai;

import javax.swing.JOptionPane;

/**
 *
 * @author deric
 */
public class GuiBeli extends javax.swing.JFrame {

    /**
     * Creates new form GuiBeli
     */
    public GuiBeli() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txttot = new javax.swing.JTextField();
        txtkode = new javax.swing.JTextField();
        txtjum = new javax.swing.JTextField();
        txthar = new javax.swing.JTextField();
        btnin = new javax.swing.JButton();
        cmbfur = new javax.swing.JComboBox<>();
        btnbat = new javax.swing.JButton();
        btntam = new javax.swing.JButton();
        btnref = new javax.swing.JButton();
        btnedt = new javax.swing.JButton();
        btnhap = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        data = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        biaya = new javax.swing.JLabel();
        txtbay = new javax.swing.JTextField();
        ttxkem = new javax.swing.JTextField();
        btnkel = new javax.swing.JButton();
        btnbay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Kode");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel3.setText("Furniture");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 82, -1, -1));

        jLabel4.setText("Jumlah");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel5.setText("Harga");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("TRANSAKSI BELI");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel6.setText("Total");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));
        jPanel1.add(txttot, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 100, -1));
        jPanel1.add(txtkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 110, -1));
        jPanel1.add(txtjum, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 110, -1));
        jPanel1.add(txthar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 100, -1));

        btnin.setText("Input");
        jPanel1.add(btnin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        cmbfur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbfur, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 110, -1));

        btnbat.setText("Batal");
        jPanel1.add(btnbat, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        btntam.setText("Tambah");
        jPanel1.add(btntam, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        btnref.setText("Refresh");
        jPanel1.add(btnref, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        btnedt.setText("Edit");
        jPanel1.add(btnedt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        btnhap.setText("Hapus");
        jPanel1.add(btnhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 190));

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
        jScrollPane1.setViewportView(data);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 660, 180));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Biaya");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, -1, -1));

        jLabel8.setText("Bayar");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 54, -1, -1));

        jLabel9.setText("Kembali");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 86, -1, -1));

        biaya.setText("Rp.");
        jPanel3.add(biaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));
        jPanel3.add(txtbay, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 80, -1));
        jPanel3.add(ttxkem, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 80, -1));

        btnkel.setText("Keluar");
        btnkel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkelActionPerformed(evt);
            }
        });
        jPanel3.add(btnkel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        btnbay.setText("Bayar");
        jPanel3.add(btnbay, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 650, 110));

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

    /**
     * @param args the command line arguments
     */
    public static void ScreenBeli() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiBeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiBeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiBeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiBeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiBeli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel biaya;
    private javax.swing.JButton btnbat;
    private javax.swing.JButton btnbay;
    private javax.swing.JButton btnedt;
    private javax.swing.JButton btnhap;
    private javax.swing.JButton btnin;
    private javax.swing.JButton btnkel;
    private javax.swing.JButton btnref;
    private javax.swing.JButton btntam;
    private javax.swing.JComboBox<String> cmbfur;
    private javax.swing.JTable data;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ttxkem;
    private javax.swing.JTextField txtbay;
    private javax.swing.JTextField txthar;
    private javax.swing.JTextField txtjum;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txttot;
    // End of variables declaration//GEN-END:variables
}
