/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruben
 */
//"192.168.1.76" - "3306" - "pruebaC" - "primero" - "123456"
public class ConexionUsuario {
    Connection con;
    
    private String host = "192.168.1.70";
    private String port = "3306";
    private String dbName = "pruebaC";
    private String userName;
    private String password;

    public ConexionUsuario(String userName, String password){
        this.userName = userName;
        this.password = password;
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            
        }catch (SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecta");
        }
    }
    
    
    
    /*
    public static void main(String[] args) {
        ConexionUsuario cu = new ConexionUsuario();
    }
    */
    
}
