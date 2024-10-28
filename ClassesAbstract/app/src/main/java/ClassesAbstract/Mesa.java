/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesAbstract;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class Mesa extends Mobilia{
    
    public Mesa(String cor, String material){
        super(cor,material);
    }
    
    @Override
    public void montar(){
        System.out.println("Montando a mesa de cor " + this.cor + "feita de " + this.material);
    }
}
