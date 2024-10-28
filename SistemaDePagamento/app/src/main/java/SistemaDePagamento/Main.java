/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDePagamento;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class Main {
    
    public static void main(String[] args){
        CartaoCredito cartaoCredito = new CartaoCredito("abcdefg",12345678);
        PayPal payPal = new PayPal("naoseioq@gmail.com");
        System.out.println(cartaoCredito.obterDetalhes());
        cartaoCredito.procesarPagamento(999);
        System.out.println(payPal.obterDetalhes());
        payPal.procesarPagamento(888);
    }
}
