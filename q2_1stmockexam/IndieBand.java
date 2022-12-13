/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2_1stmockexam;

/**
 *
 * @author julia
 */
public class IndieBand extends Band implements SelfPromoting{
    private final String origin;

    public IndieBand(String s, int p, String o){
        name = s;
        popularity = p;
        performances = 0;
        origin = o;
    }
    @Override
    public void reserve(Venue v){
        if(v.checkAvailability()){
            v.reserve();
            selectedVenue = v;
        }
    }
    
    @Override
    public void perform(){
        if(selectedVenue != null){
            selectedVenue.hostEvent();
            selectedVenue = null;
            popularity *= 2;
            performances++;
        }
    }
    
    @Override
    public void advertise(){
        popularity = performances/10;
    }
    
}
