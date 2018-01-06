package gui;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Base64;
import javax.swing.JOptionPane;

/**
 * #Rodrigo de Lima Bispo
 *
 * #Login.java
 */
public class Login2 extends javax.swing.JFrame {

    public Login2() {
        initComponents();
        // Chama o método do banco de dados iniciarBD
        iniciarBD();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        login1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        ajuda = new javax.swing.JButton();
        tfnome = new javax.swing.JTextField();
        perdeu = new javax.swing.JButton();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        tfsenha = new javax.swing.JPasswordField();
        tfsobrenome = new javax.swing.JTextField();
        txt4 = new javax.swing.JLabel();
        txt6 = new javax.swing.JLabel();
        tfemail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

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

        login1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/login1.png"))); // NOI18N
        getContentPane().add(login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 0, 650, -1));

        txt1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt1.setText("Senha master:");
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        ajuda.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        ajuda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ajuda.setText("Próximo");
        ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajudaActionPerformed(evt);
            }
        });
        getContentPane().add(ajuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 190, 30));

        tfnome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfnome.setToolTipText("");
        tfnome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfnomeFocusGained(evt);
            }
        });
        tfnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnomeActionPerformed(evt);
            }
        });
        getContentPane().add(tfnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 270, 30));

        perdeu.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        perdeu.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        perdeu.setText("Entrar?");
        perdeu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perdeuActionPerformed(evt);
            }
        });
        getContentPane().add(perdeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 610, 130, 30));

        txt2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txt2.setText("Crie sua conta");
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txt3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt3.setText("Sobrenome:");
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        tfsenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(tfsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 270, 30));

        tfsobrenome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfsobrenome.setToolTipText("");
        tfsobrenome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfsobrenomeFocusGained(evt);
            }
        });
        tfsobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfsobrenomeActionPerformed(evt);
            }
        });
        getContentPane().add(tfsobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 270, 30));

        txt4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt4.setText("Usuário ou e-mail:");
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        txt6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt6.setText("Nome:");
        getContentPane().add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        tfemail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(tfemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 270, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("A única de que você precisa se lembrar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajudaActionPerformed

        // Condição Se para verificar se campo de texto "EMAIL" foi preenchido 
        if (tfemail.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo 'EMAIL' está vazio!");
            return;
        }

        // Condição Se para verificar se campo de texto "NOME ou APP" foi preenchido 
        if (tfnome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo 'NOME ou APP' está vazio!");
            return;
        }

        // Condição Se para verificar se campo de texto "SOBRENOME" foi preenchido 
        if (tfsobrenome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo 'SOBRENOME' está vazio!");
            return;
        }

        // Condição Se para verificar se campo de texto "SENHA" foi preenchido 
        if (tfsenha.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo 'SENHA' está vazio!");
            return;
        }

        // Armazenar conteúdo digitado pelo usuário em variáveis String
        String email = tfemail.getText();
        String nome = tfnome.getText();
        String sobrenome = tfsobrenome.getText();
        String senha = tfsenha.getText();

        // Criptografia Base64 das variáveis do conteúdo digitado gerando novas variáveis do tipo String
        String codemail = Base64.getEncoder().encodeToString(email.getBytes());
        String codnome = Base64.getEncoder().encodeToString(nome.getBytes());
        String codsobrenome = Base64.getEncoder().encodeToString(sobrenome.getBytes());
        String codsenha = Base64.getEncoder().encodeToString(senha.getBytes());

        // Circundar Instrução com try-catch quando existe conexão com o banco de dados
        try {
            // Comando insert na tabela usuarios para inserir os dados criptografados no banco de dados
            stmt.executeUpdate("insert into ROOT.usuarios values ('" + codemail + "', '" + codnome + "', '" + codsobrenome + "', '" + codsenha + "') ");
            JOptionPane.showMessageDialog(this, "Sucesso!");

            // Inicia a tela de login e fecha a janela de cadastro  
            Login1 obj = new Login1();
            obj.setVisible(true);
            dispose();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Nome de usuário já existe!");
        }

    }//GEN-LAST:event_ajudaActionPerformed

    private void tfnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnomeActionPerformed

    }//GEN-LAST:event_tfnomeActionPerformed

    private void tfnomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfnomeFocusGained

    }//GEN-LAST:event_tfnomeFocusGained

    private void perdeuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perdeuActionPerformed

        // Inicia a tela de login e fecha a janela de cadastro pelo botão "Entrar?"
        Login1 obj = new Login1();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_perdeuActionPerformed

    private void tfsobrenomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfsobrenomeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tfsobrenomeFocusGained

    private void tfsobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfsobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfsobrenomeActionPerformed

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
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Login2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajuda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel login1;
    private javax.swing.JButton perdeu;
    private javax.swing.JTextField tfemail;
    private javax.swing.JTextField tfnome;
    private javax.swing.JPasswordField tfsenha;
    private javax.swing.JTextField tfsobrenome;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt6;
    // End of variables declaration//GEN-END:variables

    // Declarar variáveis de conexão e Statement para conexão com o banco de dados
    private java.sql.Connection con;
    private java.sql.Statement stmt;

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

        // Circundar Instrução com try-catch quando existe conexão com o banco de dados
        try {
            // Variável de conexão com recebe dados do banco, usuário, senha e inicia Statement para instruções
            con = DriverManager.getConnection(url, user, pass);
            stmt = con.createStatement();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());

        }
    }
}
