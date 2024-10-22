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
        return "\nMago: \n Ataque basico: Utiliza suas magias para sugar a vitalidade do inimigo causando " + this.dano +" de dano. \n Ataque especial: (vampiragem )Usa uma dentadura de vampiro para roubar 10 de vida do inimigo para si, precisa esperar 2 turnos, ja que a dentadura foi comprada na shopee.";
    }
    
    @Override
    public String nomeAtaqueEspecial(){
        return "\nVampiragem";
    }
    
    public boolean ataqueEspecial(Personagem oponente){
        if(turno == 0){
            this.vida += 10;
            oponente.vida -= 10;
            System.out.print("\n ~ Usou 'Vampiragem', causando 10 de dano e curando 10 de vida");
            this.fimTurno();
            turno += 2;
            return true;
        } else {
            return false;
        }
    }
    
}
