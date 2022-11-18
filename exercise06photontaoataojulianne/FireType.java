/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise06photontaoataojulianne;

/**
 *
 * @author julia
 */
public class FireType extends SimpleMonster{
    private int atk, hp;
    public FireType(String n, int m, int base){ //n: name, m: HP value, base: base value 
        super(n, "fire", "grass", "water", m, base*1.3, base*0.7);
    }
    
    @Override
    public void special(){
        super.special();
        atk += 2;
        hp -= maxHP*.10;
    }
    
}