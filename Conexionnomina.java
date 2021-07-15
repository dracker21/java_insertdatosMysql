/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigosnomina;
import java.sql.*;

/**
 *
 * @author Jorge Sanchez
 */
public class Conexionnomina {
    static Connection conexion=null;
    static Statement sentencia;    
    public static void conectar(){
    String ruta ="jdbc:mysql://localhost/nomina";
    String user ="root";
    String pass = "pass123";
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=DriverManager.getConnection(ruta, user, pass);
            sentencia= conexion.createStatement();
            System.out.println("conectado");
                      
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("no conectado");
            
        }
    
    }
    public static void guardar(variablesnomina x){
        String q = "INSERT INTO empleados VALUES('"+x.getNombre()+"','"+x.getCargo()+"','"+x.getSueldo()+"')";
        ejecutar(q);
        
    }
           public static void ejecutar (String q){
           
               try {
                   sentencia.executeUpdate(q);
                   System.out.println("correcto");
               } catch (SQLException e) {
                   System.out.println("Error");
                          
               }
               }
                   
    
}
