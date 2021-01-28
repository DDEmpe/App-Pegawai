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
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class time {
    String formattedDate;

  public void setTime() {
    LocalDateTime myDateObj = LocalDateTime.now();
 
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    formattedDate = myDateObj.format(myFormatObj);

  }
  
public String getTime(){
    return(formattedDate);
}  
}


