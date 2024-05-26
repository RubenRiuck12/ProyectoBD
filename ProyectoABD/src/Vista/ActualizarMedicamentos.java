/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Control.ControlAlmacen;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class ActualizarMedicamentos extends javax.swing.JPanel {

    HashMap<String, Integer> mapa = new HashMap<>();
    
    public ActualizarMedicamentos() {
        initComponents();
        mapa = ca.rellenarListaMed(ListaMedicamentos);
        ca.RellenarComboSede(ComboSede);
    }

    ControlAlmacen ca = new ControlAlmacen();
    int id = 0;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ButtonAct2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaMedicamentos = new javax.swing.JList<>();
        LableMedicamento = new javax.swing.JLabel();
        TextMedicamento = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        LableCantidad = new javax.swing.JLabel();
        TextCantidad = new javax.swing.JTextField();
        ButtonAct1 = new javax.swing.JButton();
        ComboSede = new javax.swing.JComboBox<>();
        ButtonAct3 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Actualizar Medicamentos");

        jLabel2.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel2.setText("Seleccionar Medicamentos:");

        ButtonAct2.setBackground(new java.awt.Color(0, 51, 102));
        ButtonAct2.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonAct2.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAct2.setText("Actualizar");
        ButtonAct2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAct2ActionPerformed(evt);
            }
        });

        ListaMedicamentos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListaMedicamentos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaMedicamentosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListaMedicamentos);

        LableMedicamento.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        LableMedicamento.setText("Medicamento:");

        jButton2.setBackground(new java.awt.Color(0, 51, 102));
        jButton2.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        LableCantidad.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        LableCantidad.setText("Cantidad:");

        TextCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextCantidadKeyTyped(evt);
            }
        });

        ButtonAct1.setBackground(new java.awt.Color(0, 51, 102));
        ButtonAct1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonAct1.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAct1.setText("Actualizar");
        ButtonAct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAct1ActionPerformed(evt);
            }
        });

        ComboSede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sede" }));

        ButtonAct3.setBackground(new java.awt.Color(0, 51, 102));
        ButtonAct3.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonAct3.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAct3.setText("Actualizar");
        ButtonAct3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAct3ActionPerformed(evt);
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
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LableCantidad)
                                    .addComponent(LableMedicamento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TextMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                        .addComponent(TextCantidad))
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButtonAct1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonAct2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonAct3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)))))
                .addGap(0, 13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LableMedicamento)
                            .addComponent(TextMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonAct1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LableCantidad)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ButtonAct2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonAct3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(59, 59, 59))))
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

    private void ButtonAct2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAct2ActionPerformed
        if(TextCantidad.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Favor llenar el campo");
        }else{
            int cantida = Integer.parseInt(TextCantidad.getText());
            ca.actCantidadM(cantida, id);
        }
    }//GEN-LAST:event_ButtonAct2ActionPerformed

    private void ButtonAct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAct1ActionPerformed
        if(TextMedicamento.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Favor llenar el campo");
        }else{
            ca.actnombreM(TextMedicamento.getText().toUpperCase(), id);
        }
    }//GEN-LAST:event_ButtonAct1ActionPerformed

    private void ButtonAct3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAct3ActionPerformed
        if("Sede".equals(ComboSede.getSelectedItem())){
            JOptionPane.showMessageDialog(null, "Favor elegir el campo");
        }else{
            int sede = ca.passCiudadID((String) ComboSede.getSelectedItem());
            ca.actSedeM(sede, id);
        }
    }//GEN-LAST:event_ButtonAct3ActionPerformed

    private void ListaMedicamentosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaMedicamentosValueChanged
        String vol = (String) ListaMedicamentos.getSelectedValue();
        id = mapa.get(vol);
        ResultSet rs = ca.ponerNombresM(id);
        try{
            while(rs.next()){
                String data = rs.getString("nombre");
                String data2 = rs.getString("cantidad");
                int data3 = rs.getInt("idSede");
                LableMedicamento.setText(data);
                LableCantidad.setText(data2);
                String ciudad = ca.passIDCiudad(data3);
                ComboSede.setSelectedItem(ciudad);
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
    }//GEN-LAST:event_ListaMedicamentosValueChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ca.eliminarMatM(id);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TextCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextCantidadKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57 || key == 127;
        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_TextCantidadKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAct1;
    private javax.swing.JButton ButtonAct2;
    private javax.swing.JButton ButtonAct3;
    private javax.swing.JComboBox<String> ComboSede;
    private javax.swing.JLabel LableCantidad;
    private javax.swing.JLabel LableMedicamento;
    private javax.swing.JList<String> ListaMedicamentos;
    private javax.swing.JTextField TextCantidad;
    private javax.swing.JTextField TextMedicamento;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
