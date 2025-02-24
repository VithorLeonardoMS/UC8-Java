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
public class InserirUsuario {
     public static boolean inserirUsuario(Connection conexao, String nome, String senha){
        String sql = "INSERT INTO usuarios (nome, senha) VALUES(?,?)";
        
        if(!VerificarUsuario.verificarSeUsuarioExiste(nome)){
            try(PreparedStatement pstmt = conexao.prepareStatement(sql)){
                pstmt.setString(1,nome);
                pstmt.setString(2, senha);
                pstmt.executeUpdate();
                System.out.println("Usuario inserido com sucesso!");
                return true;
            } catch(Exception e){
                System.out.println("Erro ao inserir usuario: " + e.getMessage());
            } 
            
        } 
        return false;
        
    }
}
