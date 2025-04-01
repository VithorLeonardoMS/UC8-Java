/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoavaliativo.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class ProdutoDAO {
    public static boolean registrarProduto(String nome, String descricao, float preco, int quantidade) {
        String sql = "INSERT INTO produtos (nome, descricao, preco, quantidade) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexao.conectarProdutos();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, descricao);
            stmt.setFloat(3, preco);
            stmt.setInt(4, quantidade);
            stmt.executeUpdate();
            
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<Produto> listarProdutos(){
        ArrayList<Produto> produtos = new ArrayList<>();
        
        String sql = "SELECT * FROM produtos";

        try (Connection conn = Conexao.conectarProdutos();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                produtos.add(new Produto(rs.getInt("id"), rs.getString("nome"),rs.getString("descricao"), rs.getFloat("preco"),rs.getInt("quantidade")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
        }
    

    public static boolean deletarProduto(int id){
        ArrayList<Produto> produtos = new ArrayList<>();
        
        String sql = "DELETE FROM produtos where id = ? ";
 
        try (Connection conn = Conexao.conectarProdutos();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
        
    }

    public static void atualizarProduto(int id, String nomeDaColuna, String valor){
        
        List<String> colunasPermitidas = Arrays.asList("nome","descricao", "preco", "quantidade");
        
        if (!colunasPermitidas.contains(nomeDaColuna.toLowerCase())) {
            System.out.println("Coluna inválida!");
            return;
        }
        
        String sql = "UPDATE produtos \n" +
                     "SET "+ nomeDaColuna +" = ? \n" +
                     "WHERE id = ?;";
        
        try (Connection conn = Conexao.conectarProdutos();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            if(!nomeDaColuna.toLowerCase().trim().equals("id")){
                stmt.setString(1, valor);
            }
            stmt.setInt(2, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
