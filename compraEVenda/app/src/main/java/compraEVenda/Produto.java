/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compraEVenda;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public abstract class Produto {
    
    public String nome;
    public float preco;
    public int quantidade;
    
    public Produto(String name, float price, int quantity){
        nome = name;
        preco = price;
        quantidade = quantity;
    }
    
    public boolean temDinheiro(int quantity, float money){
        boolean retorno = true;
        if(quantity > 0 && quantity <= quantidade){

            retorno = false;
        } else{
        if(quantity * money > preco * quantidade){
            retorno = false;
            }
        }
        return retorno;
    }
    
    public abstract String getProduto();
    
}
