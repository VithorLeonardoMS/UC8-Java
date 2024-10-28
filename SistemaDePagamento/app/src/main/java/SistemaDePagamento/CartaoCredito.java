/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDePagamento;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class CartaoCredito implements Pagamento{
    public String numeroCartao;
    public int codigoSeguranca;
    
    public CartaoCredito(String numeroCartao, int  codigoSeguranca){
        this.numeroCartao = numeroCartao;
        this.codigoSeguranca = codigoSeguranca;
    }
    
    @Override
    public void procesarPagamento(double valor){
        System.out.println("Fez o pagamento de R$" + valor + ".");
    }
    
    @Override
    public String obterDetalhes(){
        return "Codigo de seguranca: "+ this.codigoSeguranca + "\nUltimos quatro numeros do cartao: " + numeroCartao.substring(numeroCartao.length() - 4);
    }
}
