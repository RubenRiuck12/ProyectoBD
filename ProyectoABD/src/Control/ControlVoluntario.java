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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ruben
 */
public class ControlVoluntario {
        
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
    
    //Metodo para solo hacer la conexion
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
    
    //Metodo para regsitrar un voluntario con profesion Humanitaria
    public void subirVoluntarioHum(String nombre, String apeP, String apeM, String domicilio, String fechaNac, String telefono, int idSede, int idTipoVoluntario, int idProfesion, boolean disponibilidad, int participaciones){
       try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            String consulta = "INSERT INTO Voluntario(nombre, apellidoP, apellidoM, domicilio, fechaNac, telefono, idSede, idTipoVoluntario, idProfesion, disponibilidad, participacion) values(?,?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(consulta);
            
            ps.setString(1, nombre);
            ps.setString(2, apeP);
            ps.setString(3, apeM);
            ps.setString(4, domicilio);
            ps.setString(5, fechaNac);
            ps.setString(6, telefono);
            ps.setInt(7, idSede);
            ps.setInt(8, idTipoVoluntario);
            ps.setInt(9, idProfesion);
            ps.setBoolean(10, disponibilidad);
            ps.setInt(11, participaciones);
            
            int rowsInsert = ps.executeUpdate();
            
            if(rowsInsert > 0){
                System.out.println("Voluntario agregada Correctamente");
                JOptionPane.showMessageDialog(null, "Voluntario agregado correctamente");
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
    }
         
    //Metodo para subir Voluntarios que no son Humanitarios
    public void subirVoluntario(String nombre, String apeP, String apeM, String domicilio, String fechaNac, String telefono, int idSede, int idTipoVoluntario){
       try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            String consulta = "INSERT INTO Voluntario(nombre, apellidoP, apellidoM, domicilio, fechaNac, telefono, idSede, idTipoVoluntario) values(?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(consulta);
            
            ps.setString(1, nombre);
            ps.setString(2, apeP);
            ps.setString(3, apeM);
            ps.setString(4, domicilio);
            ps.setString(5, fechaNac);
            ps.setString(6, telefono);
            ps.setInt(7, idSede);
            ps.setInt(8, idTipoVoluntario);
            int rowsInsert = ps.executeUpdate();
            
            if(rowsInsert > 0){
                System.out.println("Voluntario agregada Correctamente");
                JOptionPane.showMessageDialog(null, "Voluntario agregado correctamente");
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
    
        //Metodo para llenar combo de tipo de voluntario
    public void RellenarComboTV(JComboBox combo){
        String consulta = "select tipo from TipoVoluntario";
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            while(rs.next()){
                combo.addItem(rs.getString("tipo"));
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
      
    //Metodo para llenar comboo de Profesion
        public void RellenarComboProf(JComboBox combo){
        String consulta = "select nombre from Profesion";
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            while(rs.next()){
                if(!"Ninguno".equals(rs.getString("nombre"))){
                    combo.addItem(rs.getString("nombre"));
                }
                
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
    
    public int passTVID(String tipo){
        int id = 0;
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            st = con.createStatement();
            String consulta = "select idTipoVoluntario from TipoVoluntario where tipo = "+"'"+tipo+"'";
            rs = st.executeQuery(consulta);
            while(rs.next()){
                id = rs.getInt("idTipoVoluntario");
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
        
    //Metodo para pasar de id a tipo de Tipo Voluntario
    public String passIDTVol(int id){
        String tipo = "";
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            st = con.createStatement();
            String consulta = "select tipo from TipoVoluntario where idTipoVoluntario = "+id;
            rs2 = st.executeQuery(consulta);
            while(rs2.next()){
                tipo = rs2.getString("tipo");
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
       return tipo;
    }
    
    public int passProf(String profesion){
        int id = 0;
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            st = con.createStatement();
            String consulta = "select idProfesion from Profesion where nombre = "+"'"+profesion+"'";
            rs = st.executeQuery(consulta);
            while(rs.next()){
                id = rs.getInt("idProfesion");
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
        
    //Metodo para pasar de id a tipo de Tipo Voluntario
    public String passIDProf(int id){
        String profesion = "";
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            st = con.createStatement();
            String consulta = "select nombre from Profesion where idProfesion = "+id;
            rs2 = st.executeQuery(consulta);
            while(rs2.next()){
                profesion = rs2.getString("nombre");
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
       return profesion;
    }
    
    //Metodo para llenar lista
    public HashMap<String, Integer> rellenarListaVolu(JList lista){
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            st = con.createStatement();
            String consulta = "select idVoluntario, nombre, apellidoP, apellidoM from Voluntario";
            rs = st.executeQuery(consulta);
            
            DefaultListModel<String> listaM = new DefaultListModel<>(); 
             
            while(rs.next()){
                int i = rs.getInt("idVoluntario");
                String data = rs.getString("nombre");
                String data2 = rs.getString("apellidoP");
                String data3 = rs.getString("apellidoM");
                listaM.addElement(data+" "+data2+" "+data3);
                mapa.put(data+" "+data2+" "+data3, i);
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
           
           String consulta = "select * from Voluntario where idVoluntario = "+id;
           
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
   
    public void actNom(String nombre, int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            
            String consulta = "update Voluntario set nombre = ? where idVoluntario = ?";
            
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
   
      
    public void actApeP(String apellido, int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            
            String consulta = "update Voluntario set apellidoP = ? where idVoluntario = ?";
            
            if(!apellido.isEmpty()){
                ps = con.prepareStatement(consulta);
                ps.setString(1, apellido);
                ps.setInt(2, id);
                ps.executeUpdate();
                System.out.println("Apellido Paterno Actualizado");
            }          
       }catch(SQLException e){
           System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en Modificar ApellidoP");
       }finally{
            try{
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }
   }
   
    public void actApeM(String apellido, int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            
            String consulta = "update Voluntario set apellidoM = ? where idVoluntario = ?";
            
            if(!apellido.isEmpty()){
                ps = con.prepareStatement(consulta);
                ps.setString(1, apellido);
                ps.setInt(2, id);
                ps.executeUpdate();
                System.out.println("Apellido Maaterno Actualizado");
            }          
       }catch(SQLException e){
           System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en Modificar ApellidoM");
       }finally{
            try{
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }
   }
   
   public void actDomicilio(String domicilio, int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            
            String consulta = "update Voluntario set domicilio = ? where idVoluntario = ?";
            
            if(!domicilio.isEmpty()){
                ps = con.prepareStatement(consulta);
                ps.setString(1, domicilio);
                ps.setInt(2, id);
                ps.executeUpdate();
                System.out.println("Domicilio Actualizado");
            }          
       }catch(SQLException e){
           System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en Modificar Domicilio");
       }finally{
            try{
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }
   }
   
   public void actFechaNac(String fechaNac, int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            
            String consulta = "update Voluntario set fechaNac = ? where idVoluntario = ?";
            
            if(!fechaNac.isEmpty()){
                ps = con.prepareStatement(consulta);
                ps.setString(1, fechaNac);
                ps.setInt(2, id);
                ps.executeUpdate();
                System.out.println("FechaNac Actualizado");
            }          
       }catch(SQLException e){
           System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en Modificar FechaNac");
       }finally{
            try{
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }
   }
   
   public void acttelefono(String tel, int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            
            String consulta = "update Voluntario set telefono = ? where idVoluntario = ?";
            
            if(!tel.isEmpty()){
                ps = con.prepareStatement(consulta);
                ps.setString(1, tel);
                ps.setInt(2, id);
                ps.executeUpdate();
                System.out.println("Telefono Actualizado");
            }          
       }catch(SQLException e){
           System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en Modificar Telefono");
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
            
            String consulta = "update Voluntario set idSede = ? where idVoluntario = ?";
            
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
   
       
   public void actTVolun(int TVolun, int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            
            String consulta = "update Voluntario set idTipoVoluntario = ? where idVoluntario = ?";
            
                ps = con.prepareStatement(consulta);
                ps.setInt(1, TVolun);
                ps.setInt(2, id);
                ps.executeUpdate();
                System.out.println("idTVoluntario Actualizado");
                
       }catch(SQLException e){
           System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en Modificar idTVoluntario");
       }finally{
            try{
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }
   }
   
       
   public void actProfesion(int Prof, int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            
            String consulta = "update Voluntario set idProfesion = ? where idVoluntario = ?";
            
                ps = con.prepareStatement(consulta);
                ps.setInt(1, Prof);
                ps.setInt(2, id);
                ps.executeUpdate();
                System.out.println("idProfesion Actualizado");
                
       }catch(SQLException e){
           System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en Modificar idProfesion");
       }finally{
            try{
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }
   }
        
   public void actPis(boolean dis, int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            
            String consulta = "update Voluntario set disponibilidad = ? where idVoluntario = ?";
            
                ps = con.prepareStatement(consulta);
                ps.setBoolean(1, dis);
                ps.setInt(2, id);
                ps.executeUpdate();
                System.out.println("disponibilidad Actualizado");
                
       }catch(SQLException e){
           System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en Modificar idProfesion");
       }finally{
            try{
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }
   }
   
   public void eliminarVol(int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            
            String consulta = "delete from Voluntario where idVoluntario = ?";
            
                ps = con.prepareStatement(consulta);
                ps.setInt(1, id);
                ps.executeUpdate();
                System.out.println("Voluntario Eliminado");
                
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
   
  public void LenarTabal(JTable tabla){
        String consulta = "select * from Voluntario";
        ControlSocio cs = new ControlSocio();
        con = cs.conexion();
        DefaultTableModel tmodel = new DefaultTableModel();
        tmodel.addColumn("Nombre");
        tmodel.addColumn("Apellido Paterno");
        tmodel.addColumn("Apellido Materno");
        tmodel.addColumn("Domicilio");
        tmodel.addColumn("Fecha Nacimiento");
        tmodel.addColumn("Telefono");
        tmodel.addColumn("Sede");
        tmodel.addColumn("Tipo");
        tmodel.addColumn("Profesion");
        tmodel.addColumn("Participaciones");
        tmodel.addColumn("Disponibilidad");
        tabla.setModel(tmodel);
        
        String [] datos = new String[11];
        try{
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            while(rs.next()){
                datos[0] = rs.getString("nombre");
                datos[1] = rs.getString("apellidoP");
                datos[2] = rs.getString("apellidoM");
                datos[3] = rs.getString("domicilio");
                datos[4] = rs.getString("fechaNac");
                datos[5] = rs.getString("telefono");
                datos[6] = passIDCiudad(rs.getInt("idSede"));
                datos[7] = passIDTVol(rs.getInt("idTipoVoluntario"));
                datos[8] = passIDProf(rs.getInt("idProfesion"));
                datos[9] = rs.getString("participacion"); 
                if(rs.getBoolean("disponibilidad")){
                    datos[10] = "Disponible";
                }else{
                    datos[10] = "No Disponible";
                }
                tmodel.addRow(datos);
            }
            tabla.setModel(tmodel);
        }catch(SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en la tabla");
        }finally{
            try{
                if(st != null) st.close();
                if(con != null) con.close();
                if(rs != null) rs.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }
    }
}

