/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Control.ControlSocio;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ruben
 */
public class SociosT extends javax.swing.JInternalFrame {

    /**
     * Creates new form SociosT
     */
    public SociosT() {
        initComponents();
        LlenarTabla();
    }

    public void LlenarTabla(){
        String consulta = "select t1.*,t2.*  from socio t1 left join DatosPersonalesS t2 on t1.idSocio = t2.idSocio";
        Statement st;
        ControlSocio cs = new ControlSocio();
        Connection con = cs.conexion();
        DefaultTableModel tmodel = new DefaultTableModel();
        tmodel.addColumn("Nombre");
        tmodel.addColumn("Apellido Paterno");
        tmodel.addColumn("Apellido Materno");
        tmodel.addColumn("Domicilio");
        tmodel.addColumn("Fecha Nacimiento");
        tmodel.addColumn("Telefono");
        tmodel.addColumn("Sede");
        tmodel.addColumn("Cuenta Bancaria");
        tmodel.addColumn("Fecha Pago");
        tmodel.addColumn("Tipo Cuota");
        TablaSocios.setModel(tmodel);
        
        String [] datos = new String[10];
        try{
            st = con.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while(rs.next()){
                datos[0] = rs.getString("nombre");
                datos[1] = rs.getString("apellidoP");
                datos[2] = rs.getString("apellidoM");
                datos[3] = rs.getString("domicilio");
                datos[4] = rs.getString("fechaNac");
                datos[5] = rs.getString("telefono");
                String consultan = "select ciudad from sede where idSede ="+rs.getInt(4);
                ResultSet rr = st.executeQuery(consultan);
                while(rr.next()){
                    datos[6] = rr.getString(1);
                }
                datos[7] = rs.getString("cuentaBancaria");
                datos[8] = rs.getString("fechaPago");
                datos[9] = rs.getString("idTipoCuota");    
                tmodel.addRow(datos);
            }
            TablaSocios.setModel(tmodel);
        }catch(SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en la tabla");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaSocios = new javax.swing.JTable();

        TablaSocios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaSocios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaSocios;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
