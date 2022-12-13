/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2_1stmockexam;

/**
 *
 * @author julia
 */
public class Band {
    protected String name;
    protected Venue selectedVenue;
    protected int popularity, performances;

    public Band(String s, int p){
        name = s;
        popularity = p;
        performances = 0;
    }
    
    public int getPopularity(){
        return popularity;
    }
    public void reserve(Venue v){
        if(v.checkAvailability()){
            v.reserve();
            selectedVenue = v;
        }
    }
    public void perform(){
        if(selectedVenue != null){
            selectedVenue.hostEvent();
            selectedVenue = null;
            popularity += 5;
            performances++;
        }
    }
}

