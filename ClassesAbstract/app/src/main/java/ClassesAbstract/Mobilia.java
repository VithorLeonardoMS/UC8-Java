/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesAbstract;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
abstract class Mobilia {
    protected String cor;
    protected String material;
    
    public Mobilia(String cor, String material){
        this.cor = cor;
        this.material = material;
    }
    
    //Metodo abstrato(sem implementção)
    public abstract void montar();
    
    //Metodo concreto (com implementação)
    public void desmontar(){
        System.out.println("Desmontando a mobilia");
    }
}
