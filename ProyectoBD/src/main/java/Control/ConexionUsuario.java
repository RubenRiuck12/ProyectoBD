/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ruben
 */
public class ConexionUsuario {
    Connection con;
    private String host = "192.168.1.76";
    private String port = "3307";
    private String dbName = "pruebaC";
    private String userName = "primero";
    private String password = "123456";
    
    public ConexionUsuario(){
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
        }catch (SQLException e){
            System.out.println("Error ta madre" + e);
        }
    }
    
    public static void main(String[] args) {
        ConexionUsuario cu = new ConexionUsuario();
    }
    
}
