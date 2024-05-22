/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Control.ControlSocio;
import Modelo.ModeloSocio;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruben
 */
public class Actualizar_ElimnarS extends javax.swing.JInternalFrame {

    /**
     * Creates new form Actualizar_ElimnarS
     */
    public Actualizar_ElimnarS() {
        initComponents();
        LlenarLista();
        cs.RellenarComboSede(ComboSede);
        cs.RellenarComboCuota(ComboCuota);
    }

    ControlSocio cs = new ControlSocio();
    ModeloSocio ms = new ModeloSocio();
    HashMap<String, Integer> mapa = new HashMap<>();
    int id = 0;
        
    public  void LlenarLista(){   
        ResultSet rs = cs.llenarLista();
        DefaultListModel<String> listaM = new DefaultListModel<>(); 
        try{
        while(rs.next()){
            String data = rs.getString("nombre");
            String data2 = rs.getString("apellidoP");
            String data3 = rs.getString("apellidoM");
            String ultdata = data+" "+data2+" "+data3;
            int data4 = rs.getInt("idDatosPersonales");
            listaM.addElement(ultdata);
            mapa.put(ultdata, data4);
        }
        ListaSocios.setModel(listaM);
        }catch(SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "ERROR EN LA LISTA");
        }finally {
            try {
                if (rs != null) rs.close();
            } catch (SQLException e) {
               System.out.println("Error" + e);
               JOptionPane.showMessageDialog(null, "ERROR EN CERRAR CONEXIONES");
            } 
    }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        ButtonUpdate2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaSocios = new javax.swing.JList<>();
        TextNombre = new javax.swing.JTextField();
        TextApeP = new javax.swing.JTextField();
        TextApeM = new javax.swing.JTextField();
        TextDomicilio = new javax.swing.JTextField();
        TextTelefono = new javax.swing.JTextField();
        ButtonDelete = new javax.swing.JButton();
        ComboSede = new javax.swing.JComboBox<>();
        ComboCuota = new javax.swing.JComboBox<>();
        TextCuentaBan = new javax.swing.JTextField();
        LabelNombre = new javax.swing.JLabel();
        LabelApeP = new javax.swing.JLabel();
        LabelApM = new javax.swing.JLabel();
        LabelDoc = new javax.swing.JLabel();
        LableFechaN = new javax.swing.JLabel();
        LabelTel = new javax.swing.JLabel();
        LableCuentBan = new javax.swing.JLabel();
        FechaPag = new javax.swing.JLabel();
        LabelSede = new javax.swing.JLabel();
        LabelCuota = new javax.swing.JLabel();
        ButtonN = new javax.swing.JButton();
        ButtonApeP = new javax.swing.JButton();
        ButtonApeM = new javax.swing.JButton();
        ButtonApeD = new javax.swing.JButton();
        ButtonApeFN = new javax.swing.JButton();
        ButtonT = new javax.swing.JButton();
        ButtonCB = new javax.swing.JButton();
        ButtonFP = new javax.swing.JButton();
        ButtonSede = new javax.swing.JButton();
        ButtonCuo = new javax.swing.JButton();
        TextFechaNaac = new javax.swing.JFormattedTextField();
        TextFechaPag = new javax.swing.JFormattedTextField();

        jTextField4.setText("jTextField4");

