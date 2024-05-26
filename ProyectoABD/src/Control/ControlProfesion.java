/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruben
 */
public class ControlProfesion {
    Connection con;
    
    private String host = "192.168.1.72";
    private String port = "3306";
    private String dbName = "PruebaBD";
    private String userName = "primero";
    private String password = "123456";
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private Statement st = null;
    
    //Metodo para subir la Profesion del voluntario
    public void subirProfesion(String nombre){
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            String consulta = "INSERT INTO Profesion(nombre) values(?)";
            ps = con.prepareStatement(consulta);
            
            ps.setString(1, nombre);
            
            int rowsInsert = ps.executeUpdate();
            
            if(rowsInsert > 0){
                System.out.println("Profesion agregada Correctamente");
                JOptionPane.showMessageDialog(null,"Profesion agregado correctamente");
            }
        }catch(SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en agregar Profesion");
        }finally{
            try{
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error Cerrar Conexion" + e);
            }
        }
    }
    
    //Metodo para lleanr la lista de las Profesiones
    public void llenarLista(JList lista){
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            st = con.createStatement();
            String consulta = "select nombre from Profesion";
            rs = st.executeQuery(consulta);
            
            DefaultListModel<String> listaM = new DefaultListModel<>(); 
             
            while(rs.next()){
                String data = rs.getString("nombre");
                listaM.addElement(data);
            }
            lista.setModel(listaM);
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
   }
    
    //Metodo para actualizar Profesion
    public void actProf(String cambnombre, String nombre){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa");
            
            String consulta = "update Profesion set nombre = ? where nombre = ?";
            
                ps = con.prepareStatement(consulta);
                ps.setString(1, cambnombre);
                ps.setString(2, nombre);
                ps.executeUpdate();
                System.out.println("Profesion Actualizado");
       }catch(SQLException e){
           System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en Modificar Prof");
       }finally{
            try{
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }
   }
   
    //Metodo para eliminar Profesion
   public void eliminarProf(String nombre){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
           con = DriverManager.getConnection(url, this.userName, this.password);
           System.out.println("Conexion Exitosa ");
           st = con.createStatement();
           
           String consulta = "delete from Profesion where nombre ="+"'"+nombre+"'";
           int fill = st.executeUpdate(consulta);
           if(fill > 0){
               System.out.println("Eliminacion  Datos Completa");
               JOptionPane.showMessageDialog(null, "Se elimino el registro correctamente");
           }
           
       }catch(SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "ERROR EN ELIMINAR REGISTRO");
       }finally {
            try {
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (SQLException e) {
               System.out.println("Error" + e);
               JOptionPane.showMessageDialog(null, "ERROR EN CERRAR CONEXIONES");
            } 
        }
   }
    
}
