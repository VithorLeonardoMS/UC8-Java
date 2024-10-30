/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compraEVenda;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class Eletronico extends Produto{
    
    public Eletronico(String name, float price, int quantity){
        super(name, price, quantity);
    }
    
    @Override
    public String getProduto(){
        return "    Nome: " +nome+"| Preco: "+ preco+ "| Quantidade: " + quantidade;
    }
    
    @Override
    public Produto clone(){
        return new Eletronico(nome,preco,quantidade);
    }
}
