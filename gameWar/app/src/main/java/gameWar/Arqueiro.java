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
    public String info(){
        return "Arqueiro: \n Ataque basico: Utiliza seu arco e flexa para acertar o inimigo a distancia causando " + this.dano +" de dano. \n Ataque especial:(Flexa envenenada) Esfrega a flecha no suvaco, onde adquire fungos toxicos que envenenam o inimigo por quatro turnos causando 12 de dano por turno";
    }
    
    
    @Override
    public String nomeAtaqueEspecial(){
        return "Flexa envenenada";
    }
    
    @Override
    public boolean ataqueEspecial(Personagem oponente){
        if(turno == 0){
            oponente.venenoTurnos = 3;
            oponente.danoVeneno = 12;
            
            System.out.print(" ~ Usou 'Flexa envenenada', \n                 Oponente -> envenenado por 4 turnos\n                 Oponente -> -12 de vida");
            oponente.vida -= 12;
            this.fimTurno();
            turno += 4;
            return true;
        } else {
            return false;
        }
        
    }
}
