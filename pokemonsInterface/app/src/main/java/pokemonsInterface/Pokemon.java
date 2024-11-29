/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemonsInterface;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class Pokemon {
    String nome;
    String tipo;
    int nivel;
    String imagem;
    int xp;
    
    
    public Pokemon(String name, String type, int level, String image){
    nome = name;
    tipo = type;
    nivel = level;
    imagem = image;
    }
    
    public String getPokemon(){
        return nome + " | " + tipo + " | " + "nv" + nivel;
    }
    
    public String getPokemonSimples(){
        return nome + " | " + tipo;
    }
    
    public void addXP(int xpAdd){
        xp += xpAdd;
        if(xp >= (nivel * 10)){
            nivel++;
            xp = 0;
        }
    }
}
