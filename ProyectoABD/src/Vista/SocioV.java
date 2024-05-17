package Vista;

public class SocioV extends javax.swing.JFrame {

    public SocioV() {
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
        PanelT = new javax.swing.JDesktopPane();
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

        PanelT.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout PanelTLayout = new javax.swing.GroupLayout(PanelT);
        PanelT.setLayout(PanelTLayout);
        PanelTLayout.setHorizontalGroup(
            PanelTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 762, Short.MAX_VALUE)
        );
        PanelTLayout.setVerticalGroup(
            PanelTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );

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
        UpdateDeleteS.add(jMenuItem5);

        jMenuBarSocios.add(UpdateDeleteS);

        MenuCuota.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MenuCuota.setText("Resgistrar Cuota");

        MenuPago.setText("Realizar pago");
        MenuCuota.add(MenuPago);

        jMenuBarSocios.add(MenuCuota);

        MenuVer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MenuVer.setText("Ver Socios");

        MenuTabla.setText("Ver Tabla ");
        MenuVer.add(MenuTabla);

        jMenuBarSocios.add(MenuVer);

        setJMenuBar(jMenuBarSocios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Actions
    private void UpdateDeleteSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateDeleteSActionPerformed

    }//GEN-LAST:event_UpdateDeleteSActionPerformed

    private void MenuRS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRS1ActionPerformed
       ResgistrarS rs = new ResgistrarS();
       PanelT.add(rs);
       rs.setVisible(true);
    }//GEN-LAST:event_MenuRS1ActionPerformed

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
            java.util.logging.Logger.getLogger(SocioV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SocioV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SocioV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SocioV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SocioV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCuota;
    private javax.swing.JMenuItem MenuPago;
    private javax.swing.JMenuItem MenuRS1;
    private javax.swing.JMenuItem MenuTabla;
    private javax.swing.JMenu MenuVer;
    private javax.swing.JDesktopPane PanelT;
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
    // End of variables declaration//GEN-END:variables
}
