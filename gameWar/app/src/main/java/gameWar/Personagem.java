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
    public int venenoTurnos = 0;
    public int danoVeneno = 0;
    
    public Personagem(String nome, int vida, int dano){
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }
    
    private void setPersonagem(int vida, int dano){
        this.vida = vida;
        this.dano = dano;
    }
    
    public String getStatus(){
        String restante = "";
        if(this.venenoTurnos > 0){
        restante = "\n    Envenenado por " + venenoTurnos + " turnos";
        }
        if(this.vida < 0){
        this.vida = 0;
        }
        
        return "---------------------------\nStatus de " + this.nome + ": \n    Vida: " + vida + "\n    Ataque: " + dano + "\n    Turnos para o ataque especial: " + this.turno + restante + "\n";
    }
    
    public String nomeAtaqueEspecial(){
        return "Nao tem";
    }
    
    public String info(){
        return "Personagem que não faz nada";
    }
    
    public void atacar(Personagem oponente){
        oponente.vida -= this.dano;
        System.out.print(" ~ Causou " + this.dano + " pontos de dano com seu ataque basico\n");
        fimTurno();
    }
    
    public boolean estaVivo(){
        boolean retorno = true;
        if(vida <= 0){
            return false;
        }
        return retorno;
    }
    
    public void setNome(String nomeNovo){
        this.nome = nomeNovo;
    }
    
    public void fimTurno(){
        if(venenoTurnos > 0){
            venenoTurnos--;
            vida -= danoVeneno;
            System.out.print(" ~ Recebeu " + this.danoVeneno + " de dano por envenenamento\n");
            if(venenoTurnos == 0){
                danoVeneno = 0;
            }
        }
        if(turno > 0){
            turno--;
        }
    }
    /**
     * Se o ataque estiver carregado e for executado retorna true
     * @param oponente
     * @return 
     */
    public boolean ataqueEspecial(Personagem oponente){
       return false; 
    }
    
    public Personagem clone(){
        Personagem retorno = new Personagem(this.nome, 90,10);
        
        if(this instanceof Mago){
            retorno = new Mago(this.nome);
        }else if(this instanceof Guerreiro){
            retorno = new Guerreiro(this.nome);
        }else if(this instanceof Arqueiro){
            retorno = new Arqueiro(this.nome);
        }
        retorno.setPersonagem(this.vida, this.dano);
        return retorno;
        
    }
}
