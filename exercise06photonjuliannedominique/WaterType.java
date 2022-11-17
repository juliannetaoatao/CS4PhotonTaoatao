/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise06photonjuliannedominique;

import java.util.ArrayList;

/**
 *
 * @author PHOTON
 */
public class WaterType extends SimpleMonster{
    public WaterType(String n, int m, int base){
        super(n, "water", "fire", "grass", m, base*0.7, base*1.3);
    }
    
    @Override
    public void special(){
        super.special();
    }
}
        
