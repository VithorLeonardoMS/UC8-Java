/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoLogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class VerificarUsuario {
    
    public static boolean verificarSeUsuarioExiste(String nome){
        String sql = "SELECT nome FROM usuarios WHERE nome = ?";
        
        try(Connection conn = new ConexaoSQLite().conectar()){
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,nome); 
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                return true;
            }
            
        } catch(SQLException e ){
            System.out.println("Erro ao verificar se usuario existe:" + e.getMessage());
        }
        return false;
    }
        
        
    
}
