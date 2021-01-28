
package app.pegawai;


import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Database { // koneksi ke database
    private static Connection mysqlkonek;
    public static Connection koneksiDB() throws SQLException {
        if(mysqlkonek==null){
            try {
                String DB="jdbc:mysql://localhost:3306/pegawai"; // delta_db database
                String user="root"; // user database
                String pass=""; // password database
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlkonek = (Connection) DriverManager.getConnection(DB,user,pass);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"gagal koneksi");
            }
        }
        return mysqlkonek;
    }
    public boolean CariData(String text){
        Boolean ada;
        ada=false;
        try
        {
            java.sql.Connection conn = (java.sql.Connection)app.pegawai.Database.koneksiDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery(text);
     if(sql.next()){
          ada=true; 
         
     }else{
         ada=false;
         
     }
   
        }catch (SQLException | HeadlessException e) {
    }

      return ada; 
    }
}