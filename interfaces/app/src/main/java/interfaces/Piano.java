/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class Piano implements InstrumentoMusical{
        
    @Override
    public String tocar(){
        return "O violao esta tocando";
    }
    
    @Override
    public String afinar(){
        return "O violao esta sendo afinado";
    }
}
