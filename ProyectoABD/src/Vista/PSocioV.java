package Vista;

import java.awt.BorderLayout;


public class PSocioV extends javax.swing.JFrame {


    public PSocioV() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    //Codigo GUI
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jMenuBarSocios = new javax.swing.JMenuBar();
        UpdateDeleteS = new javax.swing.JMenu();
        MenuRS1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        MenuCuota = new javax.swing.JMenu();
        MenuPago = new javax.swing.JMenuItem();
        MenuVer = new javax.swing.JMenu();
        MenuTabla = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu5.setText("jMenu5");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Socios");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 460));

        jMenuBarSocios.setBackground(new java.awt.Color(0, 0, 255));
        jMenuBarSocios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBarSocios.setRequestFocusEnabled(false);

        UpdateDeleteS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        UpdateDeleteS.setText("Registrar Socios");
        UpdateDeleteS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateDeleteSActionPerformed(evt);
            }
        });

        MenuRS1.setText("Registrar");
        MenuRS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRS1ActionPerformed(evt);
            }
        });
        UpdateDeleteS.add(MenuRS1);

        jMenuItem5.setText("Actualizar/Eliminar Socio");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        UpdateDeleteS.add(jMenuItem5);

        jMenuBarSocios.add(UpdateDeleteS);

        MenuCuota.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MenuCuota.setText("Resgistrar Cuota");
        MenuCuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCuotaActionPerformed(evt);
            }
        });

        MenuPago.setText("Realizar pago");
        MenuPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPagoActionPerformed(evt);
            }
        });
        MenuCuota.add(MenuPago);

        jMenuBarSocios.add(MenuCuota);

        MenuVer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MenuVer.setText("Ver Socios");

        MenuTabla.setText("Ver Tabla ");
        MenuTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuTablaActionPerformed(evt);
            }
        });
        MenuVer.add(MenuTabla);

        jMenuBarSocios.add(MenuVer);

        setJMenuBar(jMenuBarSocios);

        pack();
    }// </editor-fold>//GEN-END:initComponents
                                    
    //Actions
    private void UpdateDeleteSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateDeleteSActionPerformed

    }//GEN-LAST:event_UpdateDeleteSActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Actualizar_EliminarS2 aes= new Actualizar_EliminarS2();
        aes.setSize(599,440);
        aes.setLocation(0,0);

        jPanel1.removeAll();
        jPanel1.add(aes, BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void MenuTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuTablaActionPerformed
        SociosT2 st= new SociosT2();
        st.setSize(599,440);
        st.setLocation(0,0);

        jPanel1.removeAll();
        jPanel1.add(st, BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();
    }//GEN-LAST:event_MenuTablaActionPerformed

    private void MenuRS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRS1ActionPerformed
        RegistrarSocios rs= new RegistrarSocios();
        rs.setSize(599,440);
        rs.setLocation(0,0);

        jPanel1.removeAll();
        jPanel1.add(rs, BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();
    }//GEN-LAST:event_MenuRS1ActionPerformed

    private void MenuPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPagoActionPerformed
        CuotaSocio2 cs= new CuotaSocio2();
        cs.setSize(599,440);
        cs.setLocation(0,0);

        jPanel1.removeAll();
        jPanel1.add(cs, BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();
    }//GEN-LAST:event_MenuPagoActionPerformed

    private void MenuCuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCuotaActionPerformed

    }//GEN-LAST:event_MenuCuotaActionPerformed

    //MAIN
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PSocioV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PSocioV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PSocioV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PSocioV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PSocioV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCuota;
    private javax.swing.JMenuItem MenuPago;
    private javax.swing.JMenuItem MenuRS1;
    private javax.swing.JMenuItem MenuTabla;
    private javax.swing.JMenu MenuVer;
    private javax.swing.JMenu UpdateDeleteS;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBarSocios;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
