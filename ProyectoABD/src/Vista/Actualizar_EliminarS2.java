
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
 * @author aleja
 */
public class Actualizar_EliminarS2 extends javax.swing.JPanel {

    /**
     * Creates new form Actualizar_EliminarS2
     */
    public Actualizar_EliminarS2() {
        initComponents();
        LlenarLista();
        cs.RellenarComboSede(ComboSede);
        cs.RellenarComboCuota(ComboCuota);
    }

    //Llamada a clases que se usaran en esta la interfaz y variables necesarias
    ControlSocio cs = new ControlSocio();
    ModeloSocio ms = new ModeloSocio();
    HashMap<String, Integer> mapa = new HashMap<>();
    int id = 0;
    
    //Metodo para llenar la lista de socios
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

        ButtonUpdate8 = new javax.swing.JButton();
        TextNombre = new javax.swing.JTextField();
        TextApeP = new javax.swing.JTextField();
        TextApeM = new javax.swing.JTextField();
        TextDomicilio = new javax.swing.JTextField();
        TextTelefono = new javax.swing.JTextField();
        ButtonDelete = new javax.swing.JButton();
        ButtonActC = new javax.swing.JButton();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaSocios = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ButtonActAM = new javax.swing.JButton();
        ButtonActN = new javax.swing.JButton();
        ButtonActAP = new javax.swing.JButton();
        ButtonActD = new javax.swing.JButton();
        ButtonActFN = new javax.swing.JButton();
        ButtonActT = new javax.swing.JButton();
        ButtonActCB = new javax.swing.JButton();
        ButtonActFP = new javax.swing.JButton();
        ButtonActS = new javax.swing.JButton();
        TextFechaNac = new javax.swing.JFormattedTextField();
        TextFechaPag = new javax.swing.JFormattedTextField();

