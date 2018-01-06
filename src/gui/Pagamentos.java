package gui;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * #Rodrigo de Lima Bispo
 *
 * #Login.java
 */
public class Pagamentos extends javax.swing.JFrame {

    public Pagamentos() {
        initComponents();
        // Chama o método do banco de dados iniciarBD
        iniciarBD();
        // Define a quantidade de caracteres permitidos por campo de texto
        tftitulo.setDocument(new Letras(60));
        tfbanco.setDocument(new Letras(16));
        tfagencia.setDocument(new Numeros(16));
        tfconta.setDocument(new Numeros(16));
        tfsenha.setDocument(new Letras(30));
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tftitulo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfbanco = new javax.swing.JTextField();
        tfconta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfagencia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Pesquisar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        tfsenha = new javax.swing.JPasswordField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Remember Why");
        setResizable(false);
        setSize(new java.awt.Dimension(640, 380));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/9.png"))); // NOI18N
        logo.setFocusable(false);
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        sair.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/10.png"))); // NOI18N
        sair.setFocusPainted(false);
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        getContentPane().add(sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 100, 40));

        menu_superior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/2.png"))); // NOI18N
        menu_superior.setText("jLabel1");
        menu_superior.setFocusable(false);
        getContentPane().add(menu_superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 680, 80));

        ajuda.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/7.png"))); // NOI18N
        ajuda.setFocusPainted(false);
        ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajudaActionPerformed(evt);
            }
        });
        getContentPane().add(ajuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 190, 40));

        seguranca.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        seguranca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/6.png"))); // NOI18N
        seguranca.setFocusPainted(false);
        seguranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segurancaActionPerformed(evt);
            }
        });
        getContentPane().add(seguranca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 190, 40));

        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/4.png"))); // NOI18N
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 190, 40));

        pagamentos.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        pagamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/3.png"))); // NOI18N
        pagamentos.setFocusPainted(false);
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
        sites_apps.setFocusPainted(false);
        sites_apps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sites_appsActionPerformed(evt);
            }
        });
        getContentPane().add(sites_apps, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 190, 40));

        menu_lateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/1.png"))); // NOI18N
        menu_lateral.setText("Menu Lateral");
        getContentPane().add(menu_lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setText("Bancos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 80, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, 20, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Informações da conta");
        jLabel4.setRequestFocusEnabled(false);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, -1));

        tftitulo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(tftitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 600, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Conta:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel7.setText("de Bancos");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 580, -1, -1));

        tfbanco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(tfbanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 290, 30));

        tfconta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfconta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcontaActionPerformed(evt);
            }
        });
        getContentPane().add(tfconta, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, 140, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Agência:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, -1, -1));

        tfagencia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(tfagencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 130, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Senha:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, -1));

        Pesquisar.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        Pesquisar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pesquisar.setText("Pesquisar");
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(Pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 120, 30));

        jButton3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton3.setText("Incluir / Atualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, -1, 30));

        jButton4.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 110, 30));

        jButton2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton2.setText(">>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 520, 60, 30));

        jButton5.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton5.setText("<<");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, 60, 30));

        jButton6.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton6.setText("<");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, 60, 30));

        tfsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfsenhaActionPerformed(evt);
            }
        });
        getContentPane().add(tfsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 310, 30));

        jButton7.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton7.setText(">");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 520, 60, 30));

        jButton8.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton8.setText("Excluir");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, 100, 30));

        jButton9.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton9.setText("Ver tudo");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 100, 30));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Banco:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel11.setText("Navegue aqui entre as senhas");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, -1, -1));

        jButton10.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton10.setText("Limpar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 100, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Título:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("*");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 20, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("*");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 20, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("*");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 20, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("*");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 20, -1));

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

        // Inicia a tela de Registros e fecha a janela bancos pelo botão "Registros"
        Registros obj = new Registros();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_sites_appsActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed

        // Inicia a tela de login e fecha a janela bancos pelo botão "Sair"
        Login1 obj = new Login1();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_sairActionPerformed

    private void pagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagamentosActionPerformed

        // Inicia a tela de SitesApps e fecha a janela bancos pelo botão "Sites / Apps"
        SitesApps obj = new SitesApps();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_pagamentosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Inicia a tela de Bancos e volta a janela de Bancos pelo botão "Bancos"
        Pagamentos obj = new Pagamentos();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void segurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segurancaActionPerformed

        // Inicia a tela de Segurança e fecha a janela bancos pelo botão "Segurança"
        Segurança obj = new Segurança();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_segurancaActionPerformed

    private void ajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajudaActionPerformed

        // Inicia a tela de Ajuda e fecha a janela bancos pelo botão "Ajuda"
        Ajuda obj = new Ajuda();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_ajudaActionPerformed

    private void tfcontaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcontaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcontaActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        // Inicia a tela de Registros e fecha a janela bancos pelo botão "Ver tudo"
        Registros obj = new Registros();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        // Inicia a tela inicial e fecha a janela bancos pelo botão "Cancelar"
        Tela_Inicial obj = new Tela_Inicial();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        // Condição Se para verificar se campo de texto "TÍTULO" foi preenchido 
        if (tftitulo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo 'TÍTULO' está vazio!");
            return;
        }

        // Condição Se para verificar se campo de texto "BANCO" foi preenchido 
        if (tfbanco.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo 'BANCO' está vazio!");
            return;
        }

        // Condição Se para verificar se campo de texto "AGENCIA" foi preenchido 
        if (tfagencia.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo 'AGENCIA' está vazio!");
            return;
        }

        // Condição Se para verificar se campo de texto "CONTA" foi preenchido 
        if (tfconta.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo 'CONTA' está vazio!");
            return;
        }

        // Condição Se para verificar se campo de texto "SENHA" foi preenchido 
        if (tfsenha.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo 'SENHA' está vazio!");
            return;
        }

        // Recebe os dados digitados pelo usuário e armazena em variáveis do tipo String
        String titulo = tftitulo.getText();
        String banco = tfbanco.getText();
        String agencia = tfagencia.getText();
        String conta = tfconta.getText();
        String senha = tfsenha.getText();

        // Criptografia Base64 das variáveis do conteúdo digitado gerando novas variáveis do tipo String
        String codbanco = Base64.getEncoder().encodeToString(banco.getBytes());
        String codagencia = Base64.getEncoder().encodeToString(agencia.getBytes());
        String codconta = Base64.getEncoder().encodeToString(conta.getBytes());
        String codsenha = Base64.getEncoder().encodeToString(senha.getBytes());

        // Circundar Instrução com try-catch quando existe conexão com o banco de dados
        try {
            // Comando insert na tabela bancos para inserir os dados criptografados no banco de dados
            stmt.executeUpdate("insert into ROOT.bancos values ('" + titulo + "', '" + codbanco + "', '" + codagencia + "', '" + codconta + "', '" + codsenha + "' ) ");
            JOptionPane.showMessageDialog(this, "Sucesso!");

            // Define a quantidade de caracteres permitidos por campo de texto
            tftitulo.setDocument(new Letras(60));
            tfbanco.setDocument(new Letras(16));
            tfagencia.setDocument(new Numeros(16));
            tfconta.setDocument(new Numeros(16));
            tfsenha.setDocument(new Letras(30));
            tftitulo.requestFocus();

            // fecha a tela anterior e abre a janela Bancos
            Pagamentos obj = new Pagamentos();
            obj.setVisible(true);
            dispose();

        } catch (SQLException e) {
            try {
                // Comando update na tabela bancos para alterar os dados criptografados no banco de dados
                stmt.executeUpdate("update ROOT.bancos set banco =  '" + codbanco + "', agencia =  '" + codagencia + "', conta =  '" + codconta + "', senha =  '" + codsenha + "' where titulo = '" + titulo + "' ");
                JOptionPane.showMessageDialog(this, "Sucesso!");
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialog(null, "Registro não incluído!");
                JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        // Circundar Instrução com try-catch quando existe conexão com o banco de dados
        try {
            // Recebe o título digitado pelo usuário na variável tipo String
            String titulo = JOptionPane.showInputDialog(this, "Digite o 'TÍTULO' a deletar:");

            // Condição Se para verificar se campo de texto "TÍTULO" foi preenchido 
            if (titulo.equals("")) {
                JOptionPane.showMessageDialog(this, "O campo 'TÍTULO' está vazio!");
                return;
            }

            // Comando delete na tabela siteapps para deletar o registro de senha correspondente a variável titulo
            stmt.executeUpdate("delete from ROOT.BANCOS where TITULO = ('" + titulo + "') ");
            JOptionPane.showMessageDialog(this, "Registro deletado ou inexistente!");

            // Define a quantidade de caracteres permitidos por campo de texto
            tftitulo.setDocument(new Letras(60));
            tfbanco.setDocument(new Letras(16));
            tfagencia.setDocument(new Numeros(16));
            tfconta.setDocument(new Numeros(16));
            tfsenha.setDocument(new Letras(30));
            tftitulo.requestFocus();

            // fecha a tela anterior e abre a janela Pagamentos
            Pagamentos obj = new Pagamentos();
            obj.setVisible(true);
            dispose();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed

        // Circundar Instrução com try-catch quando existe conexão com o banco de dados
        try {
            // Recebe o título digitado pelo usuário na variável tipo String
            String tituloAux = JOptionPane.showInputDialog(this, "Digite o 'TÍTULO' a pesquisar:");

            // Condição Se para verificar se campo de texto "TÍTULO" foi preenchido 
            if (tituloAux.equals("")) {
                JOptionPane.showMessageDialog(this, "O campo 'TÍTULO' está vazio!");
                return;
            }

            // Resultset rs recebe o resultado da consulta select na tabela bancos coluna titulo
            ResultSet rs = stmt.executeQuery("select * from ROOT.bancos where titulo = ('" + tituloAux + "') ");

            if (rs.next()) {

                // Recebe da tabela bancos os dados das colunas e armazena em variáveis do tipo String
                String banco = rs.getString("banco");
                String agencia = rs.getString("agencia");
                String conta = rs.getString("conta");
                String senha = rs.getString("senha");

                // Array de bytes Base64 para descriptografar as variáveis vindas do banco de dados 
                byte[] codbanco = Base64.getDecoder().decode(banco);
                String decodbanco = new String(codbanco);
                byte[] codagencia = Base64.getDecoder().decode(agencia);
                String decodagencia = new String(codagencia);
                byte[] codconta = Base64.getDecoder().decode(conta);
                String decodconta = new String(codconta);
                byte[] codsenha = Base64.getDecoder().decode(senha);
                String decodsenha = new String(codsenha);

                // Posicionamento do titulo e das variáveis descriptografadas nos campos de texto
                tftitulo.setText(rs.getString("titulo"));
                tfbanco.setText(decodbanco);
                tfagencia.setText(decodagencia);
                tfconta.setText(decodconta);
                tfsenha.setText(decodsenha);

                JOptionPane.showMessageDialog(this, "Registro encontrado!");
            } else {
                JOptionPane.showMessageDialog(this, "Registro Não encontrado!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_PesquisarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        // Chama o método primeiro por meio do botão "<<"
        primeiro();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        // Chama o método anterior por meio do botão "<"
        anterior();

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        // Chama o método proximo por meio do botão ">"
        proximo();

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        // Chama o método ultimo por meio do botão ">>"
        ultimo();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void tfsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfsenhaActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        // Limpa e define a quantidade de caracteres permitidos por campo de texto
        tftitulo.setDocument(new Letras(60));
        tfbanco.setDocument(new Letras(16));
        tfagencia.setDocument(new Numeros(16));
        tfconta.setDocument(new Numeros(16));
        tfsenha.setDocument(new Letras(30));
        tftitulo.requestFocus();
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(Pagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pesquisar;
    private javax.swing.JButton ajuda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel menu_lateral;
    private javax.swing.JLabel menu_superior;
    private javax.swing.JButton pagamentos;
    private javax.swing.JButton sair;
    private javax.swing.JButton seguranca;
    private javax.swing.JButton sites_apps;
    private javax.swing.JTextField tfagencia;
    private javax.swing.JTextField tfbanco;
    private javax.swing.JTextField tfconta;
    private javax.swing.JPasswordField tfsenha;
    private javax.swing.JTextField tftitulo;
    // End of variables declaration//GEN-END:variables

    // Declarar variáveis de Conexão, Statement e ResultSet para conexão com o banco de dados
    private java.sql.Connection con;
    private java.sql.Statement stmt;
    private java.sql.Statement stmtNavegar;
    private java.sql.ResultSet rsNavegar;

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
            stmt = con.createStatement();
            stmtNavegar = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            // Variáveis ResultSet recebem a instrução select das tabelas siteapps e bancos por meio do Statement
            rsNavegar = stmtNavegar.executeQuery("select * from ROOT.Bancos");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());

        }
    }

    class Letras extends PlainDocument {

        // Declaração de variável tamanho do tipo inteiro
        int tam = 0;

        public Letras(int a) {
            this.tam = a;

        }

        // Utilização da biblioteca PlainDocument e badLocationException para limitar a quantidade de caracteres nos campos de texto
        @Override
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
            int tamanho = (this.getLength() + str.length());
            if (tamanho <= tam) {
                super.insertString(offs, str, a);
            } else {
                super.insertString(offs, str.replaceAll("[aA0-zZ9]", ""), a);
            }
        }

    }

    class Numeros extends PlainDocument {

        // Declaração de variável tamanho do tipo inteiro
        int tam = 0;

        public Numeros(int a) {
            this.tam = a;

        }

        // Utilização da biblioteca PlainDocument e badLocationException para ter somente numeros nos campos de texto
        @Override
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
            int tamanho = (this.getLength() + str.length());
            if (tamanho <= tam) {
                super.insertString(offs, str.replaceAll("[aA-zZ]", ""), a);
            } else {
                super.insertString(offs, str.replaceAll("[aA0-zZ9]", ""), a);
            }
        }

    }

    public void mostrarDados() {
        try {

            // Recebe da tabela siteapps os dados das colunas e armazena em variáveis do tipo String
            String banco = rsNavegar.getString("banco");
            String agencia = rsNavegar.getString("agencia");
            String conta = rsNavegar.getString("conta");
            String senha = rsNavegar.getString("senha");

            // Array de bytes Base64 para descriptografar as variáveis vindas do banco de dados
            byte[] codbanco = Base64.getDecoder().decode(banco);
            String decodbanco = new String(codbanco);
            byte[] codagencia = Base64.getDecoder().decode(agencia);
            String decodagencia = new String(codagencia);
            byte[] codconta = Base64.getDecoder().decode(conta);
            String decodconta = new String(codconta);
            byte[] codsenha = Base64.getDecoder().decode(senha);
            String decodsenha = new String(codsenha);

            // Posicionamento do titulo e das variáveis descriptografadas nos campos de texto
            tftitulo.setText(rsNavegar.getString("titulo"));
            tfbanco.setText(decodbanco);
            tfagencia.setText(decodagencia);
            tfconta.setText(decodconta);
            tfsenha.setText(decodsenha);

        } catch (SQLException ex) {

        }
    }

    public void primeiro() {

        // Circundar Instrução com try-catch quando existe conexão com o banco de dados
        try {
            // Estrutura de condição If para chamar o método mostrarDados de acordo com o posicionamento do cursor rsNavegar
            if (rsNavegar.first()) {
                mostrarDados();
            } else {

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Nenhum registro encontrado!");
        }

    }

    public void anterior() {

        // Circundar Instrução com try-catch quando existe conexão com o banco de dados
        try {
            // Estrutura de condição If para chamar o método mostrarDados de acordo com o posicionamento do cursor rsNavegar
            if (!rsNavegar.isFirst()) {
                rsNavegar.previous();
            }
            mostrarDados();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Nenhum registro encontrado!");
        }

    }

    public void proximo() {

        // Circundar Instrução com try-catch quando existe conexão com o banco de dados
        try {
            // Estrutura de condição If para chamar o método mostrarDados de acordo com o posicionamento do cursor rsNavegar
            if (!rsNavegar.isLast()) {
                rsNavegar.next();
            }
            mostrarDados();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Nenhum registro encontrado!");
        }

    }

    public void ultimo() {

        // Circundar Instrução com try-catch quando existe conexão com o banco de dados
        try {
            // Estrutura de condição If para chamar o método mostrarDados de acordo com o posicionamento do cursor rsNavegar
            if (rsNavegar.last()) {
                mostrarDados();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Nenhum registro encontrado!");
        }

    }

}
