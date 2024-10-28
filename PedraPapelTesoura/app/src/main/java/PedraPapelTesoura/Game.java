/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PedraPapelTesoura;

import java.util.Scanner;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class Game {
    private Scanner scanner;
    private int pointsC = 0;
    private int pointsU = 0;
        
    public Game(){
        this.scanner = new Scanner(System.in);
    }
        public void menuGame(){
            boolean testeMenu = true;
            while(testeMenu){
                boolean opcaoValida = true;
                System.out.println("    ----------------------");
                System.out.println("    |       opcoes       |");
                System.out.println("    ----------------------");
                System.out.println("    | 0. Sair            |");
                System.out.println("    | 1. Pedra           |");
                System.out.println("    | 2. Papel           |");
                System.out.println("    | 3. tesoura         |");
                System.out.println("    ----------------------");

                System.out.println("Digite a opcao: ");
                int opcao = scanner.nextInt();
                
                int randomNum = (int) (Math.random() * 3) + 1;
                if(opcao == 0){
                    System.out.println("Jogo encerrado!");
                    testeMenu = false;
                } else{
                    System.out.println("\n\n\n\n\n\n\n");
                    switch(randomNum){
                        case 1:
                            System.out.println("- O computador escolheu Pedra.");
                            switch(opcao){
                                case 1:
                                    System.out.println("- Voce escolheu Pedra.");
                                    System.out.println("     > Empate <");
                                    break;
                                case 2:
                                    System.out.println("- Voce escolheu Papel");
                                    System.out.println("     > Voce ganhou <");
                                    pointsU++;
                                    break;
                                case 3:
                                    System.out.println("- Voce escolheu Tesoura");
                                    System.out.println("     > Voce perdeu <");
                                    pointsC++;
                                    break;
                                default:
                                    System.out.println("Opcao invalida!");
                            }
                            break;
                        case 2:
                            System.out.println("- O computador escolheu Papel");
                            switch(opcao){
                                case 1:
                                    System.out.println("- Voce escolheu Pedra");
                                    System.out.println("     > Voce perdeu <");
                                    pointsC++;
                                    break;
                                case 2:
                                    System.out.println("- Voce escolheu Papel");
                                    System.out.println("     > Empate <");
                                    break;
                                case 3:
                                    System.out.println("- Voce escolheu Tesoura");
                                    System.out.println("     > Voce ganhou <");
                                    pointsU++;
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("- O computador escolheu Pedra");
                            switch(opcao){
                                case 1:
                                    System.out.println("- Voce escolheu Pedra");
                                    System.out.println("     > Empate <");
                                    break;
                                case 2:
                                    System.out.println("- Voce escolheu Papel");
                                    System.out.println("     > Voce ganhou <");
                                    pointsU++;
                                    break;
                                case 3:
                                    System.out.println("- Voce escolheu Tesoura");
                                    System.out.println("     > Voce perdeu <");
                                    pointsC++;
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Erro em randomNum.");
                    }
                }
                    System.out.println("    Computador: " + pointsC + "|" + "Voce: " + pointsU);
            }
        }
}
