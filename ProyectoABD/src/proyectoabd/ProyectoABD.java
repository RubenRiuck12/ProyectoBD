/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoabd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ruben
 */
public class ProyectoABD {

    Connection con;
    private String host = "192.168.1.76";
    private String port = "3306";
    private String dbName = "pruebaC";
    private String userName = "primero";
    private String password = "123456";

    public ProyectoABD(){
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
        }catch (SQLException e){
            System.out.println("Error ta madre" + e);
        }
    }
    
    public static void main(String[] args) {
        ProyectoABD cu = new ProyectoABD();
    }
}
