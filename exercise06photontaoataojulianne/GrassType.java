/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise06photontaoataojulianne;

/**
 *
 * @author julia
 */
public class GrassType extends SimpleMonster{
    public GrassType(String n, int m, int base){
        super(n, "grass", "water", "fire", m, base, base);

    }
    
    public void rest(){
        hp += maxHP/2;
    }   
    
    @Override
    public void special(){
        super.special();
        hp += maxHP*.20;
    }
}
