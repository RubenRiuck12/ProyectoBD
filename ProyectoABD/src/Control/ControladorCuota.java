/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruben
 */
public class ControladorCuota {
    
    Connection con;
    private String host = "192.168.1.70";
    private String port = "3306";
    private String dbName = "PruebaBD";
    private String userName = "primero";
    private String password = "123456";
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private Statement st = null;
    
    public void RegistraCouta(String tipoCuota, int monto){
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            String consulta = "INSERT INTO TipodeCuota(idTipoCuota, montoActual) values(?,?)";
            ps = con.prepareStatement(consulta);
            
            ps.setString(1, tipoCuota);
            ps.setInt(2, monto);
            
            int rowsInsert = ps.executeUpdate();
            
            if(rowsInsert > 0){
              JOptionPane.showMessageDialog(null, "Cuota agregada Correctamente");
            }
        }catch (SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en agregar la cuota");
        }finally{
            try{
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }   
    }
    
    public void RellenarCombo(JComboBox combo){
        String consulta = "select idTipoCuota from TipodeCuota";
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            while(rs.next()){
                combo.addItem(rs.getString("idTipoCuota"));
            }
        }catch(SQLException e){
            
        }
    }
    
    public void actSede(String cuota, int monto){
      try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            String consulta = "update TipodeCuota set montoActual = ? where idTipoCuota = ?";
            
            if(monto != 0){
                ps = con.prepareStatement(consulta);
                ps.setInt(1, monto);
                ps.setString(2,cuota);
                System.out.println("Actualizado Cuota");
                ps.executeUpdate();
            }else{
                JOptionPane.showMessageDialog(null, "Ningun cambio generado"); 
                }
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
    
}
