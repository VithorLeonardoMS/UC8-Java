/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoavaliativo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class Conexao {
    private static final String URLProdutos = "jdbc:mysql://localhost:3306/produtos";
    private static final String URLUsuarios = "jdbc:mysql://localhost:3306/usuarios";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";
    private static Connection connection;

    public static Connection conectar() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URLProdutos, USUARIO, SENHA);
                criarTabelaUsuarios();
                connection = DriverManager.getConnection(URLUsuarios, USUARIO,SENHA);
                criarTabelaProdutos();
            }
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexão com o banco de dados", e);
        }
    }

    private static void criarTabelaProdutos() {
        String sql = "CREATE TABLE IF NOT EXISTS produtos (" +
                     "id INT AUTO_INCREMENT PRIMARY KEY, " +
                     "nome VARCHAR(255) NOT NULL, " +
                     "descricao VARCHAR(255) NOT NULL), " +
                     "preco FLOAT NOT NULL, " +
                     "quantidade INT NOT NULL);";
        
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar a tabela produtos", e);
        }
    }
    
    private static void criarTabelaUsuarios(){
        String sql = "CREATE TABLE IF NOT EXISTS usuarios (" +
                     "id INT AUTO_INCREMENT PRIMARY KEY, " +
                     "usuario VARCHAR(255) NOT NULL, " +
                     "senha VARCHAR(255) NOT NULL)";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar a tabelaprodutos", e);
        }
    }
}
