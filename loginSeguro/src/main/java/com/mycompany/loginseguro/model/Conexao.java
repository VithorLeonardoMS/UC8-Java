/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginseguro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/usuarios";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";
    private static Connection connection;

    public static Connection conectar() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, USUARIO, SENHA);
                criarTabela();
            }
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexão com o banco de dados", e);
        }
    }

    private static void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS usuarios (" +
                     "id INT AUTO_INCREMENT PRIMARY KEY, " +
                     "usuario VARCHAR(255) NOT NULL, " +
                     "senha VARCHAR(255) NOT NULL)";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar a tabela", e);
        }
    }
}
