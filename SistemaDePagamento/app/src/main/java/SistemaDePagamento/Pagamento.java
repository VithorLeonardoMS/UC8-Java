/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SistemaDePagamento;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public interface Pagamento {
    void procesarPagamento(double valor);
    String obterDetalhes();
}
