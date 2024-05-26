/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Control.ControlVoluntario;
import java.util.HashMap;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class ActualizarVoluntarios extends javax.swing.JPanel {

    HashMap<String, Integer> mapa = new HashMap<>();
 
    public ActualizarVoluntarios() {
        initComponents();
        cv.RellenarComboProf(ComboProf);
        cv.RellenarComboSede(ComboSede);
        cv.RellenarComboTV(ComboVol);
        mapa = cv.rellenarListaVolu(ListVoluntarios);
    }

    ControlVoluntario cv = new ControlVoluntario();
    int id = 0;
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        ButtonAct10 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LabelTVol = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListVoluntarios = new javax.swing.JList<>();
        ComboVol = new javax.swing.JComboBox<>();
        LabelApeM = new javax.swing.JLabel();
        TextApeM = new javax.swing.JTextField();
        LabelNombre = new javax.swing.JLabel();
        TextNombre = new javax.swing.JTextField();
        LabelSede = new javax.swing.JLabel();
        TextApeP = new javax.swing.JTextField();
        ButtonDel = new javax.swing.JButton();
        LabelProf = new javax.swing.JLabel();
        ComboProf = new javax.swing.JComboBox<>();
        ComboSede = new javax.swing.JComboBox<>();
        LabelApeP = new javax.swing.JLabel();
        TextDoc = new javax.swing.JTextField();
        LabelDoc = new javax.swing.JLabel();
        LabelFechNac = new javax.swing.JLabel();
        TextTel = new javax.swing.JTextField();
        LabelTel = new javax.swing.JLabel();
        CheckDis = new javax.swing.JCheckBox();
        TextFechNac = new javax.swing.JFormattedTextField();
        ButtonAct1 = new javax.swing.JButton();
        ButtonAct2 = new javax.swing.JButton();
        ButtonAct3 = new javax.swing.JButton();
        ButtonAct4 = new javax.swing.JButton();
        ButtonAct5 = new javax.swing.JButton();
        ButtonAct6 = new javax.swing.JButton();
        ButtonAct7 = new javax.swing.JButton();
        ButtonAct8 = new javax.swing.JButton();
        ButtonAct9 = new javax.swing.JButton();
        ButtonAct11 = new javax.swing.JButton();

        jLabel10.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel10.setText("Domicilio");

        ButtonAct10.setBackground(new java.awt.Color(0, 51, 102));
        ButtonAct10.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonAct10.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAct10.setText("Actualizar");
        ButtonAct10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAct10ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Actualizar Voluntarios");

        jLabel2.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel2.setText("Seleccionar Voluntario");

        LabelTVol.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        LabelTVol.setText("Tipo de Voluntario");

        ListVoluntarios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListVoluntarios.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListVoluntariosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListVoluntarios);

        ComboVol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo" }));
        ComboVol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboVolActionPerformed(evt);
            }
        });

        LabelApeM.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        LabelApeM.setText("Apellido Materno");

        LabelNombre.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        LabelNombre.setText("Nombre");

        LabelSede.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        LabelSede.setText("Sede:");

        TextApeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextApePActionPerformed(evt);
            }
        });

        ButtonDel.setBackground(new java.awt.Color(0, 51, 102));
        ButtonDel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonDel.setForeground(new java.awt.Color(255, 255, 255));
        ButtonDel.setText("Eliminar");
        ButtonDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDelActionPerformed(evt);
            }
        });

        LabelProf.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        LabelProf.setText("Profesion:");

        ComboProf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Profesion" }));

        ComboSede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sede" }));

        LabelApeP.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        LabelApeP.setText("Apellido Paterno ");

        LabelDoc.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        LabelDoc.setText("Domicilio");

        LabelFechNac.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        LabelFechNac.setText("Fecha de Nacimiento");

        LabelTel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        LabelTel.setText("Telefono");

        CheckDis.setText("Disponible");
        CheckDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckDisActionPerformed(evt);
            }
        });

        TextFechNac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy/MM/dd"))));

        ButtonAct1.setBackground(new java.awt.Color(0, 51, 102));
        ButtonAct1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonAct1.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAct1.setText("Actualizar");
        ButtonAct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAct1ActionPerformed(evt);
            }
        });

        ButtonAct2.setBackground(new java.awt.Color(0, 51, 102));
        ButtonAct2.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonAct2.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAct2.setText("Actualizar");
        ButtonAct2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAct2ActionPerformed(evt);
            }
        });

        ButtonAct3.setBackground(new java.awt.Color(0, 51, 102));
        ButtonAct3.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonAct3.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAct3.setText("Actualizar");
        ButtonAct3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAct3ActionPerformed(evt);
            }
        });

        ButtonAct4.setBackground(new java.awt.Color(0, 51, 102));
        ButtonAct4.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonAct4.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAct4.setText("Actualizar");
        ButtonAct4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAct4ActionPerformed(evt);
            }
        });

        ButtonAct5.setBackground(new java.awt.Color(0, 51, 102));
        ButtonAct5.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonAct5.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAct5.setText("Actualizar");
        ButtonAct5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAct5ActionPerformed(evt);
            }
        });

        ButtonAct6.setBackground(new java.awt.Color(0, 51, 102));
        ButtonAct6.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonAct6.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAct6.setText("Actualizar");
        ButtonAct6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAct6ActionPerformed(evt);
            }
        });

        ButtonAct7.setBackground(new java.awt.Color(0, 51, 102));
        ButtonAct7.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonAct7.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAct7.setText("Actualizar");
        ButtonAct7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAct7ActionPerformed(evt);
            }
        });

        ButtonAct8.setBackground(new java.awt.Color(0, 51, 102));
        ButtonAct8.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonAct8.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAct8.setText("Actualizar");
        ButtonAct8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAct8ActionPerformed(evt);
            }
        });

        ButtonAct9.setBackground(new java.awt.Color(0, 51, 102));
        ButtonAct9.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonAct9.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAct9.setText("Actualizar");
        ButtonAct9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAct9ActionPerformed(evt);
            }
        });

        ButtonAct11.setBackground(new java.awt.Color(0, 51, 102));
        ButtonAct11.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonAct11.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAct11.setText("Actualizar");
        ButtonAct11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAct11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(CheckDis)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonAct11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LabelTVol)
                                    .addComponent(LabelProf)
                                    .addComponent(LabelSede))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButtonDel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ComboVol, 0, 210, Short.MAX_VALUE)
                                            .addComponent(ComboProf, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ComboSede, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ButtonAct7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ButtonAct8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ButtonAct9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(65, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LabelNombre)
                                    .addComponent(LabelApeM)
                                    .addComponent(LabelApeP)
                                    .addComponent(LabelDoc)
                                    .addComponent(LabelFechNac)
                                    .addComponent(LabelTel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextNombre)
                                    .addComponent(TextApeP, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(TextApeM)
                                    .addComponent(TextDoc, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextTel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextFechNac))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButtonAct1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonAct2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonAct3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonAct4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonAct5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonAct6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelNombre)
                            .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonAct1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextApeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelApeP)
                            .addComponent(ButtonAct2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextApeM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelApeM)
                            .addComponent(ButtonAct3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelDoc)
                            .addComponent(ButtonAct4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelFechNac)
                            .addComponent(TextFechNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonAct5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelTel)
                            .addComponent(ButtonAct6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelSede)
                            .addComponent(ButtonAct7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelTVol, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ButtonAct8)
                                .addComponent(ComboVol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelProf)
                            .addComponent(ComboProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonAct9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CheckDis)
                            .addComponent(ButtonAct11))
                        .addGap(18, 18, 18)
                        .addComponent(ButtonDel))
                    .addComponent(jScrollPane1))
                .addGap(60, 60, 60))
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

    private void ComboVolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboVolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboVolActionPerformed

    private void TextApePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextApePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextApePActionPerformed

    private void ListVoluntariosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListVoluntariosValueChanged
        String vol = (String) ListVoluntarios.getSelectedValue();
        id = mapa.get(vol);
        ResultSet rs = cv.ponerNombres(id);
        try{
            while(rs.next()){
                String data = rs.getString("nombre");
                String data2 = rs.getString("apellidoP");
                String data3 = rs.getString("apellidoM");
                String data4 = rs.getString("domicilio");
                String data5 = rs.getString("fechaNac");
                String data6 = rs.getString("telefono");
                LabelNombre.setText(data);
                LabelApeP.setText(data2);
                LabelApeM.setText(data3);
                LabelDoc.setText(data4);
                LabelFechNac.setText(data5);
                LabelTel.setText(data6);
                String data7 = cv.passIDCiudad(rs.getInt("idSede"));
                String data8 = cv.passIDTVol(rs.getInt("idTipoVoluntario"));
                if("HUMANITARIA".equals(data8)){
                    ComboProf.setEnabled(true);
                    CheckDis.setEnabled(true);
                }else{
                    ComboProf.setEnabled(false);
                    CheckDis.setEnabled(false);
                }
                String data9 = cv.passIDProf(rs.getInt("idProfesion"));
                ComboSede.setSelectedItem(data7);
                ComboVol.setSelectedItem(data8);
                ComboProf.setSelectedItem(data9);
                boolean data10 = rs.getBoolean("disponibilidad");
                if(data10){
                    CheckDis.setSelected(true);
                }else{
                    CheckDis.setSelected(false);
                }
            }
        }catch(SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error en Llenar Lista");
        }finally {
            try {
                if (rs != null) rs.close();
            } catch (SQLException e) {
               System.out.println("Error" + e);
               JOptionPane.showMessageDialog(null, "ERROR EN CERRAR CONEXIONES");
            } 
        }
       
        
    }//GEN-LAST:event_ListVoluntariosValueChanged

    private void ButtonDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDelActionPerformed
        cv.eliminarVol(id);
    }//GEN-LAST:event_ButtonDelActionPerformed

    private void CheckDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckDisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckDisActionPerformed

    private void ButtonAct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAct1ActionPerformed
        if(!TextNombre.getText().isEmpty()){
           cv.actNom(TextNombre.getText().toUpperCase(), id);
        }else{
            JOptionPane.showMessageDialog(null, "Favor de llenar el campo");
        }
    }//GEN-LAST:event_ButtonAct1ActionPerformed

    private void ButtonAct2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAct2ActionPerformed
        if(!TextApeP.getText().isEmpty()){
           cv.actApeP(TextApeP.getText().toUpperCase(), id);
        }else{
            JOptionPane.showMessageDialog(null, "Favor de llenar el campo");
        }
    }//GEN-LAST:event_ButtonAct2ActionPerformed

    private void ButtonAct3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAct3ActionPerformed
        if(!TextApeM.getText().isEmpty()){
           cv.actApeM(TextApeM.getText().toUpperCase(), id);
        }else{
            JOptionPane.showMessageDialog(null, "Favor de llenar el campo");
        }
    }//GEN-LAST:event_ButtonAct3ActionPerformed

    private void ButtonAct4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAct4ActionPerformed
        if(!TextDoc.getText().isEmpty()){
           cv.actDomicilio(TextDoc.getText().toUpperCase(), id);
        }else{
            JOptionPane.showMessageDialog(null, "Favor de llenar el campo");
        }
    }//GEN-LAST:event_ButtonAct4ActionPerformed

    private void ButtonAct5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAct5ActionPerformed
        if(!TextFechNac.getText().isEmpty()){
           cv.actFechaNac(TextFechNac.getText().toUpperCase(), id);
        }else{
            JOptionPane.showMessageDialog(null, "Favor de llenar el campo");
        }
    }//GEN-LAST:event_ButtonAct5ActionPerformed

    private void ButtonAct6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAct6ActionPerformed
        if(!TextTel.getText().isEmpty()){
           cv.acttelefono(TextTel.getText().toUpperCase(), id);
        }else{
            JOptionPane.showMessageDialog(null, "Favor de llenar el campo");
        }
    }//GEN-LAST:event_ButtonAct6ActionPerformed

    private void ButtonAct7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAct7ActionPerformed
        if(!"Sede".equals(ComboSede.getSelectedItem())){
            String ciudad = (String) ComboSede.getSelectedItem();
            int idsede = cv.passCiudadID(ciudad);
            cv.actSede(idsede, id);
        }else{
            JOptionPane.showMessageDialog(null, "Favor de elegir un campo");
        }
    }//GEN-LAST:event_ButtonAct7ActionPerformed

    private void ButtonAct8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAct8ActionPerformed
        if(!"Tipo".equals(ComboVol.getSelectedItem())){
            String ciudad = (String) ComboVol.getSelectedItem();
            int idtv = cv.passTVID(ciudad);
            cv.actTVolun(idtv, id);
        }else{
            JOptionPane.showMessageDialog(null, "Favor de elegir un campo");
        }
    }//GEN-LAST:event_ButtonAct8ActionPerformed

    private void ButtonAct9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAct9ActionPerformed
        if(!"Profesion".equals(ComboProf.getSelectedItem())){
            String ciudad = (String) ComboProf.getSelectedItem();
            int idProf = cv.passProf(ciudad);
            cv.actSede(idProf, id);
        }else{
            JOptionPane.showMessageDialog(null, "Favor de elegir un campo");
        }
    }//GEN-LAST:event_ButtonAct9ActionPerformed

    private void ButtonAct10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAct10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonAct10ActionPerformed

    private void ButtonAct11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAct11ActionPerformed
        cv.actPis(CheckDis.isSelected(), id);
    }//GEN-LAST:event_ButtonAct11ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAct1;
    private javax.swing.JButton ButtonAct10;
    private javax.swing.JButton ButtonAct11;
    private javax.swing.JButton ButtonAct2;
    private javax.swing.JButton ButtonAct3;
    private javax.swing.JButton ButtonAct4;
    private javax.swing.JButton ButtonAct5;
    private javax.swing.JButton ButtonAct6;
    private javax.swing.JButton ButtonAct7;
    private javax.swing.JButton ButtonAct8;
    private javax.swing.JButton ButtonAct9;
    private javax.swing.JButton ButtonDel;
    private javax.swing.JCheckBox CheckDis;
    private javax.swing.JComboBox<String> ComboProf;
    private javax.swing.JComboBox<String> ComboSede;
    private javax.swing.JComboBox<String> ComboVol;
    private javax.swing.JLabel LabelApeM;
    private javax.swing.JLabel LabelApeP;
    private javax.swing.JLabel LabelDoc;
    private javax.swing.JLabel LabelFechNac;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelProf;
    private javax.swing.JLabel LabelSede;
    private javax.swing.JLabel LabelTVol;
    private javax.swing.JLabel LabelTel;
    private javax.swing.JList<String> ListVoluntarios;
    private javax.swing.JTextField TextApeM;
    private javax.swing.JTextField TextApeP;
    private javax.swing.JTextField TextDoc;
    private javax.swing.JFormattedTextField TextFechNac;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
