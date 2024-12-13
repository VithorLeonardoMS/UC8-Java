/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class CriarTabela {
    public static void criarTabelaUsusarios(Connection conexao){
        String sql = "CREATE TABLE IF NOT EXISTS usuarios ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "nome TEXT NOT NULL,"
                + "email TEXT NOR NULL)";
        
        try(Statement stmt = conexao.createStatement()){
            stmt.execute(sql);
            System.out.println("Tabela 'usuarios' criada ou ja existente.");
        } catch(Exception e){
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }
}