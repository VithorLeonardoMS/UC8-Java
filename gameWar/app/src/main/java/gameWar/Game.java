/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameWar;
import java.util.Scanner;
/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class Game {
    private Mago mago;
    private Guerreiro guerreiro;
    private Arqueiro arqueiro;
    private int turno;
    private Scanner sc = new Scanner(System.in);
    
    public Game(){
        turno = 0;
        mago = new Mago("Biron");
        guerreiro = new Guerreiro("Barbaro");
        arqueiro = new Arqueiro("Rainha arqueira");
    }
    
    private void addTurno(){
        mago.turno++;
        guerreiro.turno++;
        arqueiro.turno++;
    }
    
    private void start(){
        System.out.print("----------------------");
        System.out.print("- Personagem Inicial -");
        System.out.print("----------------------");
        System.out.print("- 1. Mago            -");
        System.out.print("- 2. Guerreiro       -");
        System.out.print("- 3. Arqueiro        -");
        System.out.print("----------------------");
        
        System.out.print("Digite a opcao: ");
        int opcao = sc.nextInt();
        switch(opcao){
            case 1:
                menuMago(this.mago);
                break;
            case 2:
                menuGuerreiro(this.guerreiro);
                break;
            case 3:
                menuArqueiro(this.arqueiro);
                break;
        }
    }
    
    
}
