/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise06photontaoataojulianne;

/**
 *
 * @author julia
 */
public class Exercise06PhotonTaoataoJulianne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("test");
        FireType charmander = new FireType("Charmander", 10, 5);
        WaterType squirtle = new WaterType("Squirtle", 10, 3);
        GrassType bulbasaur = new GrassType("bulbasaur", 10, 2);

        //Charmander vs Squirtle
        System.out.println("Charmander vs Squirtle");
        charmander.attack(squirtle);
        squirtle.attack(squirtle);
        charmander.special();
        squirtle.special();
        while(charmander.getHP() > 0 || squirtle.getHP() > 0){
            charmander.attack(squirtle);
            squirtle.attack(squirtle);
        }
        
        charmander.restoreHealth();
        squirtle.restoreHealth();
        System.out.print("\n\n");
        
        //Charmander vs Bulbasaur
        System.out.println("Charmander vs Bulbasaur");
        charmander.attack(bulbasaur);
        bulbasaur.attack(charmander);
        charmander.special();
        bulbasaur.special();
        while(charmander.getHP() > 0 || bulbasaur.getHP() > 0){
            charmander.attack(bulbasaur);
            bulbasaur.attack(charmander);
        }
        
        charmander.restoreHealth();
        bulbasaur.restoreHealth();
        System.out.print("\n\n");
        
        //Squirtle vs Bulbasaur
        System.out.println("Squirtle vs Bulbausaur");
        squirtle.attack(bulbasaur);
        bulbasaur.attack(squirtle);
        bulbasaur.special();
        charmander.special();
        while(squirtle.getHP() > 0 || bulbasaur.getHP() > 0){
            squirtle.attack(bulbasaur);
            bulbasaur.attack(squirtle);
            
        }
        
        
    }
    
}
