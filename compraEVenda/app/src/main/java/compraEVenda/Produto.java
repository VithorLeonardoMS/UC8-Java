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
        if(quantity <= 0 && quantity >= quantidade){
            retorno = false;
        } else if ((quantity * preco) > money){
            retorno = false;
        }
        return retorno;
    }
    
    public int compraMaxima(float dinheiro){
        int retorno = 0;
        boolean verificacao = true;
        while( verificacao){
            if((retorno+1) * preco <= dinheiro){
                retorno++;
            } else{
                verificacao = false;
            }
        }
        return retorno;
    }
    
    public float precoTotal(){
        return preco * quantidade;
    }
    
    public abstract String getProduto();
    
    public abstract Produto clone();
    
}
