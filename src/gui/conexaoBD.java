package gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * #Rodrigo de Lima Bispo
 *
 * #Login.java
 */
public class conexaoBD {

    // Declarar variáveis de Conexão, Statement e ResultSet para conexão com o banco de dados
    public Connection con;
    public Statement stmt;
    public ResultSet rs;
    public ResultSet rs2;

    // Conexão do banco de dados bd na porta 1527
    public String url = "jdbc:derby://localhost:1527/bd";
    // Carregar driver da biblioteca "derbyclient.jar"
    public String driver = "org.apache.derby.jdbc.ClientDriver";
    // String com usuário do banco de dados
    public String user = "root";
    // String com senha do banco de dados
    public String password = "@Acesso2018";

    public void abrirConexao() {

        // Circundar Instrução com try-catch quando existe conexão com o banco de dados
        try {
            // Carregar driver da biblioteca "derbyclient.jar"
            Class.forName(driver);
            try {
                // Variável de conexão com recebe dados do banco, usuário, senha e inicia Statement para instruções
                con = DriverManager.getConnection(url, user, password);
            } catch (SQLException ex) {
                Logger.getLogger(conexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                // Variáveis de Statement recebe variável de Conexão com propriedades do ResultSet
                stmt = con.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(conexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {

        }

    }
    /**
     * public static void main(String[] args) throws SQLException,
     * InstantiationException, IllegalAccessException { conexaoBD bd = new
     * conexaoBD(); bd.abrirConexao(); }
    *
     */

}
