/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04photontaoatao;

/**
 *
 * @author julia
 */
public class Singer {
    private String name;
    private int noOfPerformances = 0;
    private double earnings;
    private Song favoriteSong;
    
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
    
    public void performForAudience(Singer otherSinger){
        System.out.printf("%s and %s");
    }
    public void changeFavSong(String title, String album, int date){
        favoriteSong = new Song(title, album, date);
    }
    
    public void setSong(Song favoriteSong, Song newFavoriteSong){
        
    }
    public static void totalPerformances(int noOfPerformances){
    }
}