/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoavaliativo.controller;

import com.mycompany.trabalhoavaliativo.model.ProdutoDAO;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class ProdutoCrontroller {
    private ProdutoDAO usuarioDAO = new ProdutoDAO();

    public boolean registrarUsuario(String usuario, String senha) {
        return usuarioDAO.registrarUsuario(usuario, senha);
    }
}
