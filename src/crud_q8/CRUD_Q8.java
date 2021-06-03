/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_q8;
import java.sql.SQLException;

/**
 *
 * @author Luiz Pereira
 */
public class CRUD_Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        // TODO code application logic here
        Jogos jogofunc = new Jogos();
        jogofunc.ListarJogos();
    }
    
}
