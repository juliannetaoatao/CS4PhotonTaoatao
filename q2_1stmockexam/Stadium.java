/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2_1stmockexam;

/**
 *
 * @author julia
 */
public class Stadium extends Venue{
    private boolean reserved;

    public Stadium(String n, String l, double v){
        name = n;
        location = l;
        value = v;
        reserved = false;
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
        return reserved;
    }

    @Override
    public void reserve() {
        reserved = true;
    }

    @Override
    public void hostEvent() {
        reserved = false;
    }

}
    
