/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradleproject0810;

import java.util.Scanner;
/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class Player {
    private String name;
    
    public Player(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        this.name = sc.nextLine();
    }
    
    public String getName(){
        return name;
    }
}
