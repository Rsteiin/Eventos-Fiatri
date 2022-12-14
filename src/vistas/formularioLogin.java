
package vistas;

import entidades.Usuario;
import javax.swing.JOptionPane;
import logicaNegocio.lnUsuario;

public class formularioLogin extends javax.swing.JFrame {

    public formularioLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Gerente = new javax.swing.JRadioButton();
        JefePersonal = new javax.swing.JRadioButton();
        Chef = new javax.swing.JRadioButton();
        JefeBodega = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        jPanel6 = new javax.swing.JPanel();
        ingresar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoFiatri.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 660, 480));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Ingresar como:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 120, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Gerente");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Jefe de Personal");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Chef");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Jefe de Bodega:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        Gerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenteActionPerformed(evt);
            }
        });
        jPanel4.add(Gerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        JefePersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JefePersonalActionPerformed(evt);
            }
        });
        jPanel4.add(JefePersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        Chef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChefActionPerformed(evt);
            }
        });
        jPanel4.add(Chef, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        JefeBodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JefeBodegaActionPerformed(evt);
            }
        });
        jPanel4.add(JefeBodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 380, 260));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Usuario:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel5.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 160, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Contrase??a:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));
        jPanel5.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 160, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 289, 380, 100));

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ingresar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ingresar.setText("Ingresar");
        ingresar.setEnabled(false);
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        jPanel6.add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 100, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 401, 376, 70));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 400, 480));

        jPanel1.add(jPanel2, "card2");

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerenteActionPerformed

        Gerente.setSelected(true);
        JefePersonal.setSelected(false);
        Chef.setSelected(false);
        JefeBodega.setSelected(false);
        txtUsuario.setEditable(true);
        txtContrasena.setEditable(true);
        ingresar.setEnabled(true);
    }//GEN-LAST:event_GerenteActionPerformed

    private void JefePersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JefePersonalActionPerformed
        Gerente.setSelected(false);
        JefePersonal.setSelected(true);
        Chef.setSelected(false);
        JefeBodega.setSelected(false);
        txtUsuario.setEditable(true);
        txtContrasena.setEditable(true);
        ingresar.setEnabled(true);
    }//GEN-LAST:event_JefePersonalActionPerformed

    private void ChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChefActionPerformed
        Gerente.setSelected(false);
        JefePersonal.setSelected(false);
        Chef.setSelected(true);
        JefeBodega.setSelected(false);
        txtUsuario.setEditable(true);
        txtContrasena.setEditable(true);
        ingresar.setEnabled(true);
    }//GEN-LAST:event_ChefActionPerformed

    private void JefeBodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JefeBodegaActionPerformed
        Gerente.setSelected(false);
        JefePersonal.setSelected(false);
        Chef.setSelected(false);
        JefeBodega.setSelected(true);
        txtUsuario.setEditable(true);
        txtContrasena.setEditable(true);
        ingresar.setEnabled(true);
    }//GEN-LAST:event_JefeBodegaActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        if(Gerente.isSelected()){
            lnUsuario logica = new lnUsuario();
            Usuario ent = new Usuario();
            ent.setUsuarioUsuario(txtUsuario.getText());
            ent.setContrasenaUsuario(txtContrasena.getText());
            ent.setTipoUsuario("Gerente");
            boolean existe = logica.accesoSistema(ent);
            if(existe==true){
            menuPrincipal mp = new menuPrincipal();
            mp.setSize(1600, 1000);
            mp.setLocationRelativeTo(null);
            mp.setVisible(true);
            this.dispose();
            }else{
                JOptionPane.showMessageDialog(null,"Usuario o contrase??a incorrecta","Acceso Denegado",JOptionPane.ERROR_MESSAGE);
                this.setVisible(true);
            }
        }

    }//GEN-LAST:event_ingresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(JOptionPane.showConfirmDialog(null,"??Seguro desea salir ahora del sistema?", "SALIR AHORA", JOptionPane.YES_NO_OPTION)==0){
            System.exit(0);

        }else{

            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(formularioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formularioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formularioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formularioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formularioLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Chef;
    private javax.swing.JRadioButton Gerente;
    private javax.swing.JRadioButton JefeBodega;
    private javax.swing.JRadioButton JefePersonal;
    private javax.swing.JButton ingresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
