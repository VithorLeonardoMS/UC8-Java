/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameWar;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class Mago extends Personagem{
    
    public Mago(String nome){
    super(nome,80,25);
    }
    
    public boolean ataqueEspecial(Personagem oponente){
        if(turno == 0){
            this.vida += 15;
            oponente.vida -= 15;
            this.fimTurno();
            turno += 2;
            return true;
        } else {
            return false;
        }
    }
    
}
