/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q2_1stmockexam;

/**
 *
 * @author julia
 */
public class BandTour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stadium s = new Stadium("SHB304", "Pisay", 30);
        Theater t = new Theater("SM", "QC", 80, 8);
        IndieBand newBand = new IndieBand("hello", 50, "Pisay");
        newBand.reserve(t);
        newBand.perform();
        System.out.println(newBand.getPopularity());
        newBand.reserve(s);
        newBand.perform();
        System.out.println(newBand.getPopularity());
    }
    
}
