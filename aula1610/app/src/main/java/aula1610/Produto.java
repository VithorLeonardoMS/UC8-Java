/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1610;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class Produto {
    private String nome;
    private float preco; 
    private int quantidade;
    
    public Produto(String nome, float preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public String getProduto(){
        return "Nome: " + this.nome + "\nPreco unidade: " + this.preco + "\nQuantidade: " + this.quantidade + "\nPreco total: RS" + this.valorTotal();
    }
    
    public float valorTotal(){
        return this.quantidade * this.preco;
    }
}
