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
    public String info(){
        return "Guerreiro: \n Ataque basico: Da uma espadada no inimigo, pena que a espada nao tem fio e causa " + this.dano + " de dano." + "\n Ataque especial: (Ataque violento) usa toda sua energia para desferir um ataque potente causando 40 de dano, porem bate o mindinho em uma coisa no chao e perde 8 de vida, recarrega depois de 3 turnos";
    }
    
    @Override
    public String nomeAtaqueEspecial(){
        return "Ataque violento";
    }
   
    @Override
    public boolean ataqueEspecial(Personagem oponente){
        if(turno == 0){
            oponente.vida -= 40;
            this.vida -= 8;
            System.out.print(" ~ Usou 'Ataque violento' -> Perdeu 8 de vida, \n                 "+ oponente.nome +" -> -40 de vida\n");
            this.fimTurno();
            turno += 3;
            return true;
        } else {
            return false;
        }
        
    }
}
