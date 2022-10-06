/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04photontaoatao;

/**
 *
 * @author julia
 */
public class Song {
    private String title, album;
    private int date; 
    
    public Song(String title, String album, int date){
        this.title = title;
        this.album = album;
        this.date = date;
    }
    
    public String getTitle(){
        return title;
    }
    public String getAlbum(){
        return album;
    }
    public int getDate(){
        return date;
    }

}