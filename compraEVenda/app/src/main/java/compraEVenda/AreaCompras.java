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

    public AreaCompras() {
        produtos.add(new Alimento("Arroz", 20, 23, "12/12/26"));
        produtos.add(new Eletronico("Celular", 999, 15));
        produtos.add(new Limpeza("Sabonete", 3, 28, "30/01/2027"));
        produtos.add(new Mobilia("Mesa", 590, 12));
        produtos.add(new Vestimenta("Uma meia", 3, 33, "G"));
        sc = new Scanner(System.in);
    }

    public void menuInicial() {

        boolean teste = true;
        while (teste) {
            
            System.out.println(" __________________________________ ");
            System.out.println("|          menu de compras         |");
            System.out.println("|----------------------------------|");
            System.out.println("| 0. sair                          |");
            System.out.println("| 1. Ver perfil                    |");
            System.out.println("| 2. Adicionar produto ao carrinho |");
            System.out.println("| 3. Ver carrinho                  |");
            System.out.println("| 4. Remover do carrinho           |");
            System.out.println("| 5. Finalizar compra              |");
            System.out.println("|________Escolha uma opcao:________|");
            int opcao = sc.nextInt();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            switch (opcao) {
                case 0:
                    teste = false;
                    break;
                case 1:
                    System.out.println("Dinheiro: RS" + dinheiro);
                    break;
                case 2:
                    selecionarProduto();
                    break;
                case 3:
                    for(int i = 0; i < carrinho.size();i++){
                        System.out.println(carrinho.get(i).getProduto() + "|Total = RS"+ carrinho.get(i).precoTotal());
                    }
                    System.out.println("Total no carrinho: RS"+ dinheiroNoCarrinho());
                    
                    break;
                case 4:
                    for(int i = 0; i < carrinho.size();i++){
                        System.out.println("Indice de "+ carrinho.get(i).nome +": " + i);
                        System.out.println(carrinho.get(i).getProduto());
                    }
                    
                    int indiceEscolhido = sc.nextInt();
                    
                    if (indiceEscolhido < 0 && indiceEscolhido >= carrinho.size()) {
                        System.out.println("Indice invalido");
                    } else {
                        System.out.println(carrinho.get(indiceEscolhido).nome + " removido com sucesso");
                        carrinho.remove(indiceEscolhido);
                    }
                    break;
                case 5:
                    System.out.println("Tem certeza que deseja realizar esta compra? [ 1- sim/ 0- nao]");
                    int confirmacao = sc.nextInt();
                    
                    if(confirmacao == 0){
                        System.out.println("Compra cancelada");
                    } else{
                       dinheiro -= dinheiroNoCarrinho();
                       for(int i = 0; i< produtos.size(); i++){
                           for(int j = 0; j < carrinho.size(); j++){
                               if(carrinho.get(j).nome == produtos.get(i).nome){
                                  produtos.get(i).quantidade -= carrinho.get(j).quantidade;
                               }
                           }
                           
                       }
                       carrinho.clear();
                       
                       System.out.println("Compra realizada com sucesso!");
                    }
                    break;
            }
        }

    }

    private void selecionarProduto() {
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println("indice: " + i);
            System.out.println(produtos.get(i).getProduto());
        }
        System.out.println("\nSelecione o produto do carrinho pelo indice: ");
        int indiceEscolhido = sc.nextInt();

        if (indiceEscolhido < 0 && indiceEscolhido >= produtos.size()) {
            System.out.println("Indice invalido");
        } else {

            Produto produtoFind;
            System.out.println("Quantos deseja? maximo de " + produtos.get(indiceEscolhido).compraMaxima(dinheiro - dinheiroNoCarrinho()));
            int quantidadeEscolhida = sc.nextInt();

            if (produtos.get(indiceEscolhido).quantidade >= quantidadeEscolhida && quantidadeEscolhida > 0) {
                if (produtos.get(indiceEscolhido).temDinheiro(quantidadeEscolhida, dinheiro - dinheiroNoCarrinho())) {
                    produtoFind = produtos.get(indiceEscolhido).clone();
                    produtoFind.quantidade = quantidadeEscolhida;
                    carrinho.add(produtoFind);
                    System.out.println("Produto adicionado com sucesso!");
                } else {
                    System.out.println("Voce nao tem dinheiro o suficiente.");
                }
            } else {
                System.out.println("Quantidade invalida.");
            }

        }
    }
    
    private float dinheiroNoCarrinho(){
        float retorno = 0;
        for(int i =0; i < carrinho.size(); i++){
            retorno += carrinho.get(i).precoTotal();
        }
        return retorno;
    }
    
}

