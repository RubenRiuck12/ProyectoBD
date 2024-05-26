/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Control.ControlVoluntario;
import Control.TextPrompt;
import Modelo.ModeloVoluntario;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class RegistrarVoluntarios extends javax.swing.JPanel {

    /**
     * Creates new form RegistrarSede
     */
    public RegistrarVoluntarios() {
        initComponents();
        cv.RellenarComboSede(ComboSede);
        cv.RellenarComboTV(ComboTV);
        cv.RellenarComboProf(ComboProfesion);
        ComboProfesion.setEnabled(false);
        CheckDis.setEnabled(false);
        TextPrompt tp = new TextPrompt("YY/MM/DD", TextFechN);
    }
    ControlVoluntario cv = new ControlVoluntario();
    ModeloVoluntario mv = new ModeloVoluntario();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ButtonRegist = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TextNombre = new javax.swing.JTextField();
        TextApeP = new javax.swing.JTextField();
        TextApeM = new javax.swing.JTextField();
        TextDom = new javax.swing.JTextField();
        TextTel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ComboSede = new javax.swing.JComboBox<>();
        ComboTV = new javax.swing.JComboBox<>();
        ComboProfesion = new javax.swing.JComboBox<>();
        TextFechN = new javax.swing.JFormattedTextField();
        CheckDis = new javax.swing.JCheckBox();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Voluntarios");

        jLabel2.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel3.setText("Apellido Paterno:");

        ButtonRegist.setBackground(new java.awt.Color(0, 51, 102));
        ButtonRegist.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonRegist.setForeground(new java.awt.Color(255, 255, 255));
        ButtonRegist.setText("Registrar");
        ButtonRegist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel4.setText("Apellido Materno:");

        jLabel5.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel5.setText("Domicilio:");

        jLabel6.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel6.setText("Fecha de nacimiento:");

        jLabel7.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel7.setText("Telefono:");

        TextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNombreActionPerformed(evt);
            }
        });

        TextApeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextApePActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel8.setText("Sede:");

        jLabel9.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel9.setText("Tipo de voluntariado:");

        jLabel10.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel10.setText("Profesion:");

        ComboSede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sede" }));

        ComboTV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo" }));
        ComboTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTVActionPerformed(evt);
            }
        });

        ComboProfesion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Profesion" }));

        TextFechN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yy/MM/dd"))));

        CheckDis.setText("Disponible");
        CheckDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckDisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextApeP)
                                    .addComponent(TextApeM, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(TextNombre)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(68, 68, 68)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextDom)
                                    .addComponent(TextTel, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                    .addComponent(TextFechN))))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboTV, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboSede, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CheckDis)
                                    .addComponent(ComboProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(ButtonRegist, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(ComboSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextApeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(ComboTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextApeM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(ComboProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TextDom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TextFechN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckDis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TextTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(ButtonRegist)
                .addGap(78, 78, 78))
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

    private void ButtonRegistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistActionPerformed
        if(TextNombre.getText().isEmpty()|TextApeP.getText().isEmpty()|TextApeM.getText().isEmpty()|TextDom.getText().isEmpty()|TextFechN.getText().isEmpty()|TextTel.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Favor de llenar todos los campos");
        }else{
            mv.setNombre(TextNombre.getText());
            mv.setApellidoP(TextApeP.getText());
            mv.setApellidoM(TextApeM.getText());
            mv.setDomicilio(TextDom.getText());
            mv.setFechaNac(TextFechN.getText());
            mv.setTelefono(TextTel.getText());
            String ciudad = (String) ComboSede.getSelectedItem();
            if("Sede".equals(ciudad)){
               JOptionPane.showMessageDialog(null, "Favor de elegirr una sede"); 
            }else{
            mv.setIdSede(cv.passCiudadID(ciudad));
            String tipo = (String) ComboTV.getSelectedItem();
            if("Tipo".equals(tipo)){
                JOptionPane.showMessageDialog(null, "Favor de elegirr un Tipo de Voluntario"); 
            }else{
            mv.setIdTipoVoluntario(cv.passTVID(tipo));
            if("HUMANITARIA".equals(tipo)){
                String profesion1 = (String) ComboProfesion.getSelectedItem();
                if("Profesion".equals(profesion1)){
                    JOptionPane.showMessageDialog(null, "Favor de elegir una Profesion"); 
                }else{
                    mv.setIdProfesion(cv.passProf(profesion1));
                    mv.setDiponibilidad(CheckDis.isSelected());
                    mv.setParticipaciones(0);
                    cv.subirVoluntarioHum(mv.getNombre().toUpperCase(), mv.getApellidoP().toUpperCase(), mv.getApellidoM().toUpperCase(), mv.getDomicilio().toUpperCase(), mv.getFechaNac(), mv.getTelefono(), mv.getIdSede(), mv.getIdTipoVoluntario(), mv.getIdProfesion(), mv.isDiponibilidad(), mv.getParticipaciones());
                    TextNombre.setText("");
                    TextApeP.setText("");
                    TextApeM.setText("");
                    TextDom.setText("");
                    TextFechN.setText("");
                    TextTel.setText("");
                    cv.RellenarComboSede(ComboSede);
                    cv.RellenarComboTV(ComboTV);
                    cv.RellenarComboProf(ComboProfesion); 
                }
            }else{
                cv.subirVoluntario(mv.getNombre().toUpperCase(), mv.getApellidoP().toUpperCase(), mv.getApellidoM().toUpperCase(), mv.getDomicilio().toUpperCase(), mv.getFechaNac(), mv.getTelefono(), mv.getIdSede(), mv.getIdTipoVoluntario());
                    TextNombre.setText("");
                    TextApeP.setText("");
                    TextApeM.setText("");
                    TextDom.setText("");
                    TextFechN.setText("");
                    TextTel.setText("");
                    cv.RellenarComboSede(ComboSede);
                    cv.RellenarComboTV(ComboTV);
                    cv.RellenarComboProf(ComboProfesion);
            }     
            }
            }
        }
    }//GEN-LAST:event_ButtonRegistActionPerformed

    private void TextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNombreActionPerformed

    private void TextApePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextApePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextApePActionPerformed

    private void ComboTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTVActionPerformed
        if("HUMANITARIA".equals(ComboTV.getSelectedItem())){
            ComboProfesion.setEnabled(true);
            CheckDis.setEnabled(true);
        }else{
            ComboProfesion.setEnabled(false);
            CheckDis.setEnabled(false);
        }
    }//GEN-LAST:event_ComboTVActionPerformed

    private void CheckDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckDisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckDisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonRegist;
    private javax.swing.JCheckBox CheckDis;
    private javax.swing.JComboBox<String> ComboProfesion;
    private javax.swing.JComboBox<String> ComboSede;
    private javax.swing.JComboBox<String> ComboTV;
    private javax.swing.JTextField TextApeM;
    private javax.swing.JTextField TextApeP;
    private javax.swing.JTextField TextDom;
    private javax.swing.JFormattedTextField TextFechN;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextTel;
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
