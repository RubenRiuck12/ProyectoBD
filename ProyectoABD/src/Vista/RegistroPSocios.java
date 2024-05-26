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
public class RegistroPSocios extends javax.swing.JPanel {

    /**
     * Creates new form RegistroPSocios
     */
    public RegistroPSocios() {
        initComponents();
        rellenarCombo();
    }

    ControlSocio cs = new ControlSocio();
    HashMap<String, Integer> mapa = new HashMap<>();
    
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ComboSocio = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        LabelPago = new javax.swing.JLabel();
        ButtonPagar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPagos = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Pago de Socios");

        jLabel2.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel2.setText("Lista de Pagos:");

        ComboSocio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Socios" }));
        ComboSocio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboSocioItemStateChanged(evt);
            }
        });
        ComboSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboSocioActionPerformed(evt);
            }
        });

        jLabel3.setText("Socio");

        LabelPago.setText("Pago");

        ButtonPagar.setText("Pagar");
        ButtonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPagarActionPerformed(evt);
            }
        });

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
        jScrollPane2.setViewportView(TablaPagos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(ComboSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ButtonPagar)
                            .addComponent(LabelPago)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(LabelPago)
                        .addGap(12, 12, 12)
                        .addComponent(ButtonPagar)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ComboSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboSocioActionPerformed
        String nombre = (String )ComboSocio.getSelectedItem();
        int id = 0;
        if(mapa.containsKey(nombre)){
                id = mapa.get(nombre);
                System.out.println(id);
            }
        LlenarTabla(id);
    }//GEN-LAST:event_ComboSocioActionPerformed

    private void ComboSocioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboSocioItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboSocioItemStateChanged

    private void ButtonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPagarActionPerformed
        String nombre = (String )ComboSocio.getSelectedItem();
        int id = 0;
        if(mapa.containsKey(nombre)){
                id = mapa.get(nombre);
                System.out.println(id);
            }
        cs.pagarCuota(id, LabelPago.getText());
    }//GEN-LAST:event_ButtonPagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonPagar;
    private javax.swing.JComboBox<String> ComboSocio;
    private javax.swing.JLabel LabelPago;
    private javax.swing.JTable TablaPagos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
