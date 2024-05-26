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
public class ActualizarAlimentos extends javax.swing.JPanel {

   HashMap<String, Integer> mapa = new HashMap<>();
   
    
    public ActualizarAlimentos() {
        initComponents();
       mapa = ca.rellenarListaVolu(ListaAlimentos);
       ca.RellenarComboSede(ComboSede);
    }

    ControlAlmacen ca = new ControlAlmacen();
    int id = 0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ButtonAct = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaAlimentos = new javax.swing.JList<>();
        LableAlimento = new javax.swing.JLabel();
        TextNombre = new javax.swing.JTextField();
        ButtonDel = new javax.swing.JButton();
        LabelCantida = new javax.swing.JLabel();
        TextCantidad = new javax.swing.JTextField();
        ComboSede = new javax.swing.JComboBox<>();
        ButtonAct1 = new javax.swing.JButton();
        ButtonAct2 = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Actualizar Alimentos");

        jLabel2.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel2.setText("Seleccionar Alimentos:");

        ButtonAct.setBackground(new java.awt.Color(0, 51, 102));
        ButtonAct.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonAct.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAct.setText("Actualizar");
        ButtonAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActActionPerformed(evt);
            }
        });

        ListaAlimentos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListaAlimentos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaAlimentosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListaAlimentos);

        LableAlimento.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        LableAlimento.setText("Alimento:");

        ButtonDel.setBackground(new java.awt.Color(0, 51, 102));
        ButtonDel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonDel.setForeground(new java.awt.Color(255, 255, 255));
        ButtonDel.setText("Eliminar");
        ButtonDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDelActionPerformed(evt);
            }
        });

        LabelCantida.setText("Cantidad");

        TextCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextCantidadKeyTyped(evt);
            }
        });

        ComboSede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sede" }));

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
                                .addGap(141, 141, 141)
                                .addComponent(ButtonDel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LabelCantida)
                                    .addComponent(LableAlimento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(TextCantidad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButtonAct, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonAct1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(ComboSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(ButtonAct2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 42, Short.MAX_VALUE))
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
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LableAlimento)
                            .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonAct))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelCantida)
                            .addComponent(TextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonAct1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonAct2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonDel)
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

    private void ButtonActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActActionPerformed
        if(TextNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Favor llenar el campo");
        }else{
            ca.actnombre(TextNombre.getText().toUpperCase(), id);
        }
    }//GEN-LAST:event_ButtonActActionPerformed

    private void ListaAlimentosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaAlimentosValueChanged
        String vol = (String) ListaAlimentos.getSelectedValue();
        id = mapa.get(vol);
        ResultSet rs = ca.ponerNombres(id);
        try{
            while(rs.next()){
                String data = rs.getString("nombre");
                String data2 = rs.getString("cantidad");
                int data3 = rs.getInt("idSede");
                LableAlimento.setText(data);
                LabelCantida.setText(data2);
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
    }//GEN-LAST:event_ListaAlimentosValueChanged

    private void ButtonAct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAct1ActionPerformed
        if(TextCantidad.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Favor llenar el campo");
        }else{
            int cantida = Integer.parseInt(TextCantidad.getText());
            ca.actCantidad(cantida, id);
        }
    }//GEN-LAST:event_ButtonAct1ActionPerformed

    private void ButtonAct2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAct2ActionPerformed
        if("Sede".equals(ComboSede.getSelectedItem())){
            JOptionPane.showMessageDialog(null, "Favor elegir el campo");
        }else{
            int sede = ca.passCiudadID((String) ComboSede.getSelectedItem());
            ca.actSede(sede, id);
        }
    }//GEN-LAST:event_ButtonAct2ActionPerformed

    private void ButtonDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDelActionPerformed
        ca.eliminarMat(id);
    }//GEN-LAST:event_ButtonDelActionPerformed

    private void TextCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextCantidadKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57 || key == 127;
        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_TextCantidadKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAct;
    private javax.swing.JButton ButtonAct1;
    private javax.swing.JButton ButtonAct2;
    private javax.swing.JButton ButtonDel;
    private javax.swing.JComboBox<String> ComboSede;
    private javax.swing.JLabel LabelCantida;
    private javax.swing.JLabel LableAlimento;
    private javax.swing.JList<String> ListaAlimentos;
    private javax.swing.JTextField TextCantidad;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