        jLabel1.setText("jLabel1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        ButtonUpdate2.setText("Actualizar");
        ButtonUpdate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUpdate2ActionPerformed(evt);
            }
        });

        ListaSocios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListaSocios.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaSociosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListaSocios);

        ButtonDelete.setText("Eliminar");
        ButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteActionPerformed(evt);
            }
        });

        LabelNombre.setText("Nombre");

        LabelApeP.setText("Apellido Paterno");

        LabelApM.setText("Apellido Materno");

        LabelDoc.setText("Domicilio");

        LableFechaN.setText("Fecha Nacimiento");

        LabelTel.setText("Telefono");

        LableCuentBan.setText("Cuenta Bancaria");

        FechaPag.setText("Fecha Pago");

        LabelSede.setText("Sede");

        LabelCuota.setText("Cuota");

        ButtonN.setText("Actualizar");
        ButtonN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNActionPerformed(evt);
            }
        });

        ButtonApeP.setText("Actualizar");
        ButtonApeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonApePActionPerformed(evt);
            }
        });

        ButtonApeM.setText("Actualizar");
        ButtonApeM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonApeMActionPerformed(evt);
            }
        });

        ButtonApeD.setText("Actualizar");
        ButtonApeD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonApeDActionPerformed(evt);
            }
        });

        ButtonApeFN.setText("Actualizar");
        ButtonApeFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonApeFNActionPerformed(evt);
            }
        });

        ButtonT.setText("Actualizar");
        ButtonT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTActionPerformed(evt);
            }
        });

        ButtonCB.setText("Actualizar");
        ButtonCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCBActionPerformed(evt);
            }
        });

        ButtonFP.setText("Actualizar");
        ButtonFP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFPActionPerformed(evt);
            }
        });

        ButtonSede.setText("Actualizar");
        ButtonSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSedeActionPerformed(evt);
            }
        });

        ButtonCuo.setText("Actualizar");
        ButtonCuo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCuoActionPerformed(evt);
            }
        });

        TextFechaNaac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        TextFechaPag.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelApM)
                            .addComponent(LabelApeP)
                            .addComponent(LabelNombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextApeM, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonApeM))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextApeP, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonApeP))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonN)))
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelTel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LableCuentBan, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(FechaPag, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LableFechaN, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LabelDoc, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TextDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ButtonApeD))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TextCuentaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TextFechaPag, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ButtonCB)
                                            .addComponent(ButtonFP)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(TextFechaNaac)
                                            .addComponent(TextTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ButtonT))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(ButtonApeFN))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelCuota)
                                    .addComponent(LabelSede))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ComboSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ButtonSede))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ComboCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ButtonCuo)))))
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(ButtonDelete)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNombre)
                    .addComponent(ButtonN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextApeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelApeP)
                    .addComponent(ButtonApeP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextApeM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelApM)
                    .addComponent(ButtonApeM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelDoc)
                    .addComponent(ButtonApeD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LableFechaN)
                    .addComponent(ButtonApeFN)
                    .addComponent(TextFechaNaac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTel)
                    .addComponent(TextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextCuentaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ButtonCB))
                    .addComponent(LableCuentBan, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FechaPag)
                    .addComponent(ButtonFP)
                    .addComponent(TextFechaPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelCuota)
                            .addComponent(ButtonCuo)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelSede)
                        .addComponent(ComboSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ButtonSede)))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListaSociosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaSociosValueChanged
        String nombre = (String) ListaSocios.getSelectedValue();
            if(mapa.containsKey(nombre)){
                id = mapa.get(nombre);
                System.out.println(id);
            }
        ResultSet rs = cs.socioActualizar(id); 
        try{
        while(rs.next()){
            String data = rs.getString(2);
            String data2 = rs.getString(3);
            String data3 = rs.getString(4);
            String data4 = rs.getString(5);
            String data5 = rs.getString(6);
            String data6 = rs.getString(7);
            LabelNombre.setText(data);
            LabelApeP.setText(data2);
            LabelApM.setText(data3);
            LabelDoc.setText(data4);
            LableFechaN.setText(data5);
            LabelTel.setText(data6);
            }
        rs = cs.otroActualizar(id);
        while(rs.next()){
            String data = rs.getString(2);
            String data2 = rs.getString(3);
            int data3 = rs.getInt(4);
            String data4 = rs.getString(5);
            LableCuentBan.setText(data);
            FechaPag.setText(data2);
            ComboCuota.setSelectedItem(data4);
            ResultSet ro = cs.LlamaSede(data3);
            while(ro.next()){
            String ciudad = ro.getString("ciudad");
            ComboSede.setSelectedItem(ciudad);
            }
        }
        }catch(SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "ERROR EN LA LISTA");
        }finally {
            try {
                if (rs != null) rs.close();
            } catch (SQLException e) {
               System.out.println("Error" + e);
               JOptionPane.showMessageDialog(null, "ERROR EN CERRAR CONEXIONES");
            } 
    } 
    }//GEN-LAST:event_ListaSociosValueChanged

    
    private void ButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteActionPerformed
        cs.eliminarSocio(id);
    }//GEN-LAST:event_ButtonDeleteActionPerformed

    private void ButtonNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNActionPerformed
        if(!TextNombre.getText().isEmpty()){
            ms.setNombre(TextNombre.getText());
            cs.actNom(ms.getNombre(), id);
        }
        repaint();
        revalidate();
    }//GEN-LAST:event_ButtonNActionPerformed

    private void ButtonUpdate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUpdate2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonUpdate2ActionPerformed

    private void ButtonTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTActionPerformed
        if(!TextTelefono.getText().isEmpty()){
            ms.setTelefono(TextTelefono.getText());
            cs.acttelefono(ms.getTelefono(), id);
        }
        repaint();
        revalidate();
    }//GEN-LAST:event_ButtonTActionPerformed

    private void ButtonApePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonApePActionPerformed
        if(!TextApeP.getText().isEmpty()){
            ms.setApellidoP(TextApeP.getText());
            cs.actApeP(ms.getApellidoP(), id);
        }
        repaint();
        revalidate();
    }//GEN-LAST:event_ButtonApePActionPerformed

    private void ButtonApeMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonApeMActionPerformed
        if(!TextApeM.getText().isEmpty()){
            ms.setApellidoM(TextApeM.getText());
            cs.actApeM(ms.getApellidoM(), id);
        }
        repaint();
        revalidate();
    }//GEN-LAST:event_ButtonApeMActionPerformed

    private void ButtonApeDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonApeDActionPerformed
        if(!TextDomicilio.getText().isEmpty()){
            ms.setDomicilio(TextDomicilio.getText());
            cs.actDomicilio(ms.getDomicilio(), id);
        }
        repaint();
        revalidate();
    }//GEN-LAST:event_ButtonApeDActionPerformed

    private void ButtonApeFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonApeFNActionPerformed
        if(!TextFechaNaac.getText().isEmpty()){
            ms.setFechaNac(TextFechaNaac.getText());
            cs.actFechaNac(ms.getFechaNac(), id);
        }
        repaint();
        revalidate();
    }//GEN-LAST:event_ButtonApeFNActionPerformed

    private void ButtonCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCBActionPerformed
        if(!TextCuentaBan.getText().isEmpty()){
            ms.setCuentaBnacaria(TextCuentaBan.getText());
            cs.actCuenBan(ms.getCuentaBnacaria(), id);
        }
        repaint();
        revalidate();
    }//GEN-LAST:event_ButtonCBActionPerformed

    private void ButtonFPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFPActionPerformed
        if(!TextFechaPag.getText().isEmpty()){
            ms.setFechPago(TextFechaPag.getText());
            cs.actFechaPag(ms.getFechPago(), id);
        }
        revalidate();
        repaint();
    }//GEN-LAST:event_ButtonFPActionPerformed

    private void ButtonSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSedeActionPerformed
        ms.setIdSede((String) ComboSede.getSelectedItem());
        cs.actSede(ms.getIdSede(), id);
        repaint();
        revalidate();
    }//GEN-LAST:event_ButtonSedeActionPerformed

    private void ButtonCuoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCuoActionPerformed
         ms.setTipoCuota((String) ComboCuota.getSelectedItem());
         cs.actTipoC(ms.getTipoCuota(), id);
         repaint();
         revalidate();
    }//GEN-LAST:event_ButtonCuoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonApeD;
    private javax.swing.JButton ButtonApeFN;
    private javax.swing.JButton ButtonApeM;
    private javax.swing.JButton ButtonApeP;
    private javax.swing.JButton ButtonCB;
    private javax.swing.JButton ButtonCuo;
    private javax.swing.JButton ButtonDelete;
    private javax.swing.JButton ButtonFP;
    private javax.swing.JButton ButtonN;
    private javax.swing.JButton ButtonSede;
    private javax.swing.JButton ButtonT;
    private javax.swing.JButton ButtonUpdate2;
    private javax.swing.JComboBox<String> ComboCuota;
    private javax.swing.JComboBox<String> ComboSede;
    private javax.swing.JLabel FechaPag;
    private javax.swing.JLabel LabelApM;
    private javax.swing.JLabel LabelApeP;
    private javax.swing.JLabel LabelCuota;
    private javax.swing.JLabel LabelDoc;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelSede;
    private javax.swing.JLabel LabelTel;
    private javax.swing.JLabel LableCuentBan;
    private javax.swing.JLabel LableFechaN;
    private javax.swing.JList<String> ListaSocios;
    private javax.swing.JTextField TextApeM;
    private javax.swing.JTextField TextApeP;
    private javax.swing.JTextField TextCuentaBan;
    private javax.swing.JTextField TextDomicilio;
    private javax.swing.JFormattedTextField TextFechaNaac;
    private javax.swing.JFormattedTextField TextFechaPag;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
