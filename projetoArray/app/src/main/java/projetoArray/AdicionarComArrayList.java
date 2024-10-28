/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoArray;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */

import java.util.ArrayList;

public class AdicionarComArrayList {
    public static void main(String[] args){
        ArrayList < Integer > numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        
        numeros.remove(2);
                
       System.out.println(numeros);
       
       numeros.get(3);
       
       numeros.remove(0);
       
       numeros.set(0, 99);
       
       System.out.println(numeros);
    }
}
