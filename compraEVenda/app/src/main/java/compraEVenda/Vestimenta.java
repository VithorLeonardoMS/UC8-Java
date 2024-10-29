/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compraEVenda;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class Vestimenta extends Produto{
    
    public String tamanho;    
    
    public Vestimenta(String name, float price, int quantity, String sise){
        super(name, price, quantity);
        tamanho = sise;
    }
    
    @Override
    public String getProduto(){
        return "";
    }
}
