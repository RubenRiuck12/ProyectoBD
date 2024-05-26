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
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruben
 */
public class ControlAlmacen {
    
           
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
    
    public void resgistrarAlimento(String nombre, int cantidad, int sede){
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            String consulta = "INSERT INTO MaterialAlimento(nombre, cantidad, idSede) values(?,?,?)";
            ps = con.prepareStatement(consulta);
            
            ps.setString(1, nombre);
            ps.setInt(2, cantidad);
            ps.setInt(3, sede);
            
            int rowsInsert = ps.executeUpdate();
            
            if(rowsInsert > 0){
                System.out.println("Alimento agregada Correctamente");
                JOptionPane.showMessageDialog(null, "Alimento agregado correctamente");
            }
        }catch (SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en agregar Alimento");
        }finally{
            try{
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error Cerrar Conexion" + e);
            }
        }  
    }
        
    public void resgistrarMedicamento(String nombre, int cantidad, int sede){
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            String consulta = "INSERT INTO MaterialMedicamento(nombre, cantidad, idSede) values(?,?,?)";
            ps = con.prepareStatement(consulta);
            
            ps.setString(1, nombre);
            ps.setInt(2, cantidad);
            ps.setInt(3, sede);
            
            int rowsInsert = ps.executeUpdate();
            
            if(rowsInsert > 0){
                System.out.println("Alimento agregada Correctamente");
                JOptionPane.showMessageDialog(null, "Alimento agregado correctamente");
            }
        }catch (SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en agregar Alimento");
        }finally{
            try{
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error Cerrar Conexion" + e);
            }
        }  
    }
            
    //Metodo para pasar de ciudad a un id de sede
    public int passCiudadID(String ciudad){
        int id = 0;
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            st = con.createStatement();
            String consulta = "select idSede from sede where ciudad = "+"'"+ciudad+"'";
            rs = st.executeQuery(consulta);
            while(rs.next()){
                id = rs.getInt("idSede");
            }
        }catch (SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en conseguir id");
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
       return id;
    }
        
    //Metodo para pasar de id a ciudad de sede
    public String passIDCiudad(int id){
        String ciudad = "";
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            st = con.createStatement();
            String consulta = "select ciudad from sede where idSede = "+id;
            rs2 = st.executeQuery(consulta);
            while(rs2.next()){
                ciudad = rs2.getString("ciudad");
            }
        }catch (SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en conseguir id");
        }finally {
            try {
                if (rs2 != null) rs2.close();
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (SQLException e) {
               System.out.println("Error" + e);
               JOptionPane.showMessageDialog(null, "ERROR EN CERRAR CONEXIONES");
            } 
        }
       return ciudad;
    }
        
    //Metodo para llenar la ccombo de sede
    public void RellenarComboSede(JComboBox combo){
        String consulta = "select ciudad from sede";
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            while(rs.next()){
                combo.addItem(rs.getString("ciudad"));
            }
        }catch(SQLException e){
            System.out.println("Error combo" + e); 
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
        
    //Metodo para llenar lista
    public HashMap<String, Integer> rellenarListaVolu(JList lista){
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            st = con.createStatement();
            String consulta = "select idMaterialAlimento, nombre from MaterialAlimento";
            rs = st.executeQuery(consulta);
            
            DefaultListModel<String> listaM = new DefaultListModel<>(); 
             
            while(rs.next()){
                int i = rs.getInt("idMaterialAlimento");
                String data = rs.getString("nombre");
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
    
            
    //Metodo para llenar lista
    public HashMap<String, Integer> rellenarListaMed(JList lista){
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            st = con.createStatement();
            String consulta = "select idMaterialMedicamento, nombre from MaterialMedicamento";
            rs = st.executeQuery(consulta);
            
            DefaultListModel<String> listaM = new DefaultListModel<>(); 
             
            while(rs.next()){
                int i = rs.getInt("idMaterialMedicamento");
                String data = rs.getString("nombre");
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
    
   //Metodo para actualizar la lista si se aprieta un elemento
    public ResultSet ponerNombres(int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
           con = DriverManager.getConnection(url, this.userName, this.password);
           st = con.createStatement();
           
           String consulta = "select * from MaterialAlimento where idMaterialAlimento = "+id;
           
           rs = st.executeQuery(consulta);
           
       }catch(SQLException e){
           System.out.println("Error" + e);
           JOptionPane.showMessageDialog(null, "ERROR EN CONSEGUIR NOMBRES");
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
    
        
   //Metodo para actualizar la lista si se aprieta un elemento
    public ResultSet ponerNombresM(int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
           con = DriverManager.getConnection(url, this.userName, this.password);
           st = con.createStatement();
           
           String consulta = "select * from MaterialMedicamento where idMaterialMedicamento = "+id;
           
           rs = st.executeQuery(consulta);
           
       }catch(SQLException e){
           System.out.println("Error" + e);
           JOptionPane.showMessageDialog(null, "ERROR EN CONSEGUIR NOMBRES");
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
       
   public void actnombre(String nombre, int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            
            String consulta = "update MaterialAlimento set nombre = ? where idMaterialAlimento = ?";
            
            if(!nombre.isEmpty()){
                ps = con.prepareStatement(consulta);
                ps.setString(1, nombre);
                ps.setInt(2, id);
                ps.executeUpdate();
                System.out.println("Nombre Actualizado");
            }          
       }catch(SQLException e){
           System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en Modificar Nombre");
       }finally{
            try{
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }
   }
   
          
   public void actCantidad(int cantidad, int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            
            String consulta = "update MaterialAlimento set cantidad = ? where idMaterialAlimento = ?";
            
                ps = con.prepareStatement(consulta);
                ps.setInt(1, cantidad);
                ps.setInt(2, id);
                ps.executeUpdate();
                System.out.println("Catidad Actualizado");        
       }catch(SQLException e){
           System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en Modificar Cantidad");
       }finally{
            try{
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }
   }
       
   public void actSede(int sede, int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            
            String consulta = "update MaterialAlimento set idSede = ? where idMaterialAlimento = ?";
            
                ps = con.prepareStatement(consulta);
                ps.setInt(1, sede);
                ps.setInt(2, id);
                ps.executeUpdate();
                System.out.println("idSede Actualizado");
                
       }catch(SQLException e){
           System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en Modificar idSede");
       }finally{
            try{
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }
   }
      
   public void eliminarMat(int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            
            String consulta = "delete from MaterialAlimento where idMaterialAlimento = ?";
            
                ps = con.prepareStatement(consulta);
                ps.setInt(1, id);
                ps.executeUpdate();
                System.out.println("Alimento Eliminado");
                
       }catch(SQLException e){
           System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en Eliminando");
       }finally{
            try{
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }
   }
          
   public void actnombreM(String nombre, int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            
            String consulta = "update MaterialMedicamento set nombre = ? where idMaterialMedicamento = ?";
            
            if(!nombre.isEmpty()){
                ps = con.prepareStatement(consulta);
                ps.setString(1, nombre);
                ps.setInt(2, id);
                ps.executeUpdate();
                System.out.println("Nombre Actualizado");
            }          
       }catch(SQLException e){
           System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en Modificar Nombre");
       }finally{
            try{
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }
   }
   
          
   public void actCantidadM(int cantidad, int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            
            String consulta = "update MaterialMedicamento set cantidad = ? where idMaterialMedicamento = ?";
            
                ps = con.prepareStatement(consulta);
                ps.setInt(1, cantidad);
                ps.setInt(2, id);
                ps.executeUpdate();
                System.out.println("Catidad Actualizado");        
       }catch(SQLException e){
           System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en Modificar Cantidad");
       }finally{
            try{
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }
   }
       
   public void actSedeM(int sede, int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            
            String consulta = "update MaterialMedicamento set idSede = ? where idMaterialMedicamento = ?";
            
                ps = con.prepareStatement(consulta);
                ps.setInt(1, sede);
                ps.setInt(2, id);
                ps.executeUpdate();
                System.out.println("idSede Actualizado");
                
       }catch(SQLException e){
           System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en Modificar idSede");
       }finally{
            try{
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }
   }
      
   public void eliminarMatM(int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            
            String consulta = "delete from MaterialMedicamento where idMaterialMedicamento = ?";
            
                ps = con.prepareStatement(consulta);
                ps.setInt(1, id);
                ps.executeUpdate();
                System.out.println("Medicamento Eliminado");
                
       }catch(SQLException e){
           System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en Eliminando");
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

