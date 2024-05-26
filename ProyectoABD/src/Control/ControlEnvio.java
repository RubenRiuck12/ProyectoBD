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
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruben
 */
public class ControlEnvio {
            
    Connection con;
    
    private String host = "192.168.1.72";
    private String port = "3306";
    private String dbName = "PruebaBD";
    private String userName = "primero";
    private String password = "123456";
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private ResultSet rs2 = null;
    private Statement st = null;
    HashMap<String, Integer> mapa = new HashMap<>();
    
        
    //Metodo para regsitrar un voluntario con profesion Humanitaria
    public int subirEnvio(String fecha, String destino){
        int idEnvio = 0;
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            String consulta = "INSERT INTO Envio(fecha, destino) values(?,?)";
            ps = con.prepareStatement(consulta, PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, fecha);
            ps.setString(2, destino);
            
            int rowsInsert = ps.executeUpdate();
            
            if(rowsInsert > 0){
                System.out.println("Envio agregada Correctamente");
                JOptionPane.showMessageDialog(null, "Envio agregado correctamente");
            }
            
            rs = ps.getGeneratedKeys();
            while(rs.next()){
                idEnvio = rs.getInt(1);
            }
            
        }catch (SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Erro en agregar Voluntario");
        }finally{
            try{
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error Cerrar Conexion" + e);
            }
        }
       return idEnvio;
    }
        
    //Metodo para llenar lista
    public HashMap<String, Integer> rellenarListaVolu(JList lista){
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            st = con.createStatement();
            String consulta = "select idSede, ciudad from sede";
            rs = st.executeQuery(consulta);
            
            DefaultListModel<String> listaM = new DefaultListModel<>(); 
             
            while(rs.next()){
                int i = rs.getInt("idSede");
                String data = rs.getString("ciudad");
                listaM.addElement(data);
                mapa.put(data, i);
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
        return mapa;
   }
   
}
