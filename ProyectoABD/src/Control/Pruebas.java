/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Ruben
 */
public class Pruebas {
    Connection con;
    
    private String host = "192.168.1.70";
    private String port = "3306";
    private String dbName = "pruebaC";
    private String userName = "primero";
    private String password = "123456";
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    public Pruebas(){
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            //ps = con.prepareStatement("SHOW GRANTS FOR 'primero'@'%'");
            
            
            
        }catch (SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecta");
        }
    }
    
    public static void main(String[] args) {
        Pruebas pb = new Pruebas();
    }
}
