/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mockexams1;

public class WaterTank {
    private String owner;
    private double funds, amountFilled;
    
    // Make a constructor for the WaterTank class that has parameters for the owner and money, and sets the amountFilled to 0 (2pts)
    public WaterTank(String owner, double funds){
        this.owner = owner;
        this.funds = funds;
        amountFilled = 0;
        
    }
    
    public String getOwner(){
        return owner;
    }
    public double getFunds(){
        return funds;
    }
    public double getAmountFilled(){
        System.out.println(amountFilled);
        return amountFilled;
    }
    public void fill(WaterStation s, double volume){
        double cost = s.getRate()*volume;
        if(funds <= cost){
            funds -= cost;
            amountFilled += volume;
            s.addEarnings(cost);
            System.out.println(owner + " spent " + cost + " and filled tank by " + volume + "L from " + s.getName() + ".");
        }
        else{
            System.out.println(owner + " didn't have enough money to fill the tank from " + s.etName() + ".");
        }
    }
    public void displayStats(){
        System.out.println("Owner: " + owner);
        System.out.println("Funds: " + funds);
        System.out.println("Amount filled: " + amountFilled);
    }
}

// Debug a WaterTank class [20pts]
// Give the WaterTank class fields for owner (String), funds (double), and amountFilled (double) in L. (2pts)
// Make a constructor for the WaterTank class that has parameters for the owner and money, and sets the amountFilled to 0 (2pts)
// Write the following methods:
//     -getOwner(): returns the owner of the WaterTank (1pt)
//     -getFunds(): returns the funds of the WaterTank (1pt)
//     -getAmountFilled(): returns the amountFilled in the WaterTank (1pt)
//     -addAmountFilled(double d): adds a value d to the amountFilled field (2pts)
//     -fill(WaterStation s, double volume): given a WaterStation s, compute the cost by multiplying its rate to the volume. Subtract the cost from the funds and add it to the earnings of WaterStation s. Add value to amountFilled. (5pts)
//             *Print "<owner> spent <x> pesos and filled tank by <x> L from <WaterStation name>." (2pts)
//             *Print "<owner> didn't have enough money to fill tank from <WaterStation name>." in case not have enough money. (3pts)
//     -displayStats(): prints fields and values of WaterTank (1pt)