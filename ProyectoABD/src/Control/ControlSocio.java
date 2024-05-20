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
        }
    }
    
    //Metodo para llenar la lista con los datos de DatosPeronalesS y socio
    public ResultSet llenarLista(){
        try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            st = con.createStatement();
            String consulta = "select idDatosPersonales, nombre from DatosPersonalesS";
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
    
   //Metodo para mostrar los datos del socio en la interrfaz de Socio
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
    
    
   public ResultSet camb(int id){
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
    
        //Metodo para actualizar los datos de Socio
   public void actSocio(String nombre, String apeP, String apeM, String domicilio, String fechaNac, String telefono, String cuenB, String fechaPag, int idSede, String tc, int idD){
      try{
            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            con = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa ");
            int id = rs.getInt(1);
            
            
            String consulta = "update DatosPersonalesS set nombre = ? where idDatosPersonales = ?";
            String consulta2 = "update DatosPersonalesS set apellidoP = ? where idDatosPersonales = ?";
            String consulta3 = "update DatosPersonalesS set apellidoM = ? where idDatosPersonales = ?";
            String consulta4 = "update DatosPersonalesS set domicilio = ? where idDatosPersonales = ?";
            String consulta5 = "update DatosPersonalesS set fechaNac = ? where idDatosPersonales = ?";
            String consulta6 = "update DatosPersonalesS set telefono = ? where idDatosPersonales = ?";
            String consulta7 = "update socio set cuentaBancaria = ? where idSocio = ?";
            String consulta8 = "update socio set fechaPago = ? where idSocio = ?";
            String consulta9 = "update socio set idSede = ? where idSocio = ?";
            String consulta10 = "update socio set idTipoCuota = ? where idSocio = ?";
            
            String consulta11 = "select idSocio from DatosPersonalesS where idDatosPeronales ="+idD;
            
            if(!nombre.isEmpty()){
                ps = con.prepareStatement(consulta);
                ps.setString(1, nombre);
                ps.setInt(2, id);
                System.out.println("Actualizado nombre");
                ps.executeUpdate();
            }          
            if(!apeP.isEmpty()){
                ps = con.prepareStatement(consulta2);
                ps.setString(1, apeP);
                ps.setInt(2, id);
                System.out.println("Actualizado Apellido Paterno");
                ps.executeUpdate();
            }
            if(!apeM.isEmpty()){
                ps = con.prepareStatement(consulta3);
                ps.setString(1, apeM);
                ps.setInt(2, id);
                System.out.println("Actualizado Apellido Materno");
                ps.executeUpdate();
            }
            if(!domicilio.isEmpty()){
                ps = con.prepareStatement(consulta4);
                ps.setString(1, apeM);
                ps.setInt(2, id);
                System.out.println("Actualizado Apellido Materno");
                ps.executeUpdate();
            }
            if(!fechaNac.isEmpty()){
                ps = con.prepareStatement(consulta5);
                ps.setString(1, fechaNac);
                ps.setInt(2, id);
                System.out.println("Actualizado Fecha Nacimiento");
                ps.executeUpdate();
            }
            if(!telefono.isEmpty()){
                ps = con.prepareStatement(consulta6);
                ps.setString(1, telefono);
                ps.setInt(2, id);
                System.out.println("Actualizado Telefono");
                ps.executeUpdate();
            }
            
            ps = con.prepareStatement(consulta11);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            int idSocio = rs.getInt(1);
            
            if(!cuenB.isEmpty()){
                ps = con.prepareStatement(consulta7);
                ps.setString(1, cuenB);
                ps.setInt(2, idSocio);
                System.out.println("Actualizado Cuenta Bancaria");
                ps.executeUpdate();
            }
            if(!fechaPag.isEmpty()){
                ps = con.prepareStatement(consulta8);
                ps.setString(1, fechaPag);
                ps.setInt(2, idSocio);
                System.out.println("Actualizado Fecha de Pago");
                ps.executeUpdate();
            }
            if(idSede != 0){
                ps = con.prepareStatement(consulta9);
                ps.setInt(1, idSede);
                ps.setInt(2, idSocio);
                System.out.println("Actualizado Sede");
                ps.executeUpdate();
            }
            if(!tc.isEmpty()){
                ps = con.prepareStatement(consulta10);
                ps.setString(1, tc);
                ps.setInt(2, idSocio);
                System.out.println("Actualizado Tipo de Cuota");
                ps.executeUpdate();
            }
          
//            if(director.isEmpty() && domicilio.isEmpty()){
//                JOptionPane.showMessageDialog(null, "Ningun cambio generado");
//            }
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
   
//    public void actOtros(int idSede, String tc, int idSocio){
//      try{
//            String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
//            con = DriverManager.getConnection(url, this.userName, this.password);
//            System.out.println("Conexion Exitosa ");
//            String consulta = "update socio set idSede = ? where socio = ?";
//            String consulta2 = "update socio set idTipoCuota = ? where socio = ?";
//            if(idSede != 0){
//                ps = con.prepareStatement(consulta);
//                ps.setInt(1, idSede);
//                ps.setInt(2, idSocio);
//                System.out.println("Actualizado Sede");
//                ps.executeUpdate();
//            }          
//            if(!tc.isEmpty()){
//                ps = con.prepareStatement(consulta2);
//                ps.setString(1, tc);
//                ps.setInt(2, idSocio);
//                System.out.println("Actualizado Tipo de Cuota");
//                ps.executeUpdate();
//            }
////            int rowsInsert = 
////            
////            if(rowsInsert > 0){
////                System.out.println("Nuevo agregado");
////                JOptionPane.showMessageDialog(null, "Sede actualizada");
////            }
//        }catch (SQLException e){
//            System.out.println("Error" + e);
//            JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACION DE DATOS");
//        }finally{
//            try{
//                if(ps != null) ps.close();
//                if(con != null) con.close();
//            }catch(SQLException e){
//                System.out.println("Error" + e);
//            }
//        }  
//    }
   //Metodo para elimianr un registro
   public void eliminarSocio(String nombre, String apeP, String apeM, int id){
       try{
           String url = "jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
           con = DriverManager.getConnection(url, this.userName, this.password);
           System.out.println("Conexion Exitosa ");
           String consulta = "delete from DatosPersonalesS where idDatosPersonales ="+id;
           int fill = st.executeUpdate(consulta);
           if(fill > 0){
               System.out.println("Eliminacion Completa");
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

