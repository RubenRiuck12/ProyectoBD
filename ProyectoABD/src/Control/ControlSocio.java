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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruben
 */
public class ControlSocio {
    
    Connection con;
    
    private String host = "192.168.1.72";
    private String port = "3306";
    private String dbName = "PruebaBD";
    private String userName = "primero";
    private String password = "123456";
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private Statement st = null;
    
     
     //Metodo para conexion
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
     //Metodo para hacer la consulta de algun id
    public int llamarId(String consulta){
        con = null;
        int id = 0;
        String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
        try{
        con = DriverManager.getConnection(url, this.userName, this.password);
        System.out.println("Conexion Exitosa ");
        st = con.createStatement();
        rs = st.executeQuery(consulta);
        while(rs.next()){
            id = rs.getInt(1);
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en hacer id Sede");
        }finally {
            try {
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (SQLException e) {
               System.out.println("Error" + e);
               JOptionPane.showMessageDialog(null, "ERROR EN CERRAR CONEXIONES");
            } 
        }
    return id;
    } 
     
     //Metodo para subir a los socios a la Base de datos
    public void subirSocio(String nombre, String apeP, String apeM, String domicilio, String fechaNac, String telefono, String cuenB, String fechaPag, int idSede, String tc){
       try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            String consulta = "INSERT INTO socio(cuentaBancaria, fechaPago, idSede, idTipoCuota) values(?,?,?,?)";
            ps = con.prepareStatement(consulta, PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, cuenB);
            ps.setString(2, fechaPag);
            ps.setInt(3, idSede);
            ps.setString(4, tc);
            
            int rowsInsert = ps.executeUpdate();
            
            if(rowsInsert > 0){
                System.out.println("socio agregada Correctamente");
              
              rs = ps.getGeneratedKeys();
              int idS = 0;
              while(rs.next()){
                  idS = rs.getInt(1);
              }
              
            String consulta2 = "INSERT INTO DatosPersonalesS(nombre, apellidoP, apellidoM, domicilio, fechaNac, telefono, idSocio) values(?,?,?,?,?,?,?)";
            ps = con.prepareStatement(consulta2);
            
            ps.setString(1, nombre);
            ps.setString(2, apeP);
            ps.setString(3, apeM);
            ps.setString(4, domicilio);
            ps.setString(5, fechaNac);
            ps.setString(6, telefono);
            ps.setInt(7, (int) idS);
            
            int rowsInsert2 = ps.executeUpdate();
            
            if(rowsInsert2 > 0){
              System.out.println("Datos Socio agregada Correctamente");
              JOptionPane.showMessageDialog(null, "Socio agregado correctamente");
            }
            }
        }catch (SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Erro en agregar sede");
        }finally{
            try{
                if(rs != null) rs.close();
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error Cerrar Conexion" + e);
            }
        }
    }
    
    //Metodo para rellenar la comboBox de Cuota con los datos de la base de datos
    public void RellenarComboCuota(JComboBox combo){
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
             System.out.println("Error combo" + e);
        }
    }
    
    //Metodo para rellenar la comboBox de Sede con los datos de la base de datos
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
        
    public ResultSet RellenarComboSociosCuota(){
        String consulta = "select idDatosPersonales, nombre, apellidoP, apellidoM from DatosPersonalesS";
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            st = con.createStatement();
            rs = st.executeQuery(consulta);
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
        return rs;
    }
    
