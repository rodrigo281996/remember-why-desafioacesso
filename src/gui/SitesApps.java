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
public class SitesApps extends javax.swing.JFrame {

    public SitesApps() {
        initComponents();
        // Chama o método do banco de dados iniciarBD
        iniciarBD();
        // Define a quantidade de caracteres permitidos por campo de texto
        tftitulo.setDocument(new Letras(45));
        tfsite.setDocument(new Letras(45));
        tfemail.setDocument(new Letras(45));
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
        jLabel2 = new javax.swing.JLabel();
        tfsite = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tftitulo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfemail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfnotas = new javax.swing.JTextPane();
        tfsenha = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Atualizar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
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

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setText("Sites / Apps");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        tfsite.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(tfsite, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 300, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel4.setText("de Sites / Apps");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 650, -1, -1));

        tftitulo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tftitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftituloActionPerformed(evt);
            }
        });
        getContentPane().add(tftitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 280, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("*");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 20, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Endereço do site ou APP:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("E-mail ou nome de usuário:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        tfemail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(tfemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 280, 30));

        tfnotas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(tfnotas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 600, 140));
        getContentPane().add(tfsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 300, 30));

        jButton2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton2.setText("Incluir / Atualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, -1, 30));

        jButton3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton3.setText(">");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 590, 60, 30));

        Atualizar.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        Atualizar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Atualizar.setText("Excluir");
        Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(Atualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 100, 30));

        jButton5.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton5.setText("Limpar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 100, 30));

        jButton4.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton4.setText("Ver tudo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 100, 30));

        jButton6.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton6.setText("Pesquisar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 120, 30));

        jButton7.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton7.setText("<");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 590, 60, 30));

        jButton8.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton8.setText("<<");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 590, 60, 30));

        jButton9.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton9.setText(">>");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 590, 60, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Notas:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel9.setText("Navegue aqui entre as senhas");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 630, -1, -1));

        jButton10.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton10.setText("Cancelar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, -1, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Título:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("*");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 20, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("*");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 20, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("*");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 20, -1));

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

        // Inicia a tela de Registros e fecha a janela Site / Apps pelo botão "Registros"
        Registros obj = new Registros();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_sites_appsActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed

        // Inicia a tela de login e fecha a janela Site / Apps pelo botão "Sair"
        Login1 obj = new Login1();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_sairActionPerformed

    private void tftituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tftituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tftituloActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        // Condição Se para verificar se campo de texto "TÍTULO" foi preenchido 
        if (tftitulo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo 'TÍTULO' está vazio!");
            return;
        }

        // Condição Se para verificar se campo de texto "SITE" foi preenchido 
        if (tfsite.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo 'SITE ou APP' está vazio!");
            return;
        }

        // Condição Se para verificar se campo de texto "EMAIL" foi preenchido 
        if (tfemail.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo 'EMAIL' está vazio!");
            return;
        }

        // Condição Se para verificar se campo de texto "SENHA" foi preenchido 
        if (tfsenha.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo 'SENHA' está vazio!");
            return;
        }

        // Recebe os dados digitados pelo usuário e armazena em variáveis do tipo String
        String titulo = tftitulo.getText();
        String site = tfsite.getText();
        String email = tfemail.getText();
        String senha = tfsenha.getText();
        String notas = tfnotas.getText();

        // Criptografia Base64 das variáveis do conteúdo digitado gerando novas variáveis do tipo String
        String codsite = Base64.getEncoder().encodeToString(site.getBytes());
        String codemail = Base64.getEncoder().encodeToString(email.getBytes());
        String codsenha = Base64.getEncoder().encodeToString(senha.getBytes());
        String codnotas = Base64.getEncoder().encodeToString(notas.getBytes());

        // Circundar Instrução com try-catch quando existe conexão com o banco de dados
        try {
            // Comando insert na tabela siteapps para inserir os dados criptografados no banco de dados
            stmt.executeUpdate("insert into ROOT.siteapps values ('" + titulo + "', '" + codsite + "', '" + codemail + "', '" + codsenha + "', '" + codnotas + "' ) ");
            JOptionPane.showMessageDialog(this, "Sucesso!");

            // Define a quantidade de caracteres permitidos por campo de texto
            tftitulo.setDocument(new Letras(45));
            tfsite.setDocument(new Letras(45));
            tfemail.setDocument(new Letras(45));
            tfsenha.setDocument(new Letras(30));
            tfnotas.setText("");
            tftitulo.requestFocus();

            // fecha a tela anterior e abre a janela Site / Apps
            SitesApps obj = new SitesApps();
            obj.setVisible(true);
            dispose();

        } catch (SQLException e) {
            try {
                // Comando update na tabela siteapps para alterar os dados criptografados no banco de dados
                stmt.executeUpdate("update ROOT.siteapps set site =  '" + codsite + "', email =  '" + codemail + "', senha =  '" + codsenha + "', notas =  '" + codnotas + "' where titulo = '" + titulo + "' ");
                JOptionPane.showMessageDialog(this, "Sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Registro não incluído!");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        // Chama o método proximo por meio do botão ">"
        proximo();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void pagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagamentosActionPerformed

        // Inicia a tela de SitesApps e volta a janela de SitesApps pelo botão "Site / Apps"
        SitesApps obj = new SitesApps();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_pagamentosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Inicia a tela de Bancos e fecha a janela SitesApps pelo botão "Bancos"
        Pagamentos obj = new Pagamentos();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void segurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segurancaActionPerformed

        // Inicia a tela de Segurança e fecha a janela SitesApps pelo botão "Segurança"
        Segurança obj = new Segurança();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_segurancaActionPerformed

    private void ajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajudaActionPerformed

        // Inicia a tela de Ajuda e fecha a janela SitesApps pelo botão "Ajuda"
        Ajuda obj = new Ajuda();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_ajudaActionPerformed

    private void AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarActionPerformed

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
            stmt.executeUpdate("delete from ROOT.SITEAPPS where TITULO = ('" + titulo + "') ");
            JOptionPane.showMessageDialog(this, "Registro deletado ou inexistente!");

            // Define a quantidade de caracteres permitidos por campo de texto
            tftitulo.setDocument(new Letras(45));
            tfsite.setDocument(new Letras(45));
            tfemail.setDocument(new Letras(45));
            tfsenha.setDocument(new Letras(30));
            tfnotas.setText("");
            tftitulo.requestFocus();

            // fecha a tela anterior e abre a janela Site / Apps
            SitesApps obj = new SitesApps();
            obj.setVisible(true);
            dispose();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Cancelado!");
        }
    }//GEN-LAST:event_AtualizarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        // Limpa e define a quantidade de caracteres permitidos por campo de texto
        tftitulo.setDocument(new Letras(45));
        tfsite.setDocument(new Letras(45));
        tfemail.setDocument(new Letras(45));
        tfsenha.setDocument(new Letras(30));
        tfnotas.setText("");
        tftitulo.requestFocus();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        // Inicia a tela de Registros e fecha a janela SitesApps pelo botão "Ver tudo"
        Registros obj = new Registros();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        // Circundar Instrução com try-catch quando existe conexão com o banco de dados
        try {
            // Recebe o título digitado pelo usuário na variável tipo String
            String tituloAux = JOptionPane.showInputDialog(this, "Digite o 'TÍTULO' a pesquisar:");

            // Condição Se para verificar se campo de texto "TÍTULO" foi preenchido 
            if (tituloAux.equals("")) {
                JOptionPane.showMessageDialog(this, "O campo 'TÍTULO' está vazio!");
                return;
            }

            // Resultset rs recebe o resultado da consulta select na tabela siteapps coluna titulo
            ResultSet rs = stmt.executeQuery("select * from ROOT.SITEAPPS where titulo = ('" + tituloAux + "') ");

            // Estrutura de condição If para posicionar o ponteiro enquanto existirem dados no rs se a condição for verdadeira
            if (rs.next()) {

                // Recebe da tabela siteapps os dados das colunas e armazena em variáveis do tipo String
                String site = rs.getString("site");
                String email = rs.getString("email");
                String senha = rs.getString("senha");
                String notas = rs.getString("notas");

                // Array de bytes Base64 para descriptografar as variáveis vindas do banco de dados 
                byte[] codsite = Base64.getDecoder().decode(site);
                String decodsite = new String(codsite);
                byte[] codemail = Base64.getDecoder().decode(email);
                String decodemail = new String(codemail);
                byte[] codsenha = Base64.getDecoder().decode(senha);
                String decodsenha = new String(codsenha);
                byte[] codnotas = Base64.getDecoder().decode(notas);
                String decodnotas = new String(codnotas);

                // Posicionamento do titulo e das variáveis descriptografadas nos campos de texto
                tftitulo.setText(rs.getString("titulo"));
                tfsite.setText(decodsite);
                tfemail.setText(decodemail);
                tfsenha.setText(decodsenha);
                tfnotas.setText(decodnotas);

                JOptionPane.showMessageDialog(this, "Registro encontrado!");
            } else {
                JOptionPane.showMessageDialog(this, "Registro Não encontrado!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex.getMessage());
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        // Chama o método anterior por meio do botão "<"
        anterior();

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        // Chama o método primeiro por meio do botão "<<"
        primeiro();

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        // Chama o método ultimo por meio do botão ">>"
        ultimo();

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SitesApps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SitesApps().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atualizar;
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel menu_lateral;
    private javax.swing.JLabel menu_superior;
    private javax.swing.JButton pagamentos;
    private javax.swing.JButton sair;
    private javax.swing.JButton seguranca;
    private javax.swing.JButton sites_apps;
    private javax.swing.JTextField tfemail;
    private javax.swing.JTextPane tfnotas;
    private javax.swing.JPasswordField tfsenha;
    private javax.swing.JTextField tfsite;
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
            stmtNavegar = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            // Variáveis ResultSet recebem a instrução select das tabelas siteapps e bancos por meio do Statement
            rsNavegar = stmtNavegar.executeQuery("select * from ROOT.SITEAPPS");
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

    public void mostrarDados() {
        try {

            // Recebe da tabela siteapps os dados das colunas e armazena em variáveis do tipo String
            String site = rsNavegar.getString("site");
            String email = rsNavegar.getString("email");
            String senha = rsNavegar.getString("senha");
            String notas = rsNavegar.getString("notas");

            // Array de bytes Base64 para descriptografar as variáveis vindas do banco de dados
            byte[] codsite = Base64.getDecoder().decode(site);
            String decodsite = new String(codsite);
            byte[] codemail = Base64.getDecoder().decode(email);
            String decodemail = new String(codemail);
            byte[] codsenha = Base64.getDecoder().decode(senha);
            String decodsenha = new String(codsenha);
            byte[] codnotas = Base64.getDecoder().decode(notas);
            String decodnotas = new String(codnotas);

            // Posicionamento do titulo e das variáveis descriptografadas nos campos de texto
            tftitulo.setText(rsNavegar.getString("titulo"));
            tfsite.setText(decodsite);
            tfemail.setText(decodemail);
            tfsenha.setText(decodsenha);
            tfnotas.setText(decodnotas);

        } catch (SQLException ex) {

        }
    }

    public void primeiro() {

        // Circundar Instrução com try-catch quando existe conexão com o banco de dados
        try {
            // Estrutura de condição If para chamar o método mostrarDados de acordo com o posicionamento do cursor rsNavegar
            if (rsNavegar.first()) {
                mostrarDados();
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
