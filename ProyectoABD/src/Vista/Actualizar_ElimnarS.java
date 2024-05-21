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

        
    public  void LlenarLista(){   
        ResultSet rs = cs.llenarLista();
        DefaultListModel<String> listaM = new DefaultListModel<>(); 
        try{
        while(rs.next()){
            String data = rs.getString("nombre");
            int data2 = rs.getInt("idDatosPersonales");
            listaM.addElement(data);
            mapa.put(data, data2);
        }
        ListaSocios.setModel(listaM);
        }catch(SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "ERROR EN LA LISTA");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaSocios = new javax.swing.JList<>();
        TextNombre = new javax.swing.JTextField();
        TextApeP = new javax.swing.JTextField();
        TextApeM = new javax.swing.JTextField();
        TextDomicilio = new javax.swing.JTextField();
        TextFechaNac = new javax.swing.JTextField();
        TextTelefono = new javax.swing.JTextField();
        ButtonDelete = new javax.swing.JButton();
        ButtonUpdate = new javax.swing.JButton();
        ComboSede = new javax.swing.JComboBox<>();
        ComboCuota = new javax.swing.JComboBox<>();
        TextCuentaBan = new javax.swing.JTextField();
        TextFechaPag = new javax.swing.JTextField();
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

        jTextField4.setText("jTextField4");

        jLabel1.setText("jLabel1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

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

        ButtonUpdate.setText("Actualizar");
        ButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUpdateActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelApM)
                            .addComponent(LabelApeP)
                            .addComponent(LabelNombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextApeP, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextApeM, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelCuota)
                            .addComponent(LabelSede))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(237, 237, 237))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ButtonUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
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
                                .addGap(37, 37, 37)
                                .addComponent(ButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TextCuentaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextFechaPag, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TextFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelNombre)
                            .addComponent(ButtonUpdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextApeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelApeP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextApeM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelApM))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelDoc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LableFechaN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelTel)
                            .addComponent(TextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextCuentaBan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LableCuentBan, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFechaPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FechaPag))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelSede)
                            .addComponent(ComboSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelCuota))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListaSociosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaSociosValueChanged
        String nombre = (String) ListaSocios.getSelectedValue();
        int id = 0;
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
        ResultSet rr = cs.otroActualizar(id);
        while(rr.next()){
            String data = rr.getString(2);
            String data2 = rr.getString(3);
            int data3 = rr.getInt(4);
            String data4 = rr.getString(5);
            LableCuentBan.setText(data);
            FechaPag.setText(data2);
            ComboCuota.setSelectedItem(data4);
            ResultSet ro = cs.camb(data3);
            while(ro.next()){
            String ciudad = ro.getString(1);
            ComboSede.setSelectedItem(ciudad);
            }
        }
        }catch(SQLException e){
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "ERROR EN LA LISTA");
        } 
    }//GEN-LAST:event_ListaSociosValueChanged

    private void ButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUpdateActionPerformed
        ms.setNombre(TextNombre.getText());
        ms.setApellidoP(TextApeP.getText());
        ms.setApellidoM(TextApeM.getText());
        ms.setDomicilio(TextDomicilio.getText());
        ms.setFechaNac(TextFechaNac.getText());
        ms.setTelefono(TextTelefono.getText());
        ms.setCuentaBnacaria(TextCuentaBan.getText());
        ms.setFechPago(TextFechaPag.getText());
        ms.setIdSede((String) ComboSede.getSelectedItem());
        String consultan = "select idSede from sede where ciudad ="+"'"+ms.getIdSede()+"'";
        int id2 = cs.llamarId(consultan);
        ms.setTipoCuota((String) ComboCuota.getSelectedItem());
        int c1 = ComboSede.getSelectedIndex();
        int c2 = ComboCuota.getSelectedIndex();
        int id = 0;
            if(mapa.containsKey(ms.getNombre())){
                id = mapa.get(ms.getNombre());
                System.out.println(id);
            }
        cs.actSocio(ms.getNombre(), ms.getApellidoP(), ms.getApellidoM(), ms.getDomicilio(), ms.getFechaNac(), ms.getTelefono(), ms.getCuentaBnacaria(), ms.getFechPago(), id2, ms.getTipoCuota(), id);
        TextNombre.setText("");
        TextApeP.setText("");
        TextApeM.setText("");
        TextDomicilio.setText("");
        TextFechaNac.setText("");
        TextTelefono.setText("");
        TextCuentaBan.setText("");
        TextFechaPag.setText("");
        ComboSede.setSelectedIndex(c1);
        ComboCuota.setSelectedIndex(c2);
        this.repaint();
    }//GEN-LAST:event_ButtonUpdateActionPerformed

    private void ButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteActionPerformed
        ms.setNombre(TextNombre.getText());
        ms.setApellidoP(TextApeP.getText());
        ms.setApellidoM(TextApeM.getText());
        int id = 0;
        if(mapa.containsKey(ms.getNombre())){
                id = mapa.get(ms.getNombre());
                System.out.println(id);
            }
        cs.eliminarSocio(ms.getNombre(), ms.getApellidoP(), ms.getApellidoM(), id);
    }//GEN-LAST:event_ButtonDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDelete;
    private javax.swing.JButton ButtonUpdate;
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
    private javax.swing.JTextField TextFechaNac;
    private javax.swing.JTextField TextFechaPag;
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
