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
public class Login {
    //Método que valida o login do usuário verificando se o nome e sneha est~~ao corretos.
    public static boolean validadarLogin(String usuario, String senha){
        //SQL para buscar a senha do usuário no banco de dados
        String sql = "SELECT senha FROM usuarios WHERE nome = ?";

        //Usamos um bloco try-with-resources para garantir que a conexão e o Statement serão fechados automaticamente.
        try(Connection conn = new ConexaoSQLite().conectar()){
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1,usuario); //Substitui o marcador "?" no SQL pela variável (a senha do usuário)
            
            //Executa a consulta e armazena o resultado no ResultSet
            ResultSet rs = stmt.executeQuery(); //O ResultSet contém os resultados da consulta (a senha do usuário) 
            
            //verifica se o susuário foi encontrado
            if(rs.next()){//Se o ResultSet contiver dados, significa que o usuário foi encontrado no banco
                String senhaArmazenada = rs.getString("senha"); // Recupera a senha armazenada no banco de dados
                
                //Compara a senha fornecida com a senha armazenada
                //**Atenção**: Aqui é importante usar técnicas de hashing para armazenar senhas de forma segura.
                if(senha.equals(senhaArmazenada)){//Se a senha inseridade for igual á armazenada, o login é bem-sucedido
                    System.out.println("Usuario encontrado. login realizado com sucesso.");
                    return true; // Retorna "true" indicando que o login foi validado
                } else {
                    System.out.println("Senha incorreta."); //Caso a senha não seja correta
                }
            }else{
                System.out.println("usuario não encontrado.");
            }
        } catch(SQLException e ) {
            System.out.println("Erro ao validar login:" + e.getMessage());//Exibe uma mensagem de erro, caso algo dê errado
        }
        
        return false; // Retorna "false" caso o login não tenha sido bem-sucedido
    }
}
