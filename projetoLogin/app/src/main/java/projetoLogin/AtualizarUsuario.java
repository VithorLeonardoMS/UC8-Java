/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoLogin;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class AtualizarUsuario {
    public static void atualizarUsuario(Connection conexao, int id, String novoNome, String novaSenha){
        String sql = "UPDATE usuarios SET nome = ?, senha = ? WHERE id = ?";
        
        try(PreparedStatement pstmt = conexao.prepareStatement(sql)){
            pstmt.setString(1,novoNome);
            pstmt.setString(2,novaSenha);
            pstmt.setInt(3,id);
            
            int rowsUpdated = pstmt.executeUpdate();
            
            if(rowsUpdated > 0){
                System.out.println("Usuario atualizado com sucesso!");
            } else{
                System.out.println("Nenhum usuario encontrado com ID fornecido.");
            }
        } catch(Exception e){
            System.out.println("Erro ao atualizar usuario: " + e.getMessage());
        }
    }
}
