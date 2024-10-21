/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameWar;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class Guerreiro extends Personagem{
    public Guerreiro(String nome){
        super(nome,100,15);
    }
   
    @Override
    public boolean ataqueEspecial(Personagem oponente){
        if(turno == 0){
            oponente.vida -= 30;
            turno += 3;
            this.fimTurno();
            return true;
        } else {
            return false;
        }
        
    }
}
