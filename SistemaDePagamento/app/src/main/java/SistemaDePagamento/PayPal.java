/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDePagamento;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class PayPal implements Pagamento{
    public String email;
    
    public PayPal(String email){
        this.email = email;
    }
    
    @Override
    public void procesarPagamento(double valor){
        System.out.println("Pagamento de R$"+ valor +"via PayPal");
    }
    
    @Override
    public String obterDetalhes(){
        return "Email: " + email;
    }
}
