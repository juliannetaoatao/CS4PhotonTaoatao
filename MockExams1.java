/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mockexams1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 *
 * @author julia
 */
public class MockExams1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a WaterTank homeTank with the owner "John", 1000 funds, and 0 amountFilled. (2pts)
        WaterTank homeTank = new WaterTank("John", 1000);
        // Create a WaterStation tap with the name "Tap", rate of 1.5/L, and 0 earnings. (2pts)
        WaterStation tap = new WaterStation("Tap", 1.5);
        // Create a WaterStation mw with the name "Manila Water", rate of 8/L, and 0 earnings. (2pts)
        WaterStation mw = new WaterStation("Manila Water", 8);
        // Create a WaterStation maynilad with the name "Maynilad", rate of 6.5/L and 0 earnings. (2pts)
        WaterStation maynilad = new WaterStation("Maynilad", 6.5);
        // Add all the WaterStations to an ArrayList called stationList. (2pts)
        ArrayList<WaterStations> stationList = new ArrayList<>();
        stationList.add(tap);
        stationList.add(mw);
        stationList.add(maynilad);
        
        // Write a loop that ends when the homeTank has been filled to more than 100L or when the user types "exit". (2pts)
        new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        while(homeTank.getAmountFilled()<100){
            System.out.print("Indicate the name of the waterstation;")
        }
        // Inside the loop:
        // 	*Ask the user for input regarding which water station the homeTank will be filled at (or "exit"). (2pts)
        // 		>Prints "No such water station called <input>." if user input does not match. (1pt)
        // 	*Ask the user for input regarding how much the homeTank will be filled using the given water station. (2pts)
        // 	*Have the homeTank filled using the information given (2pts)
        // When the loop ends, display the stats of homeTank and the water stations. (1pt)
    }
    
}
