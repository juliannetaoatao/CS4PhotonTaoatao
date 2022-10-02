/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03photontaoatao;

/**
 *
 * @author julia
 */
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    public Singer(String name, int noOfPerformance, double earnings, Song favoriteSong){
        this.name = name;
        this.noOfPerformances = noOfPerformance;
        this.earnings = earnings;
        this.favoriteSong = favoriteSong;
    }
    
    public void checkInfo(){
        System.out.printf("Singer: %s Performed %d times and  earned %.2f\nThe song performed was %s, from %s, released %d\n", 
                name, noOfPerformances, earnings, favoriteSong.title, favoriteSong.album, favoriteSong.date);
    }
    public void performForAudience(int numberOfPeople){
        noOfPerformances += numberOfPeople;
        earnings += 100*numberOfPeople;
    }
    
    public void changeFavSong(String title, String album, int date){
        favoriteSong = new Song(title, album, date);
    }
}
