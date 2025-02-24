/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoLogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class DeletarUsuario {
    public static void deletarUsuario(Connection conexao, int id){
        String sql = "DELETE FROM usuarios WHERE id = ?";
        
        try(PreparedStatement pstmt = conexao.prepareStatement(sql)){
            pstmt.setInt(1,id);
            
            int rowsDeleted = pstmt.executeUpdate();
            if(rowsDeleted > 0){
                JOptionPane.showMessageDialog(null, "Usuario deletado com sucesso! ");
                System.out.println("Usuario deletado com sucesso!");
            } else{
            System.out.println("Nenhum usuario encontrado com o id fornecido.");
            }
        } catch(Exception e){
            System.out.println("Erro ao deletar usuario: " + e.getMessage());
        }
    }
}
