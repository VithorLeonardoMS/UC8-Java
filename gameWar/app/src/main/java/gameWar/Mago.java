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
    
    @Override
    public String info(){
        return "Mago: \n Ataque basico: Utiliza de suas magias desenvolvidas durante anos no sul do norte da asia europeia para dar um tiro de 12 no inimigo causando " + this.dano +" de dano. \n Ataque especial: (vampiragem )Usa uma dentadura de vampiro para roubar 10 de vida do inimigo para si, precisa esperar 2 turnos, ja que a dentadura foi comprada na shopee.";
    }
    
    @Override
    public String nomeAtaqueEspecial(){
        return "Vampiragem";
    }
    
    public boolean ataqueEspecial(Personagem oponente){
        if(turno == 0){
            this.vida += 10;
            oponente.vida -= 10;
            System.out.print(" ~ Usou 'Vampiragem' -> Recebeu +10 de vida,\n                 "+ oponente.nome +" -> -10 de vida\n ");
            this.fimTurno();
            turno += 2;
            return true;
        } else {
            return false;
        }
    }
    
}
