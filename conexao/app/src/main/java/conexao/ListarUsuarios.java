/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class ListarUsuarios {
    public static void listarUsuarios(Connection conexao){
        String sql = "SELECT * FROM usuarios";
        
        try(Statement stmt = conexao.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            System.out.println("ID | Nome | Email");
            
            while(rs.next()){
                System.out.println(rs.getInt("id") + "|" + rs.getString("nome") + "|" + rs.getString("email"));
            }
            
        }catch(Exception e){
            System.out.println("Erro ao listar usuarios: " + e.getMessage());
        }
    
}
