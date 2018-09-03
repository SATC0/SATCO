/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author acer
 */
public class ConexionReport {
    
    Connection myConnection;
    
    /** Creates a new instance of MyDBConnection */
    public ConexionReport() {
 try{
        
        Class.forName("com.mysql.jdbc.Driver");
        myConnection=DriverManager.getConnection("jdbc:mysql://localhost/dimolo8","root", "");
        
      
        }
        catch(Exception e){
            System.out.println("Failed to get connection");
            e.printStackTrace();
        }
    }

    public void IniciarConexion(){
    
      
    }
    
    
    public Connection getMyConnection(){
        return myConnection;
    }
    
    
    public void Close(ResultSet rs){
        
        if(rs !=null){
            try{
               rs.close();
            }
            catch(Exception e){}
        
        }
    }
    
     public void Close(java.sql.Statement stmt){
        
        if(stmt !=null){
            try{
               stmt.close();
            }
            catch(Exception e){}
        
        }
    }
     
  public void Cerrar(){
  
    if(myConnection !=null){
    
         try{
               myConnection.close();
            }
            catch(Exception e){}
        
        
    }
  }
    
}
