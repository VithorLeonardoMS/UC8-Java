/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameWar;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class Arqueiro extends Personagem{
    public Arqueiro(String nome){
    super(nome,90,20);
    }
    
    @Override
    public boolean ataqueEspecial(Personagem oponente){
        if(turno == 0){
            oponente.venenoTurnos = 4;
            this.danoVeneno = 10;
            turno += 4;
            this.fimTurno();
            return true;
        } else {
            return false;
        }
        
    }
}
