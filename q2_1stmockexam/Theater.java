/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2_1stmockexam;

/**
 *
 * @author julia
 */
public class Theater extends Venue{
    private int numStages;

    public Theater(String n, String l, double v, int num){
        name = n;
        location = l;
        value = v;
        numStages = num;
    }

    @Override
    public String getName(){
        return name;
    }
    @Override
    public String getLocation(){
        return location;
    }
    @Override
    public double getValue(){
        return value;
    }

    @Override
    public boolean checkAvailability() {
        if(numStages > 0) return true;
        
        else return false;
        
    }
    @Override
    public void reserve() {
        numStages -= 1;
    }

    @Override
    public void hostEvent() {
        numStages += 1;
    }
}
