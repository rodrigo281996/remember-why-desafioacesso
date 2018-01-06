package gui;

import java.sql.*;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * #Rodrigo de Lima Bispo
 *
 * #Login.java
 */
public class Login1 extends javax.swing.JFrame {

    public Login1() {
        initComponents();

    }

    public void acessarSistema() throws SQLException {

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

        // Circundar Instrução com try-catch quando existe conexão com o banco de dados
        try {
            // Chama a classe conexaoBD para estabelecer a conexão com o JavaDB 
            conexaoBD bd = new conexaoBD();
            bd.abrirConexao();

            // Chama o Statement para iniciar instruções, varivável de conexão com o banco con e ResultSet para guardar os dados
            bd.stmt = bd.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            // Instrução SQL Select na tabela usuários para a variável "sql" receber o conteúdo e armazenar no ResultSet rs 
            String sql = "SELECT * FROM USUARIOS";
            bd.rs = bd.stmt.executeQuery(sql);

            // Estrutura de repetição while para posicionar o ponteiro do ResultSet enquanto existirem dados no rs
            while (bd.rs.next()) {
                String email = bd.rs.getString("EMAIL");
                String senha = bd.rs.getString("SENHA");

                // Array de bytes Base64 para descriptografar as variáveis email e senha do banco de dados 
                byte[] codemail = Base64.getDecoder().decode(email);
                String decodemail = new String(codemail);
                byte[] codsenha = Base64.getDecoder().decode(senha);
                String decodsenha = new String(codsenha);

                // Condição se para verificar se os dados descriptografados são iguais ao dados digitados pelo usuário (usuário e senha)
                if (decodemail.equals(tfemail.getText())
                        && decodsenha.equals(tfsenha.getText())) {

                    // Inicia a tela inicial e fecha a janela de login  
                    Tela_Inicial obj = new Tela_Inicial();
                    obj.setVisible(true);
                    dispose();

                }

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        login1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        ajuda = new javax.swing.JButton();
        tfemail = new javax.swing.JTextField();
        cadastro = new javax.swing.JButton();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        tfsenha = new javax.swing.JPasswordField();

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
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        ajuda.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        ajuda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ajuda.setText("Próximo");
        ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajudaActionPerformed(evt);
            }
        });
        getContentPane().add(ajuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 190, 30));

        tfemail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfemail.setToolTipText("");
        tfemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfemailFocusGained(evt);
            }
        });
        tfemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfemailActionPerformed(evt);
            }
        });
        getContentPane().add(tfemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 270, 30));

        cadastro.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        cadastro.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cadastro.setText("Não tem cadastro? ");
        cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroActionPerformed(evt);
            }
        });
        getContentPane().add(cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 130, 30));

        txt2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txt2.setText("Entrar");
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txt3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt3.setText("Insira o usuário ou e-mail:");
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        tfsenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(tfsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 270, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajudaActionPerformed

        // Chama o método acessarSistema no botão "Próximo"
        try {
            acessarSistema();
        } catch (SQLException ex) {
            Logger.getLogger(Login1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_ajudaActionPerformed

    private void tfemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfemailActionPerformed

    }//GEN-LAST:event_tfemailActionPerformed

    private void tfemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfemailFocusGained

    }//GEN-LAST:event_tfemailFocusGained

    private void cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroActionPerformed

        // Chama a janela de cadastro ao clicar no botão "Não tem cadastro?"
        Login2 obj = new Login2();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_cadastroActionPerformed

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
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login1().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajuda;
    private javax.swing.JButton cadastro;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel login1;
    private javax.swing.JTextField tfemail;
    private javax.swing.JPasswordField tfsenha;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    // End of variables declaration//GEN-END:variables

}
