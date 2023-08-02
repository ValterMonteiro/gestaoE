package com.gestaoE.gestaoE;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexao {
    private static final String driver = "org.postgresql.Driver";
    // O "meubanco" representa a minha database
    private static final String caminho = 
            "jdbc:postgresql://localhost:5432/dados";  
    // Usuario default
    private static final String usuario = "postgres"; 
    private static final String senha = "@Vms12345";
    // Responsavel por realizar a conexão com o banco de dados;
    private static Connection conexao = null;     
    public static void conectar() throws SQLException{ // Metodo responsavel por realizar a conexão;
        try {
            System.setProperty("jdbc.Drivers", driver); // Seta a propriedade do driver de conexão;
            conexao = DriverManager.getConnection(caminho, usuario, senha); // Realiza a conexão com o banco;
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }    
    public static void desconectar() throws SQLException{ // Metodo responsavel por fechar a conexão
        try {
            conexao.close(); // Fechar conexão
        } catch (SQLException ex) {
           throw new SQLException(ex);
        }
    }    
    public static Connection getConexao() throws SQLException{
        if (conexao == null) {
           try {
              conectar();
            } catch (SQLException ex) {
              throw new SQLException(ex);
            }
        }
        return conexao;
    }   
}
