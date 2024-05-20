/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Control.ControlSocio;
import Modelo.ModeloSocio;
/**
 *
 * @author Ruben
 */
public class ResgistrarS extends javax.swing.JInternalFrame {

    /**
     * Creates new form ResgistrarS
     */
    public ResgistrarS() {
        initComponents();
        this.setSize(760,520);
        this.setTitle("Registrar");
        cs.RellenarComboCuota(ComoboCuota);
        cs.RellenarComboSede(ComboSede);
    }
    
    ControlSocio cs = new ControlSocio();
    ModeloSocio ms = new ModeloSocio();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField9 = new javax.swing.JTextField();
        PanelEs = new javax.swing.JPanel();
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
        PanelButons = new javax.swing.JPanel();
        BtnGuardar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();

        jTextField9.setText("jTextField9");

        jLabel1.setText("Nombre(s)");

        jLabel2.setText("Apellido Paterno");

        jLabel3.setText("Apellido Materno");

        jLabel4.setText("Domicilio");

        jLabel5.setText("Fehca de Nacimiento");

        jLabel6.setText("Telefono");

        jLabel7.setText("Cuenta Bancaria");

        jLabel8.setText("Fecha de Pago");

        jLabel9.setText("Sede");

        jLabel10.setText("Tipo de Cuota");

        FormatFechaN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        FormatFechaN.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        FormatFechaN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormatFechaNActionPerformed(evt);
            }
        });

        FormatFechaP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        javax.swing.GroupLayout PanelEsLayout = new javax.swing.GroupLayout(PanelEs);
        PanelEs.setLayout(PanelEsLayout);
        PanelEsLayout.setHorizontalGroup(
            PanelEsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(33, 33, 33)
                .addGroup(PanelEsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComoboCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextNombre)
                    .addComponent(TextApellidoP)
                    .addComponent(TextApellidoM)
                    .addComponent(TextDomicilio)
                    .addComponent(TextTelefono)
                    .addComponent(TextCuentaB)
                    .addComponent(FormatFechaN)
                    .addComponent(FormatFechaP, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        PanelEsLayout.setVerticalGroup(
            PanelEsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelEsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelEsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelEsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelEsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(FormatFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelEsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelEsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TextCuentaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelEsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(FormatFechaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelEsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ComboSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelEsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ComoboCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnLimpiar.setText("Limpiar");

        javax.swing.GroupLayout PanelButonsLayout = new javax.swing.GroupLayout(PanelButons);
        PanelButons.setLayout(PanelButonsLayout);
        PanelButonsLayout.setHorizontalGroup(
            PanelButonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelButonsLayout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(PanelButonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnGuardar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        PanelButonsLayout.setVerticalGroup(
            PanelButonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelButonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnGuardar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelEs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(PanelButons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelEs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelButons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FormatFechaNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormatFechaNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormatFechaNActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        ms.setNombre(TextNombre.getText());
        ms.setApellidoP(TextApellidoP.getText());
        ms.setApellidoM(TextApellidoM.getText());
        ms.setDomicilio(TextDomicilio.getText());
        ms.setFechaNac(FormatFechaN.getText());
        ms.setTelefono(TextTelefono.getText());
        ms.setCuentaBnacaria(TextCuentaB.getText());
        ms.setFechPago(FormatFechaP.getText());
        ms.setIdSede((String) ComboSede.getSelectedItem());
        String consultan = "select idSede from sede where ciudad ="+"'"+ms.getIdSede()+"'";
        int id = cs.llamarId(consultan);
        ms.setTipoCuota((String) ComoboCuota.getSelectedItem());
        cs.subirSocio(ms.getNombre(), ms.getApellidoP(), ms.getApellidoM(), ms.getDomicilio(), ms.getFechaNac(), ms.getTelefono(), ms.getCuentaBnacaria(), ms.getFechPago(), id, ms.getTipoCuota());
    }//GEN-LAST:event_BtnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JComboBox<String> ComboSede;
    private javax.swing.JComboBox<String> ComoboCuota;
    private javax.swing.JFormattedTextField FormatFechaN;
    private javax.swing.JFormattedTextField FormatFechaP;
    private javax.swing.JPanel PanelButons;
    private javax.swing.JPanel PanelEs;
    private javax.swing.JTextField TextApellidoM;
    private javax.swing.JTextField TextApellidoP;
    private javax.swing.JTextField TextCuentaB;
    private javax.swing.JTextField TextDomicilio;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
