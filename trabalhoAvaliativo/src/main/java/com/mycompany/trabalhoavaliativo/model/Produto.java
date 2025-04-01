/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoavaliativo.model;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private float preco;
    private int quantidade;

    public Produto(int id, String nome, String descricao, float preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public void atualizar(String nomeDaColuna, String valor){
        ProdutoDAO.atualizarProduto(this.id,nomeDaColuna, valor);
    }

    public int getId() {
        return id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public void deletar(){
        ProdutoDAO.deletarProduto(id);
    }
}
