/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compraEVenda;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class Alimento extends Produto{
    
    public String validade;
    
    public Alimento(String name, float price, int quantity, String validity){
        super(name, price, quantity);
        validade = validity;
    }
    
    @Override
    public String getProduto(){
        return "    Nome: " +nome+"| Preco: "+ preco+ "| Quantidade: " + quantidade + "| Validade: "+validade;
    }
    
    @Override
    public Produto clone(){
        return new Alimento(nome,preco,quantidade,validade);
    }
}
