package gui;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * #Rodrigo de Lima Bispo
 *
 * #Login.java
 */
public class Registros extends javax.swing.JFrame {

    public Registros() {
        initComponents();
        // Chama o método do banco de dados iniciarBD
        iniciarBD();
        // Chama o método JTABLE montarTabelaSites
        montarTabelaSites();
        // Chama o método JTABLE montarTabelabancos
        montarTabelaBancos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        logo = new javax.swing.JLabel();
        sair = new javax.swing.JButton();
        menu_superior = new javax.swing.JLabel();
        ajuda = new javax.swing.JButton();
        seguranca = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        pagamentos = new javax.swing.JButton();
        sites_apps = new javax.swing.JButton();
        menu_lateral = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbancos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtsites = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

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

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/5.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 190, 40));

        pagamentos.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        pagamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/4.png"))); // NOI18N
        pagamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagamentosActionPerformed(evt);
            }
        });
        getContentPane().add(pagamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 190, 40));

        sites_apps.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        sites_apps.setForeground(new java.awt.Color(45, 62, 80));
        sites_apps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/3.png"))); // NOI18N
        sites_apps.setBorder(null);
        sites_apps.setBorderPainted(false);
        sites_apps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sites_appsActionPerformed(evt);
            }
        });
        getContentPane().add(sites_apps, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 190, 40));

        menu_lateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/1.png"))); // NOI18N
        menu_lateral.setText("Menu Lateral");
        getContentPane().add(menu_lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel1.setText("                                                                 Senhas de Bancos");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 640, 20));

        jtbancos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtbancos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Título ", "Banco", "Agência", "Conta", "Senha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbancos.setOpaque(false);
        jScrollPane1.setViewportView(jtbancos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 640, 250));

        jtsites.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtsites.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Título", "Site", "Email", "Senha", "Notas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtsites.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtsites.setOpaque(false);
        jScrollPane2.setViewportView(jtsites);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 640, 250));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel3.setText("                                                             Senhas de Sites / Apps");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 640, 20));

        jButton2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton2.setText("Incluir / Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 690, -1, -1));

        jButton3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 690, 100, -1));

        jButton5.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, 100, -1));

        jButton6.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton6.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton6.setText("Incluir / Excluir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 130, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 680, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sites_appsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sites_appsActionPerformed

        // Inicia a tela de Sites / Apps e fecha a janela Registros pelo botão "Sites / Apps"
        SitesApps obj = new SitesApps();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_sites_appsActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed

        // Inicia a tela de Login e fecha a janela Registros pelo botão "Sair"
        Login1 obj = new Login1();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_sairActionPerformed

    private void pagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagamentosActionPerformed

        // Inicia a tela de Bancos e fecha a janela Registros pelo botão "Bancos"
        Pagamentos obj = new Pagamentos();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_pagamentosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Inicia a tela de Registros e volta a janela de Registros pelo botão "Registros"
        Registros obj = new Registros();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void segurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segurancaActionPerformed

        // Inicia a tela de Segurança e fecha a janela Registros pelo botão "Segurança"
        Segurança obj = new Segurança();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_segurancaActionPerformed

    private void ajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajudaActionPerformed

        // Inicia a tela de Ajuda e fecha a janela Registros pelo botão "Ajuda"
        Ajuda obj = new Ajuda();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_ajudaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        // Inicia a Tela Inicial e fecha a janela Registros pelo botão "Cancelar"
        Tela_Inicial obj = new Tela_Inicial();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        // Inicia a tela Bancos e fecha a janela Registros pelo botão "Incluir / Excluir"
        Pagamentos obj = new Pagamentos();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        // Inicia a Tela Inicial e fecha a janela Registros pelo botão "Cancelar"
        Tela_Inicial obj = new Tela_Inicial();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        // Inicia a tela Site / Apps e fecha a janela Registros pelo botão "Incluir / Excluir"
        SitesApps obj = new SitesApps();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajuda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtbancos;
    private javax.swing.JTable jtsites;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel menu_lateral;
    private javax.swing.JLabel menu_superior;
    private javax.swing.JButton pagamentos;
    private javax.swing.JButton sair;
    private javax.swing.JButton seguranca;
    private javax.swing.JButton sites_apps;
    // End of variables declaration//GEN-END:variables

    // Declarar variáveis de Conexão, Statement e ResultSet para conexão com o banco de dados e JTABLE
    private java.sql.Connection con;
    private java.sql.Statement stmtListarSites;
    private java.sql.Statement stmtListarPagamentos;
    private ResultSet rsListarSites;
    private ResultSet rsListarBancos;

    private void iniciarBD() {
        // Circundar Instrução com try-catch quando existe conexão com o banco de dados
        try {
            // Carregar driver da biblioteca "derbyclient.jar"
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }

        // Conexão do banco de dados bd na porta 1527
        String url = "jdbc:derby://localhost:1527/bd";
        // String com usuário do banco de dados
        String user = "root";
        // String com senha do banco de dados
        String pass = "@Acesso2018";

        try {
            // Variável de conexão com recebe dados do banco, usuário, senha e inicia Statement para instruções
            con = DriverManager.getConnection(url, user, pass);

            // Variáveis de Statement recebe variável de Conexão com propriedades do ResultSet
            stmtListarSites = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stmtListarPagamentos = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            // Variáveis ResultSet recebem a instrução select das tabelas siteapps e bancos por meio do Statement
            rsListarSites = stmtListarSites.executeQuery("select * from ROOT.SITEAPPS");
            rsListarBancos = stmtListarPagamentos.executeQuery("select * from ROOT.BANCOS");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());

        }

    }

    private void montarTabelaSites() {
        try {
            // Declaração da variável linha do tipo inteiro
            int linha = 1;
            // Estrutura de repetição while para posicionar o ponteiro do ResultSet enquanto existirem dados no rs
            while (rsListarSites.next()) {

                // Recebe da tabela siteapps os dados das colunas e armazena em variáveis do tipo String
                String titulo = rsListarSites.getString("titulo");
                String site = rsListarSites.getString("site");
                String email = rsListarSites.getString("email");
                String senha = rsListarSites.getString("senha");
                String notas = rsListarSites.getString("notas");

                // Array de bytes Base64 para descriptografar as variáveis vindas do banco de dados 
                byte[] codsite = Base64.getDecoder().decode(site);
                String decodsite = new String(codsite);
                byte[] codemail = Base64.getDecoder().decode(email);
                String decodemail = new String(codemail);
                byte[] codsenha = Base64.getDecoder().decode(senha);
                String decodsenha = new String(codsenha);
                byte[] codnotas = Base64.getDecoder().decode(notas);
                String decodnotas = new String(codnotas);

                // Posicionamento das variáveis descriptografadas na JTABLE Sites / Apps, contador linha e posição da coluna
                jtsites.getModel().setValueAt(titulo, linha, 0);
                jtsites.getModel().setValueAt(decodsite, linha, 1);
                jtsites.getModel().setValueAt(decodemail, linha, 2);
                jtsites.getModel().setValueAt(decodsenha, linha, 3);
                jtsites.getModel().setValueAt(decodnotas, linha, 4);
                // Contador linha + 2 para pular uma linha entre os registros
                linha = linha + 2;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex.getMessage());
        }
    }

    private void montarTabelaBancos() {
        try {
            // Declaração da variável linha do tipo inteiro
            int linha = 1;
            // Estrutura de repetição while para posicionar o ponteiro do ResultSet enquanto existirem dados no rs
            while (rsListarBancos.next()) {

                // Recebe da tabela bancos os dados das colunas e armazena em variáveis do tipo String
                String titulo = rsListarBancos.getString("titulo");
                String banco = rsListarBancos.getString("banco");
                String agencia = rsListarBancos.getString("agencia");
                String conta = rsListarBancos.getString("conta");
                String senha = rsListarBancos.getString("senha");

                // Array de bytes Base64 para descriptografar as variáveis vindas do banco de dados 
                byte[] codbanco = Base64.getDecoder().decode(banco);
                String decodbanco = new String(codbanco);
                byte[] codagencia = Base64.getDecoder().decode(agencia);
                String decodagencia = new String(codagencia);
                byte[] codconta = Base64.getDecoder().decode(conta);
                String decodconta = new String(codconta);
                byte[] codsenha = Base64.getDecoder().decode(senha);
                String decodsenha = new String(codsenha);

                // Posicionamento das variáveis descriptografadas na JTABLE Bancos, contador linha e posição da coluna
                jtbancos.getModel().setValueAt(titulo, linha, 0);
                jtbancos.getModel().setValueAt(decodbanco, linha, 1);
                jtbancos.getModel().setValueAt(decodagencia, linha, 2);
                jtbancos.getModel().setValueAt(decodconta, linha, 3);
                jtbancos.getModel().setValueAt(decodsenha, linha, 4);
                linha = linha + 2;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
