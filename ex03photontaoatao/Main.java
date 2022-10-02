/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03photontaoatao;

/**
 *
 * @author julia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User lt = new User("Lalaine", 51, 162.56);
        User ct = new User("Christian", 49, 167.64);
        User cjt = new User("Carlos", 21, 172.72);
        
        lt.print();
        ct.print();
        cjt.print();
        
        Singer ben = new Singer("Ben&ben", 0, 0, new Song("Fall", "Limasawa Street", 2020));
        ben.checkInfo();
        ben.performForAudience(12);
        ben.changeFavSong("Pasalubong", "Pebble House Vol.1", 2021);
        ben.checkInfo();
        
    }
    
}
