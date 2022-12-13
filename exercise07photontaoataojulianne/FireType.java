/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise07photontaoataojulianne;

/**
 *
 * @author julia
 */
public class FireType extends Monster{
    public FireType(String n, int m, int base){ //n: name, m: HP value, base: base value 
        super(n, "fire", "grass", "water", m, base);
        atk *= 1.3;
        def *= 0.7;
    }
    
    @Override
    public void special(){
        atk += 2;
        hp -= maxHP*.10;
    }
}
