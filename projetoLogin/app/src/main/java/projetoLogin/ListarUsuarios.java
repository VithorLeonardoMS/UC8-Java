/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoLogin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class ListarUsuarios {
    
        public static String listarUsuarios(Connection conexao){
        String sql = "SELECT * FROM usuarios";
        String retorno = " ____________________\n";
               retorno += "| ID | Nome | Senha |\n";
               retorno += "|-------------------|\n";
        try(Statement stmt = conexao.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            
            
            while(rs.next()){
                retorno += "| " + rs.getInt("id") + " | " + rs.getString("nome") + " | " + rs.getString("senha") + " |\n";
            }
            
        }catch(Exception e){
            System.out.println("Erro ao listar usuarios: " + e.getMessage());
        }
        retorno += "---------------------\n";
        return retorno;
    }
    
}
