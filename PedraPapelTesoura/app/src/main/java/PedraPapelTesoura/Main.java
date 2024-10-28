/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PedraPapelTesoura;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class Main {
    
    public static void println(String valor){
        System.out.println(valor);
    }
    
    public static void main(String[] args){
        Game game = new Game();
        game.menuGame();
    }
}
