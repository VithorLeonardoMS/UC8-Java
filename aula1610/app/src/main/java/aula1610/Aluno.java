/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1610;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class Aluno {
    private String nome;
    private String curso;
    private int matricula;
    
    public Aluno(String nome, String curso, int matricula){
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }
    
    public String getAluno(){
        return "Nome: " + this.nome + "\nCurso: " + this.curso + "\nMatricula: " + this.matricula;
    }
}
