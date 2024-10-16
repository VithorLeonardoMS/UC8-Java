/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameWar;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class Personagem {
    public String nome;
    public int vida;
    public int dano;
    public int turno = 0;
    
    public Personagem(String nome, int vida, int dano){
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }
    
    public void atacar(Personagem oponente){
        oponente.vida -= this.dano;
    }
    
    public boolean estaVivo(){
        boolean retorno = true;
        if(vida <= 0){
            return false;
        }
        return retorno;
    }
    
}
