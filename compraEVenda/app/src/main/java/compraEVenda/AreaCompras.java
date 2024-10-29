/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compraEVenda;


import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class AreaCompras {
    
    Scanner sc;
    ArrayList<Produto> produtos = new ArrayList<>();
    ArrayList<Produto> carrinho = new ArrayList<>();
    float dinheiro = 10000;
    
    public AreaCompras(){
        produtos.add(new Alimento("Arroz", 20, 23, "12/12/26"));
        produtos.add(new Eletronico("Celular",999,15));
        produtos.add(new Limpeza("Sabonete",3,28,"30/01/2027"));
        produtos.add(new Mobilia("Mesa",590,12));
        produtos.add(new Vestimenta("Uma meia",3,33,"G"));
        sc = new Scanner(System.in);
    }
    
     
    public void menuInicial(){
        
        boolean teste = true;
            while(teste){

            System.out.println("|----------------------------------|");
            System.out.println("|          menu de compras         |");
            System.out.println("|----------------------------------|");
            System.out.println("| 0. sair                          |");
            System.out.println("| 1. Ver perfil                    |");
            System.out.println("| 2. Adicionar produto ao carrinho |");
            System.out.println("| 3. Remover do carrinho           |");
            System.out.println("| 4. Finalizar compra              |");
            System.out.println("| 5. Ver notas                     |");
            System.out.println("|----------------------------------|");

            System.out.println("Qual a opcao desejada?");
            int opcao = sc.nextInt();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            switch(opcao){
                case 0:
                    teste = false;
                    break;
                case 1:
                    System.out.println("Dinheiro: "+ dinheiro);
                    break;
                case 2:
                    selecionarProduto();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }
        
    }
    
    public void selecionarProduto(){
        for(int i = 0; i < produtos.size(); i++){
            System.out.println("indice: " + i);
            System.out.println(produtos.get(i));
        }
        System.out.println("Selecione o produto do carrinho pelo indice: ");
        int indiceEscolhido = sc.nextInt();
        
        if(indiceEscolhido >= 0 && indiceEscolhido < produtos.size()){
            System.out.println("Indice invalido");
        } else{
            
            Produto produtoFind;
            System.out.println("Quantos deseja?");
            int quantidadeEscolhida = sc.nextInt();
            
            
            for(int i = 0; i< produtos.size(); i++){
                if(i == indiceEscolhido){
                    if(produtos.get(i).quantidade <= quantidadeEscolhida && quantidadeEscolhida > 0){
                        if(produtos.get(i).temDinheiro(quantidadeEscolhida, dinheiro)){
                            produtoFind = produtos.get(i);
                        } else{
                            System.out.println("Voce nao tem dinheiro o suficiente.");
                        }
                        
                    } else{
                        System.out.println("Quantidade invalida.");
                    }
                    
                }
            }
        }
    }
}
