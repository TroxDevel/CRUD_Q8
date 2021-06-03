/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_q8;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author Luiz Pereira
 */
public class Jogos {
    private Connection conexao;
    public Jogos(){
        Conectar conn = new Conectar();
        conexao = conn.getConnection();
    }
    
    public void ListarJogos() throws SQLException {
        Statement stmt = conexao.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Jogo");
        while (rs.next()) {
            System.out.println("Exibindo jogos: ");
            System.out.println ("Id: " + rs.getInt("id") + " - " + "Nome : " + rs.getString("NomeDoJogo") + " - " + "Idade: " + rs.getInt("IdadeDoJogo") + " - " + "Categoria: " + rs.getInt("CategoriaDoJogo"));
        }
    }
    
    public void NovoJogo(int id, String nome, int idade, int cat) throws
            SQLException {
        Statement stmt = conexao.createStatement();
        String SQL = "INSERT Jogo "+ " (id, NomeDoJogo, IdadeDoJogo, CategoriaDoJogo) "+ " VALUES(" +id + ",'" +nome + ",'" +idade + ",'" +cat + "’)";
        stmt.executeUpdate(SQL);
        System.out.println("Jogo adicionado com sucesso!!");
        }
    
    
    public void ApagarJogoID(int id) throws
            SQLException {
        Statement stmt = conexao.createStatement();
        String SQL = " DELETE FROM Jogo "+ " WHERE id = " + id;
        stmt.executeUpdate(SQL);
        System.out.println("Jogo removido com sucesso!!");
        }
    
       public void ApagarJogoNome(String nome) throws
               SQLException {
           Statement stmt = conexao.createStatement();
           String SQL = " DELETE FROM Jogo "+ " WHERE NomeDoJogo = " + nome;
           stmt.executeUpdate(SQL);
           System.out.println("Jogo removido com sucesso!!");
           }
       
       public void ApagarJogoCat(int cat) throws
               SQLException {
           Statement stmt = conexao.createStatement();
           String SQL = " DELETE FROM Jogo "+ " WHERE CategoriaDoJogo = " + cat;
           stmt.executeUpdate(SQL);
           System.out.println("Jogo removido com sucesso!!");
           }
    
}
