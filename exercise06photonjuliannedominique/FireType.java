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
public class FireType extends SimpleMonster{
    public FireType(String n, int m, int base){
        super(n, "fire", "grass", "water", m, base*1.3, base*0.7);
    }
    
    @Override
    public void special(){
        super.special();
    }
    
}
