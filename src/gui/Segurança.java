package gui;

/**
 * #Rodrigo de Lima Bispo
 *
 * #Login.java
 */
public class Segurança extends javax.swing.JFrame {

    public Segurança() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        sair = new javax.swing.JButton();
        menu_superior = new javax.swing.JLabel();
        ajuda = new javax.swing.JButton();
        seguranca = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        pagamentos = new javax.swing.JButton();
        sites_apps = new javax.swing.JButton();
        menu_lateral = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        branco = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Remember Why");
        setResizable(false);
        setSize(new java.awt.Dimension(640, 380));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/9.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        sair.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/10.png"))); // NOI18N
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        getContentPane().add(sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 100, 40));

        menu_superior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/2.png"))); // NOI18N
        menu_superior.setText("jLabel1");
        getContentPane().add(menu_superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 680, 80));

        ajuda.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/7.png"))); // NOI18N
        ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajudaActionPerformed(evt);
            }
        });
        getContentPane().add(ajuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 190, 40));

        seguranca.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        seguranca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/6.png"))); // NOI18N
        seguranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segurancaActionPerformed(evt);
            }
        });
        getContentPane().add(seguranca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 190, 40));

        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/4.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 190, 40));

        pagamentos.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        pagamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/3.png"))); // NOI18N
        pagamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagamentosActionPerformed(evt);
            }
        });
        getContentPane().add(pagamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 190, 40));

        sites_apps.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        sites_apps.setForeground(new java.awt.Color(45, 62, 80));
        sites_apps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/5.png"))); // NOI18N
        sites_apps.setBorder(null);
        sites_apps.setBorderPainted(false);
        sites_apps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sites_appsActionPerformed(evt);
            }
        });
        getContentPane().add(sites_apps, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 190, 40));

        menu_lateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/1.png"))); // NOI18N
        menu_lateral.setText("Menu Lateral");
        getContentPane().add(menu_lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setText("Criptografia ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("criptografia nas senhas cadastradas.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("Para garantir a integridade das senhas e informações");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("armazenadas no gerenciador, utilizamos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/12.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, -1));

        branco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/8.JPG"))); // NOI18N
        getContentPane().add(branco, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 680, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sites_appsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sites_appsActionPerformed

        // Inicia a tela de Registros e fecha a janela Segurança pelo botão "Registros"
        Registros obj = new Registros();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_sites_appsActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed

        // Inicia a tela de login e fecha a janela Segurança pelo botão "Sair"
        Login1 obj = new Login1();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_sairActionPerformed

    private void pagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagamentosActionPerformed

        // Inicia a tela de SitesApps e fecha a janela Segurança pelo botão "Sites / Apps"
        SitesApps obj = new SitesApps();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_pagamentosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Inicia a tela de Bancos e fecha a janela Segurança pelo botão "Bancos"
        Pagamentos obj = new Pagamentos();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void segurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segurancaActionPerformed

        // Inicia a tela de Segurança e volta a janela de Segurança pelo botão "Segurança"
        Segurança obj = new Segurança();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_segurancaActionPerformed

    private void ajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajudaActionPerformed

        // Inicia a tela de Ajuda e fecha a janela Segurança pelo botão "Ajuda"
        Ajuda obj = new Ajuda();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_ajudaActionPerformed

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
            java.util.logging.Logger.getLogger(Segurança.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Segurança.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Segurança.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Segurança.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Segurança().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajuda;
    private javax.swing.JLabel branco;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel menu_lateral;
    private javax.swing.JLabel menu_superior;
    private javax.swing.JButton pagamentos;
    private javax.swing.JButton sair;
    private javax.swing.JButton seguranca;
    private javax.swing.JButton sites_apps;
    // End of variables declaration//GEN-END:variables
}
