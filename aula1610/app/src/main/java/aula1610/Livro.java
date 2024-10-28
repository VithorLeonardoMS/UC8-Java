/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1610;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
    
    public Livro(String titulo, String autor, int paginas){
        this.autor = autor;
        this.paginas = paginas;
        this.titulo = titulo;
    }
    
    public String getLivro(){
        return "Titulo: " + this.titulo + "\nAutor: " + this.autor + "\nN de Paginas: " + this.paginas;
    }
}
