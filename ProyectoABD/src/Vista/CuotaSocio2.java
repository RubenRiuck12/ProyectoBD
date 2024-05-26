/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Control.ControlSocio;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aleja
 */
public class CuotaSocio2 extends javax.swing.JPanel {

    /**
     * Creates new form RegistrarS2
     */
    public CuotaSocio2() {
        initComponents();
        rellenarCombo();
        LlenarTablahora();
    }

    //Clases y variables que necesitemos
    ControlSocio cs = new ControlSocio();
    HashMap<String, Integer> mapa = new HashMap<>();
    
    //Metodo para llenar la tabla de las cuotas del usuario cuando se haga un pago
    public void LlenarTabla(int id){      
        String consulta = "select idSocio from DatosPersonalesS where idDatosPersonales ="+id;
        Statement st;
        ControlSocio cs = new ControlSocio();
        Connection con = cs.conexion();
        int idsocio = 0;
        try{
            st = con.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while(rs.next()){
                idsocio = rs.getInt("idSocio");
            }
        }catch(SQLException e){
            System.out.println("Error " + e);
            JOptionPane.showMessageDialog(null, "Error en la idDatos");
        }
        
        String consulta2 = "select * from cuota where idSocio ="+idsocio;
        
        DefaultTableModel tmodel = new DefaultTableModel();
        tmodel.addColumn("Fecha");
        tmodel.addColumn("Pago");
        TablaPagos.setModel(tmodel);
        
        String [] datos = new String[3];
        try{
            st = con.createStatement();
            ResultSet rs = st.executeQuery(consulta2);
            while(rs.next()){
                datos[0] = rs.getString("fechaPago");
                datos[1] = rs.getString("pago");   
                tmodel.addRow(datos);
            }
            TablaPagos.setModel(tmodel);
            
        String consulta3 = "select idTipoCuota from socio where idSocio ="+idsocio;
        rs = st.executeQuery(consulta3);
            while(rs.next()){
                LabelPago.setText(rs.getString("idTipoCuota"));
            }
        }catch(SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en la tabla");
        }finally{
            try{
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error Cerrar Conexion" + e);
            }
        }
    }
    
    //Metodo para llenar la tabla cuotas 
    public void LlenarTablahora(){                                      
        String nombre = (String )ComboSocio.getSelectedItem();
        int id = 0;
        if(mapa.containsKey(nombre)){
                id = mapa.get(nombre);
                System.out.println(id);
            }
        
        String consulta = "select idSocio from DatosPersonalesS where idDatosPersonales ="+id;
        Statement st;
        ControlSocio cs = new ControlSocio();
        Connection con = cs.conexion();
        int idsocio = 0;
        try{
            st = con.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while(rs.next()){
                idsocio = rs.getInt("idSocio");
            }
        }catch(SQLException e){
            System.out.println("Error " + e);
            JOptionPane.showMessageDialog(null, "Error en la idDatos");
        }
        
        String consulta2 = "select * from cuota where idSocio ="+idsocio;
        
        DefaultTableModel tmodel = new DefaultTableModel();
        tmodel.addColumn("Fecha");
        tmodel.addColumn("Pago");
        TablaPagos.setModel(tmodel);
        
        String [] datos = new String[3];
        try{
            st = con.createStatement();
            ResultSet rs = st.executeQuery(consulta2);
            while(rs.next()){
                datos[0] = rs.getString("fechaPago");
                datos[1] = rs.getString("pago");   
                tmodel.addRow(datos);
            }
            TablaPagos.setModel(tmodel);
            
        String consulta3 = "select idTipoCuota from socio where idSocio ="+idsocio;
        rs = st.executeQuery(consulta3);
            while(rs.next()){
                LabelPago.setText(rs.getString("idTipoCuota"));
            }
        }catch(SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en la tabla");
        }finally{
            try{
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println("Error Cerrar Conexion" + e);
            }
        }
    }
    //Metodo para rellenar la combox de los socios
    public void rellenarCombo(){
        ResultSet rs = cs.RellenarComboSociosCuota();
        try{
            while(rs.next()){
                ComboSocio.addItem(rs.getString("nombre")+" "+ rs.getString("apellidoP")+" "+rs.getString("apellidoM"));
                String ultdata = rs.getString("nombre")+" "+ rs.getString("apellidoP")+" "+rs.getString("apellidoM");
                int data = rs.getInt("idDatosPersonales");
                mapa.put(ultdata, data);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la rellenar combo");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ComboSocio = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        PagoSocio = new javax.swing.JLabel();
        ButtonPagar = new javax.swing.JButton();
        LabelPago = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPagos = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel11.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cuota de Socios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel11)
                .addContainerGap(242, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 40));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        ComboSocio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Socios" }));
        ComboSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboSocioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel2.setText("Pago tipo:");

        PagoSocio.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        PagoSocio.setText("Socio:");

        ButtonPagar.setBackground(new java.awt.Color(0, 51, 102));
        ButtonPagar.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonPagar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonPagar.setText("Pagar");
        ButtonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPagarActionPerformed(evt);
            }
        });

        LabelPago.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        LabelPago.setText("?");

        TablaPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(TablaPagos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(PagoSocio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ButtonPagar)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(LabelPago)))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PagoSocio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(LabelPago))
                        .addGap(35, 35, 35)
                        .addComponent(ButtonPagar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 600, 400));
    }// </editor-fold>//GEN-END:initComponents

    //Evento para cuando se elije un socio
    private void ComboSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboSocioActionPerformed
        String nombre = (String )ComboSocio.getSelectedItem();
        int id = 0;
        if(mapa.containsKey(nombre)){
                id = mapa.get(nombre);
                System.out.println(id);
            }
        LlenarTabla(id);
    }//GEN-LAST:event_ComboSocioActionPerformed

    //Button para pagar una cuota
    private void ButtonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPagarActionPerformed
        String nombre = (String )ComboSocio.getSelectedItem();
        if(!"Socio".equals(nombre)){
            int id = 0;
        if(mapa.containsKey(nombre)){
                id = mapa.get(nombre);
                System.out.println(id);
            }
        cs.pagarCuota(id, LabelPago.getText());
        }else{
            JOptionPane.showMessageDialog(null, "Favor de Elegir un socio");
        }
    }//GEN-LAST:event_ButtonPagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonPagar;
    private javax.swing.JComboBox<String> ComboSocio;
    private javax.swing.JLabel LabelPago;
    private javax.swing.JLabel PagoSocio;
    private javax.swing.JTable TablaPagos;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
