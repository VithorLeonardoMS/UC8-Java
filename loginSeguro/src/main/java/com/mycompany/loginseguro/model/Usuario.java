/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginseguro.model;

public class Usuario {
    private int id;
    private String usuario;
    private String senha;

    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public int getId() { return id; }
    public String getUsuario() { return usuario; }
    public String getSenha() { return senha; }

    public void setId(int id) {this.id = id;}

    public void setUsuario(String usuario) {this.usuario = usuario;}

    public void setSenha(String senha) {this.senha = senha;}
    
}