        ButtonUpdate8.setBackground(new java.awt.Color(0, 51, 102));
        ButtonUpdate8.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonUpdate8.setForeground(new java.awt.Color(255, 255, 255));
        ButtonUpdate8.setText("Actualizar");
        ButtonUpdate8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUpdate8ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(TextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 175, -1));
        add(TextApeP, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 175, -1));
        add(TextApeM, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 175, -1));
        add(TextDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 175, -1));

        TextTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextTelefonoActionPerformed(evt);
            }
        });
        add(TextTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 175, -1));

        ButtonDelete.setBackground(new java.awt.Color(0, 51, 102));
        ButtonDelete.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        ButtonDelete.setText("Eliminar");
        ButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteActionPerformed(evt);
            }
        });
        add(ButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 83, -1));

        ButtonActC.setBackground(new java.awt.Color(0, 51, 102));
        ButtonActC.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonActC.setForeground(new java.awt.Color(255, 255, 255));
        ButtonActC.setText("Actualizar");
        ButtonActC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActCActionPerformed(evt);
            }
        });
        add(ButtonActC, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, -1, -1));

        add(ComboSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 368, -1, -1));

        add(ComboCuota, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 399, -1, -1));
        add(TextCuentaBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 176, -1));

        LabelNombre.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        LabelNombre.setText("Nombre:");
        add(LabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        LabelApeP.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        LabelApeP.setText("Apellido Paterno:");
        add(LabelApeP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        LabelApM.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        LabelApM.setText("Apellido Materno:");
        add(LabelApM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        LabelDoc.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        LabelDoc.setText("Domicilio:");
        add(LabelDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        LableFechaN.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        LableFechaN.setText("Fecha Nacimiento:");
        add(LableFechaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        LabelTel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        LabelTel.setText("Telefono:");
        add(LabelTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        LableCuentBan.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        LableCuentBan.setText("Cuenta Bancaria:");
        add(LableCuentBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        FechaPag.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        FechaPag.setText("Fecha Pago:");
        add(FechaPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, -1));

        LabelSede.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        LabelSede.setText("Sede:");
        add(LabelSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 373, -1, -1));

        LabelCuota.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        LabelCuota.setText("Cuota:");
        add(LabelCuota, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 404, -1, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 71, 170, 274));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Actualizar Socios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jLabel1)
                .addContainerGap(357, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ButtonActAM.setBackground(new java.awt.Color(0, 51, 102));
        ButtonActAM.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonActAM.setForeground(new java.awt.Color(255, 255, 255));
        ButtonActAM.setText("Actualizar");
        ButtonActAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActAMActionPerformed(evt);
            }
        });
        add(ButtonActAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, -1));

        ButtonActN.setBackground(new java.awt.Color(0, 51, 102));
        ButtonActN.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonActN.setForeground(new java.awt.Color(255, 255, 255));
        ButtonActN.setText("Actualizar");
        ButtonActN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActNActionPerformed(evt);
            }
        });
        add(ButtonActN, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, -1));

        ButtonActAP.setBackground(new java.awt.Color(0, 51, 102));
        ButtonActAP.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonActAP.setForeground(new java.awt.Color(255, 255, 255));
        ButtonActAP.setText("Actualizar");
        ButtonActAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActAPActionPerformed(evt);
            }
        });
        add(ButtonActAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, -1));

        ButtonActD.setBackground(new java.awt.Color(0, 51, 102));
        ButtonActD.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonActD.setForeground(new java.awt.Color(255, 255, 255));
        ButtonActD.setText("Actualizar");
        ButtonActD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActDActionPerformed(evt);
            }
        });
        add(ButtonActD, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, -1, -1));

        ButtonActFN.setBackground(new java.awt.Color(0, 51, 102));
        ButtonActFN.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonActFN.setForeground(new java.awt.Color(255, 255, 255));
        ButtonActFN.setText("Actualizar");
        ButtonActFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActFNActionPerformed(evt);
            }
        });
        add(ButtonActFN, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, -1));

        ButtonActT.setBackground(new java.awt.Color(0, 51, 102));
        ButtonActT.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonActT.setForeground(new java.awt.Color(255, 255, 255));
        ButtonActT.setText("Actualizar");
        ButtonActT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActTActionPerformed(evt);
            }
        });
        add(ButtonActT, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, -1, -1));

        ButtonActCB.setBackground(new java.awt.Color(0, 51, 102));
        ButtonActCB.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonActCB.setForeground(new java.awt.Color(255, 255, 255));
        ButtonActCB.setText("Actualizar");
        ButtonActCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActCBActionPerformed(evt);
            }
        });
        add(ButtonActCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, -1));

        ButtonActFP.setBackground(new java.awt.Color(0, 51, 102));
        ButtonActFP.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonActFP.setForeground(new java.awt.Color(255, 255, 255));
        ButtonActFP.setText("Actualizar");
        ButtonActFP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActFPActionPerformed(evt);
            }
        });
        add(ButtonActFP, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, -1, -1));

        ButtonActS.setBackground(new java.awt.Color(0, 51, 102));
        ButtonActS.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ButtonActS.setForeground(new java.awt.Color(255, 255, 255));
        ButtonActS.setText("Actualizar");
        ButtonActS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActSActionPerformed(evt);
            }
        });
        add(ButtonActS, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));

        TextFechaNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFechaNacActionPerformed(evt);
            }
        });
        add(TextFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 170, -1));
        add(TextFechaPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    //Buttons para eliminar el socio deseado
    private void ButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteActionPerformed
        cs.eliminarSocio(id);
    }//GEN-LAST:event_ButtonDeleteActionPerformed

    //Butons para actualizar socios
    private void ButtonActCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActCActionPerformed
        ms.setTipoCuota((String) ComboCuota.getSelectedItem());
        cs.actTipoC(ms.getTipoCuota(), id);
    }//GEN-LAST:event_ButtonActCActionPerformed

    //Evento de selecionar un socio de la lista para que se meustren sus datos en la interfaz
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

    //Buttons para actualizar datos de socio
    private void ButtonActAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActAMActionPerformed
        if(!TextApeM.getText().isEmpty()){
            ms.setApellidoM(TextApeM.getText());
            cs.actApeM(ms.getApellidoM(), id);
        }
    }//GEN-LAST:event_ButtonActAMActionPerformed

    private void ButtonActNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActNActionPerformed
        if(!TextNombre.getText().isEmpty()){
            ms.setNombre(TextNombre.getText());
            cs.actNom(ms.getNombre(), id);
        }
    }//GEN-LAST:event_ButtonActNActionPerformed

    private void ButtonActAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActAPActionPerformed
        if(!TextApeP.getText().isEmpty()){
            ms.setApellidoP(TextApeP.getText());
            cs.actApeP(ms.getApellidoP(), id);
        }
    }//GEN-LAST:event_ButtonActAPActionPerformed

    private void ButtonActDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActDActionPerformed
        if(!TextDomicilio.getText().isEmpty()){
            ms.setDomicilio(TextDomicilio.getText());
            cs.actDomicilio(ms.getDomicilio(), id);
        }
    }//GEN-LAST:event_ButtonActDActionPerformed

    private void ButtonActFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActFNActionPerformed
        if(!TextFechaNac.getText().isEmpty()){
            ms.setFechaNac(TextFechaNac.getText());
            cs.actFechaNac(ms.getFechaNac(), id);
        }
    }//GEN-LAST:event_ButtonActFNActionPerformed

    private void ButtonActTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActTActionPerformed
        if(!TextTelefono.getText().isEmpty()){
            ms.setTelefono(TextTelefono.getText());
            cs.acttelefono(ms.getTelefono(), id);
        }
    }//GEN-LAST:event_ButtonActTActionPerformed

    private void ButtonActCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActCBActionPerformed
        if(!TextCuentaBan.getText().isEmpty()){
            ms.setCuentaBnacaria(TextCuentaBan.getText());
            cs.actCuenBan(ms.getCuentaBnacaria(), id);
        }
    }//GEN-LAST:event_ButtonActCBActionPerformed

    private void ButtonUpdate8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUpdate8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonUpdate8ActionPerformed

    private void ButtonActFPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActFPActionPerformed
        if(!TextFechaPag.getText().isEmpty()){
            ms.setFechPago(TextFechaPag.getText());
            cs.actFechaPag(ms.getFechPago(), id);
        }
    }//GEN-LAST:event_ButtonActFPActionPerformed

    private void ButtonActSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActSActionPerformed
        ms.setIdSede((String) ComboSede.getSelectedItem());
        cs.actSede(ms.getIdSede(), id);
    }//GEN-LAST:event_ButtonActSActionPerformed

    private void TextFechaNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFechaNacActionPerformed
        if(!TextFechaNac.getText().isEmpty()){
            ms.setFechaNac(TextFechaNac.getText());
            cs.actFechaNac(ms.getFechaNac(), id);
        }
    }//GEN-LAST:event_TextFechaNacActionPerformed

    private void TextTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextTelefonoActionPerformed

    }//GEN-LAST:event_TextTelefonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonActAM;
    private javax.swing.JButton ButtonActAP;
    private javax.swing.JButton ButtonActC;
    private javax.swing.JButton ButtonActCB;
    private javax.swing.JButton ButtonActD;
    private javax.swing.JButton ButtonActFN;
    private javax.swing.JButton ButtonActFP;
    private javax.swing.JButton ButtonActN;
    private javax.swing.JButton ButtonActS;
    private javax.swing.JButton ButtonActT;
    private javax.swing.JButton ButtonDelete;
    private javax.swing.JButton ButtonUpdate8;
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
    private javax.swing.JFormattedTextField TextFechaNac;
    private javax.swing.JFormattedTextField TextFechaPag;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
