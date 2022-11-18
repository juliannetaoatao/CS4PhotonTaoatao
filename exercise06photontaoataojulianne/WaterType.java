/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise06photontaoataojulianne;

/**
 *
 * @author julia
 */
public class WaterType extends SimpleMonster{
    public WaterType(String n, int m, int base){
        super(n, "water", "fire", "grass", m, base*0.7, base*1.3);
    }
    
    @Override
    public void special(){
        super.special();
        def += 2;
        hp -= maxHP*.10;
    }
}
        
