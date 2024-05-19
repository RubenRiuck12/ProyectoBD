/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;

/**
 *
 * @author Ruben
 */
public class ControlSede {
    Connection con;
    
    private String host = "192.168.1.70";
    private String port = "3306";
    private String dbName = "PruebaBD";
    private String userName = "primero";
    private String password = "123456";
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private Statement st = null;
    
    public Connection conexion(){
        con = null;
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
        }catch (SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error al ingresar la Sede");
        }
        return con;
    }
    
    public void subirSede(String ciudad, String domicilio, String director){
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            String consulta = "INSERT INTO sede(ciudad,domicilio,director) values(?,?,?)";
            ps = con.prepareStatement(consulta);
            
            ps.setString(1, ciudad);
            ps.setString(2,domicilio);
            ps.setString(3, director);
            
            int rowsInsert = ps.executeUpdate();
            
            if(rowsInsert > 0){
              JOptionPane.showMessageDialog(null, "Sede agregada Correctamente");
            }
        }catch (SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error Ciudad ya registrada");
        }finally{
            try{
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }
    }
    
    public void actSede(String ciudad, String domicilio, String director){
      try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            String consulta = "update sede set domicilio = ? where ciudad = ?";
            String consulta2 = "update sede set director = ? where ciudad = ?";
            if(!domicilio.isEmpty()){
                ps = con.prepareStatement(consulta);
                ps.setString(1, domicilio);
                ps.setString(2,ciudad);
                System.out.println("Actualizado Domicilio");
                ps.executeUpdate();
            }          
            if(!director.isEmpty()){
                ps = con.prepareStatement(consulta2);
                ps.setString(1, director);
                ps.setString(2,ciudad);
                System.out.println("Actualizado Director");
                ps.executeUpdate();
            }
            
            if(director.isEmpty() && domicilio.isEmpty()){
                JOptionPane.showMessageDialog(null, "Ningun cambio generado");
            }
//            int rowsInsert = 
//            
//            if(rowsInsert > 0){
//                System.out.println("Nuevo agregado");
//                JOptionPane.showMessageDialog(null, "Sede actualizada");
//            }
        }catch (SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACION DE DATOS");
        }finally{
            try{
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }  
    }
    
    public ResultSet llenarLista(){
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            st = con.createStatement();
            String consulta = "select ciudad from sede";
            rs = st.executeQuery(consulta);
        }catch(SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "ERROR EN LLENAR LISTA");
        }finally {
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (SQLException e) {
               System.out.println("Error" + e);
               JOptionPane.showMessageDialog(null, "ERROR EN CERRAR CONEXIONES");
            } 
    }
        return rs;
   }
    
    public ResultSet ciudadActualizar(String ciudad){
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            st = con.createStatement();
            String consulta = "select domicilio, director from sede where ciudad = "+"'"+ciudad+"'";
            rs = st.executeQuery(consulta);
        }catch(SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "ERROR EN SELECIONAR LISTA");
        }finally {
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (SQLException e) {
               System.out.println("Error" + e);
               JOptionPane.showMessageDialog(null, "ERROR EN CERRAR CONEXIONES");
            } 
    }
        return rs;
   }
    
}
