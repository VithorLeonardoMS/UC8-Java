/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoLogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class PegarUsuario {

    public static String[] pegarNomeESenha(int id){
        String[] usuario = new String[2];
        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
        Connection conexao = conexaoSQLite.conectar();
            String sql = "SELECT * FROM usuarios WHERE id = ?";
            try(PreparedStatement pstmt = conexao.prepareStatement(sql)){
                pstmt.setInt(1,id);
                ResultSet rs = pstmt.executeQuery(sql);
                rs.next();
                usuario[0] = rs.getString("nome");
                usuario[1] = rs.getString("senha");
        }catch(Exception e){
            System.out.println("Erro ao listar usuarios: " + e.getMessage());
        } 
        return usuario;
        
    }
    
    public static String[] pegarNomeESenha(String nome){
        String[] usuario = new String[2];
        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
        Connection conexao = conexaoSQLite.conectar();
        String sql = "SELECT * FROM usuarios WHERE nome = ?";
        try(PreparedStatement pstmt = conexao.prepareStatement(sql)){
            pstmt.setString(1,nome);
            ResultSet rs = pstmt.executeQuery(sql);
            rs.next();
            usuario[0] = rs.getString("nome");
            usuario[1] = rs.getString("senha");
        }catch(Exception e){
            System.out.println("Erro ao listar usuarios: " + e.getMessage());
        }
        return usuario;
    }
    
    public static int pegarId( Connection conexao, String nome){
        int id = -1;
            String sql = "SELECT * FROM usuarios WHERE nome = ?";
        try(PreparedStatement pstmt = conexao.prepareStatement(sql)){
            pstmt.setString(1,nome);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            id = rs.getInt("id");
        }catch(Exception e){
            System.out.println("Erro ao pegar ID: " + e.getMessage());
        }
        return id;
    
    }
     
}
