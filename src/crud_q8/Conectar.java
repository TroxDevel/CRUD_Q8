/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_q8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Luiz Pereira
 */
public class Conectar {
    private Connection conexao;
    private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private String server = "localhost\\DESKTOP-P734T0I\\SQLEXPRESS";
    private String port = "1433";
    private String database = "Q7BD";
    private String usuario = "q7prova";
    private String senha = "paranormal";
    
    private String caminho = "jdbc:sqlserver://" + server + ":" + port +";databaseName=" + database;
    
    public Connection getConnection() {
        try {
            System.setProperty("jdbc.Drivers", driver);
            conexao = DriverManager.getConnection(caminho, usuario, senha);
            System.out.println("Conectado com sucesso!");
            return conexao;
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                return null;
                }
        }
        
}
