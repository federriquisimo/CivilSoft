/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import Controller.login;

/**
 *
 * @author USUARIO
 */
public class Main {
    
  
    
    public static void main(String[] args) {
        
         Connection conn = null;
        Statement stm=null;
        ResultSet usuarioResultSet;
        
        try{
            conn = ConectaBD.abrir();
            stm = conn.createStatement();
            usuarioResultSet = stm.executeQuery("SHOW FULL TABLES FROM civilsoft");
            if(!usuarioResultSet.next()){
                System.out.println(" No se encontro el registro");
                ConectaBD.cerrar();
                
            }else{
              
                System.out.println("Se encontró el registro");
                System.out.println(usuarioResultSet.getRow());
               
               
            }
        }catch(Exception e){
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            
        } 
     
       
       
       
       
        
    }
    
    
    
    
}