    //Metodo para llenar la lista con los datos de DatosPeronalesS y socio
    public ResultSet llenarLista(){
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            st = con.createStatement();
            String consulta = "select idDatosPersonales, nombre, apellidoP, apellidoM from DatosPersonalesS";
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
    
    //Metodo para mostrar los datos del socio en la interfaz de DatosPersonales
    public ResultSet socioActualizar(int id){
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            st = con.createStatement();
            String consulta = "select * from DatosPersonalesS where idDatosPersonales = "+id;
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
    
   //Metodo para mostrar los datos del socio en la interfaz de Socio
    public ResultSet otroActualizar(int id){
        ResultSet rr = null;
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            st = con.createStatement();
            String antes = "select idSocio from DatosPersonalesS where idDatosPersonales ="+id;
             rr = st.executeQuery(antes);
             System.out.println("Bien1");
             int dd=0;
             while(rr.next()){
                 dd = rr.getInt("idSocio");
             }
             String consulta = "select * from socio where idSocio = "+dd;
             rs = st.executeQuery(consulta);
             System.out.println("Bien2");
        }catch(SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "ERROR EN SELECIONAR LISTA");
        }finally {
            try {
                if (rr != null) rr.close();
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
    
    //Metodo para cambiar el id de la sede por el nombre de la ciudad donde se encuentra
   public ResultSet LlamaSede(int id){
       try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            st = con.createStatement();
            String consulta = "select ciudad from sede where idSede = "+id;
            rs = st.executeQuery(consulta);
        }catch (SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecta");
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
            
            String consulta = "update DatosPersonalesS set nombre = ? where idDatosPersonales = ?";
            
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
            
            String consulta = "update DatosPersonalesS set apellidoP = ? where idDatosPersonales = ?";
            
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
            
            String consulta = "update DatosPersonalesS set apellidoM = ? where idDatosPersonales = ?";
            
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
            
            String consulta = "update DatosPersonalesS set domicilio = ? where idDatosPersonales = ?";
            
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
            
            String consulta = "update DatosPersonalesS set fechaNac = ? where idDatosPersonales = ?";
            
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
            
            String consulta = "update DatosPersonalesS set telefono = ? where idDatosPersonales = ?";
            
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
   
   public void actCuenBan(String cuenBan, int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            
            String consulta = "select idSocio from DatosPersonalesS where idDatosPersonales ="+id;
            
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            int idSocio = 0; 
            while(rs.next()){
               idSocio = rs.getInt(1);
            }
            
            
            String consulta2 = "update socio set cuentaBancaria = ? where idSocio = ?";
            
            if(!cuenBan.isEmpty()){
                ps = con.prepareStatement(consulta2);
                ps.setString(1, cuenBan);
                ps.setInt(2, idSocio);
                ps.executeUpdate();
                System.out.println("Actualizado Cuenta Bancaria");
            }     
       }catch(SQLException e){
           System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en Modificar Cuenta Ban");
       }finally{
            try{
                if(rs != null) rs.close();
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }
   }
   
   public void actFechaPag(String fechPag, int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            
            String consulta = "select idSocio from DatosPersonalesS where idDatosPersonales ="+id;
            
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            int idSocio = 0; 
            while(rs.next()){
               idSocio = rs.getInt(1);
            }
            
            String consulta2 = "update socio set fechaPago = ? where idSocio = ?";
            
            if(!fechPag.isEmpty()){
                ps = con.prepareStatement(consulta2);
                ps.setString(1, fechPag);
                ps.setInt(2, idSocio);
                ps.executeUpdate();
                System.out.println("Actualizado Fecha Pago");
            }     
       }catch(SQLException e){
           System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en Modificar Fecha Pago");
       }finally{
            try{
                if(rs != null) rs.close();
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }
   }
   
   public void actSede(String ciudad, int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            
            String consulta = "select idSocio from DatosPersonalesS where idDatosPersonales ="+id;
            
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            int idSocio = 0;
            while(rs.next()){
               idSocio = rs.getInt("idSocio");
            }
            
            
            String consulta2 = "select idSede from sede where ciudad ="+"'"+ciudad+"'";
            ps = con.prepareStatement(consulta2);
            rs = ps.executeQuery();
            int idsede = 0;
            while(rs.next()){
               idsede = rs.getInt("idSede"); 
            }
            System.out.println(idsede);

            String consulta3 = "update socio set idsede = ? where idSocio = ?";
            
            
            if(idsede != 0){
                ps = con.prepareStatement(consulta3);
                ps.setInt(1, idsede);
                ps.setInt(2, idSocio);
                ps.executeUpdate();
                System.out.println("Sede actualizada");
            }     
       }catch(SQLException e){
           System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en Modificar sede");
       }finally{
            try{
                if(rs != null) rs.close();
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }
   }
   
   public void actTipoC(String tcuota, int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            System.out.println(tcuota);
            
            String consulta = "select idSocio from DatosPersonalesS where idDatosPersonales ="+id;
            
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            int idSocio = 0; 
            while(rs.next()){
               idSocio = rs.getInt(1);
            }
            
            String consulta2 = "update socio set idTipoCuota = ? where idSocio = ?";
            
            if(!tcuota.isEmpty()){
                ps = con.prepareStatement(consulta2);
                ps.setString(1, tcuota);
                ps.setInt(2, idSocio);
                ps.executeUpdate();
                System.out.println("Actualizado Tipo Cuota");
            }     
       }catch(SQLException e){
           System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en Modificar Tipo Cuota");
       }finally{
            try{
                if(rs != null) rs.close();
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }
   }

   //Metodo para elimianr un registro
   public void eliminarSocio(int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
           con = DriverManager.getConnection(url, this.userName, this.password);
           System.out.println("Conexion Exitosa ");
           st = con.createStatement();
           
           String consulta = "select idSocio from DatosPersonalesS where idDatosPersonales ="+id;
           rs = st.executeQuery(consulta);
           int idS = 0;
           while(rs.next()){
               idS = rs.getInt("idSocio");
           }
           
           String consulta2 = "delete from DatosPersonalesS where idDatosPersonales ="+id;
           
           int fill = st.executeUpdate(consulta2);
           if(fill > 0){
               System.out.println("Eliminacion  Datos Completa");
               JOptionPane.showMessageDialog(null, "Se elimino el registro correctamente");
           }
           
           String consulta3 = "delete from socio where idSocio ="+idS;
           int fill2 = st.executeUpdate(consulta3);
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
   
   public void pagarCuota(int id, String cuota){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            st = con.createStatement();
        String consulta = "select idSocio from DatosPersonalesS where idDatosPersonales ="+id;
        rs = st.executeQuery(consulta);
        int idsocio = 0;
            while(rs.next()){
                idsocio = rs.getInt("idSocio");
            }
        
        String consulta2 = "select montoActual from TipodeCuota where idTipocuota ="+"'"+cuota+"'";
        rs = st.executeQuery(consulta2);
        int pago = 0;
            while(rs.next()){
                pago = rs.getInt("montoActual");
            }
            
          LocalDate fechaHoy = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String fecha = fechaHoy.format(formatter);
        String consulta3 = "Insert into cuota(fechaPago, pago, idSocio) values(?,?,?)";
        ps = con.prepareStatement(consulta3);
            
            ps.setString(1, fecha);
            ps.setInt(2, pago);
            ps.setInt(3, idsocio);
            int rowsInsert2 = ps.executeUpdate();
        if(rowsInsert2 > 0){
              System.out.println("Datos Cuota agregada Correctamente");
              JOptionPane.showMessageDialog(null, "Cuota agregado correctamente");
            }
        
        }catch (SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en agregar Cuota");
        }finally{
            try{
                if(rs != null) rs.close();
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error Cerrar Conexion" + e);
            }
        }
   }
   
}

