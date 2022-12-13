/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise07photontaoataojulianne;

/**
 *
 * @author julia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trainer julianne = new Trainer("Julianne");
        NPC helper = new NPC("Helper");
        Location cavite= new Location("Cavite");
        Monster charmander = new FireType("Charmander", 30, 6);
        
        julianne.inspect(cavite);
        julianne.inspect(helper);
        julianne.inspect(charmander);
    }
    
}
