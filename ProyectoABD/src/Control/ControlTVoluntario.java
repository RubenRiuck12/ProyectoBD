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
public class ControlTVoluntario {
    
    Connection con;
    
    private String host = "192.168.1.72";
    private String port = "3306";
    private String dbName = "PruebaBD";
    private String userName = "primero";
    private String password = "123456";
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private Statement st = null;
    
    //Metodo para subir un tipo de voluntario
    public void subirTipoVoluntario(String tipo){
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            String consulta = "INSERT INTO TipoVoluntario(tipo) values(?)";
            ps = con.prepareStatement(consulta);
            
            ps.setString(1, tipo);
            
            int rowsInsert = ps.executeUpdate();
            
            if(rowsInsert > 0){
                System.out.println("Tipo Voluntario agregada Correctamente");
                JOptionPane.showMessageDialog(null, "Tipo Voluntario agregado correctamente");
            }
        }catch(SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en agregar Tipo Voluntario");
        }finally{
            try{
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error Cerrar Conexion" + e);
            }
        }
    }
    
    public void llenarLista(JList lista){
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            st = con.createStatement();
            String consulta = "select tipo from TipoVoluntario";
            rs = st.executeQuery(consulta);
            
            DefaultListModel<String> listaM = new DefaultListModel<>(); 
             
            while(rs.next()){
                String data = rs.getString("tipo");
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
    
    //Metodo para actualizar Tipo de Cuota
    public void actTV(String cambtipo, String tipo){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa");
            
            String consulta = "update TipoVoluntario set tipo = ? where tipo = ?";
            
                ps = con.prepareStatement(consulta);
                ps.setString(1, cambtipo);
                ps.setString(2, tipo);
                ps.executeUpdate();
                System.out.println("Tipo de Voluntario Actualizado");
       }catch(SQLException e){
           System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en Modificar TP");
       }finally{
            try{
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }
   }
   
    //Metodo para eliminar Tipo de Voluntario
   public void eliminarTP(String tipo){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
           con = DriverManager.getConnection(url, this.userName, this.password);
           System.out.println("Conexion Exitosa ");
           st = con.createStatement();
           
           String consulta = "delete from TipoVoluntario where tipo ="+"'"+tipo+"'";
           int fill = st.executeUpdate(consulta);
           if(fill > 0){
               System.out.println("Eliminacion  Datos Completa");
               JOptionPane.showMessageDialog(null, "Se elimino el registro correctamente");
           }
           
       }catch(SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "ERROR EN ELIMINAR TIPO DE VOLUNTARI (ESTA ESTA ASIGANDA A VOLUNTARIOS)");
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
