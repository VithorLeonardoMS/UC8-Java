/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1610;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class App {
    public static void main(String[] args){
        Livro livro = new Livro("Turma da monica","Mauricio de souza",60);
        Aluno aluno = new Aluno("Vithor","TDS",999);
        Produto produto = new Produto("Agua do banho do sor leo", 20, 120);
        
        System.out.println(livro.getLivro() + "\n");
        System.out.println(aluno.getAluno() + "\n");
        System.out.println(produto.getProduto());
    }
}
