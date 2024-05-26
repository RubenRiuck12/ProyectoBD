/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Control.ControlSocio;
import Modelo.ModeloSocio;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class RegistrarSocios extends javax.swing.JPanel {

    /**
     * Creates new form RegistrarS2
     */
    public RegistrarSocios() {
        initComponents();
        cs.RellenarComboCuota(ComoboCuota);
        cs.RellenarComboSede(ComboSede);
    }
   
    ControlSocio cs = new ControlSocio();
    ModeloSocio ms = new ModeloSocio();
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        PanelT = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TextNombre = new javax.swing.JTextField();
        TextApellidoP = new javax.swing.JTextField();
        TextApellidoM = new javax.swing.JTextField();
        TextDomicilio = new javax.swing.JTextField();
        TextTelefono = new javax.swing.JTextField();
        TextCuentaB = new javax.swing.JTextField();
        ComboSede = new javax.swing.JComboBox<>();
        ComoboCuota = new javax.swing.JComboBox<>();
        FormatFechaN = new javax.swing.JFormattedTextField();
        FormatFechaP = new javax.swing.JFormattedTextField();
        BtnGuardar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel11.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Registrar Socios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel11)
                .addContainerGap(238, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 40));

        PanelT.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel1.setText("Nombre(s):");

        jLabel2.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel2.setText("Apellido Paterno:");

        jLabel3.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel3.setText("Apellido Materno:");

        jLabel4.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel4.setText("Domicilio:");

        jLabel5.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel5.setText("Fehca de Nacimiento:");

        jLabel6.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel6.setText("Telefono:");

        jLabel7.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel7.setText("Cuenta Bancaria:");

        jLabel8.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel8.setText("Fecha de Pago:");

        jLabel9.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel9.setText("Sede:");

        jLabel10.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel10.setText("Tipo de Cuota");

        ComboSede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sede" }));

        ComoboCuota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuota" }));

        FormatFechaN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        FormatFechaN.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        FormatFechaN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormatFechaNActionPerformed(evt);
            }
        });

        FormatFechaP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        BtnGuardar.setBackground(new java.awt.Color(0, 51, 102));
        BtnGuardar.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        BtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelTLayout = new javax.swing.GroupLayout(PanelT);
        PanelT.setLayout(PanelTLayout);
        PanelTLayout.setHorizontalGroup(
            PanelTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PanelTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addGroup(PanelTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel9)
                        .addComponent(jLabel7)))
                .addGap(33, 33, 33)
                .addGroup(PanelTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelTLayout.createSequentialGroup()
                        .addComponent(ComboSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComoboCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TextNombre)
                    .addComponent(TextApellidoP)
                    .addComponent(TextApellidoM)
                    .addComponent(TextDomicilio)
                    .addComponent(TextTelefono)
                    .addComponent(TextCuentaB)
                    .addComponent(FormatFechaN)
                    .addComponent(FormatFechaP, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                        .addComponent(BtnGuardar)
                        .addGap(21, 21, 21))
                    .addGroup(PanelTLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PanelTLayout.setVerticalGroup(
            PanelTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTLayout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(BtnGuardar)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(FormatFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TextCuentaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(FormatFechaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ComboSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComoboCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(38, 38, 38))
        );

        add(PanelT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 600, 400));
    }// </editor-fold>//GEN-END:initComponents

    private void FormatFechaNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormatFechaNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormatFechaNActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        if(TextNombre.getText().isEmpty()|TextApellidoP.getText().isEmpty()|TextApellidoM.getText().isEmpty()|TextDomicilio.getText().isEmpty()|FormatFechaN.getText().isEmpty()|TextTelefono.getText().isEmpty()|TextCuentaB.getText().isEmpty()|FormatFechaP.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Favor de llenar todos los campos");
        }else{
        ms.setNombre(TextNombre.getText());
        ms.setApellidoP(TextApellidoP.getText());
        ms.setApellidoM(TextApellidoM.getText());
        ms.setDomicilio(TextDomicilio.getText());
        ms.setFechaNac(FormatFechaN.getText());
        ms.setTelefono(TextTelefono.getText());
        ms.setCuentaBnacaria(TextCuentaB.getText());
        ms.setFechPago(FormatFechaP.getText());
        ms.setIdSede((String) ComboSede.getSelectedItem());
        if("Sede".equals(ms.getIdSede())){
            JOptionPane.showMessageDialog(null, "Favor de Elegir una sede");
        }else{
        String consultan = "select idSede from sede where ciudad ="+"'"+ms.getIdSede()+"'";
        int id = cs.llamarId(consultan);
        ms.setTipoCuota((String) ComoboCuota.getSelectedItem());
        if("Cuota".equals(ms.getTipoCuota())){
            JOptionPane.showMessageDialog(null, "Favor de Elegir una cuota");
        }else{
          cs.subirSocio(ms.getNombre().toUpperCase(), ms.getApellidoP().toUpperCase(), ms.getApellidoM().toUpperCase(), ms.getDomicilio().toUpperCase(), ms.getFechaNac(), ms.getTelefono(), ms.getCuentaBnacaria(), ms.getFechPago(), id, ms.getTipoCuota());
//        TextNombre.setText("");
//        TextApellidoP.setText("");
//        TextApellidoM.setText("");
//        TextDomicilio.setText("");
//        FormatFechaN.setText("");
//        TextTelefono.setText("");
//        TextCuentaB.setText("");
//        FormatFechaP.setText("");
        PanelT.revalidate();
        PanelT.repaint();
        }
        }
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JComboBox<String> ComboSede;
    private javax.swing.JComboBox<String> ComoboCuota;
    private javax.swing.JFormattedTextField FormatFechaN;
    private javax.swing.JFormattedTextField FormatFechaP;
    private javax.swing.JPanel PanelT;
    private javax.swing.JTextField TextApellidoM;
    private javax.swing.JTextField TextApellidoP;
    private javax.swing.JTextField TextCuentaB;
    private javax.swing.JTextField TextDomicilio;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
