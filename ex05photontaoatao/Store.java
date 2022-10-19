/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex05photontaoatao;

/**
 *
 * @author julia
 */
import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
    this.name = name;
    earnings = 0;
    itemList = new ArrayList();
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
    if(index < itemList.size()){
        earnings += (itemList.get(index)).getCost();
        System.out.printf("Item %s was bought. Total earnings: %.2f\n", (itemList.get(index)).getName(), (itemList.get(index)).getCost(),earnings);
    }
    else{
        System.out.printf("There are only %d items in the store\n", itemList.size());
    }
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    boolean inItemList = false;
    for(Item i: itemList){
        if((i.getName()).equals(name)){
            inItemList = true;
            earnings += i.getCost();
            System.out.printf("Item %s was bought. Total earnings: %.2f\n", name, earnings);
            break;
        }else{
        inItemList = false;
        }
    }
    if(!inItemList){
        System.out.printf("The store does not sell %s\n", name);
    }
    
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
    boolean inItemList = itemList.contains(i);
    if(inItemList){
        earnings += i.getCost();
        System.out.println("Item " + i.getName() + " was bought. Total earnings: " + earnings);
    }
    else if(!inItemList){
        System.out.println("The store does not sell " + i.getName());
    }
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    System.out.printf("Items that belong to %s", type);
    for(Item i: itemList){
        if(i.getType().equals(type)){
            System.out.print(i.getName() + " ");
        }
    }
    System.out.print("\n");
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    System.out.printf("Items that cost lower than or equal to %.2f: ", maxCost);
    for(Item i: itemList){
        if(i.getCost()<=maxCost){
            System.out.print(i.getName() + " ");
        }
    }
    System.out.print("\n");
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    System.out.printf("Items that cost higher than or equal to %.2f: ", minCost);
    for(Item i: itemList){
        if(i.getCost()>=minCost){
            System.out.print(i.getName() + " ");
        }
    }
    System.out.print("\n");
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
        for(Store s: storeList){
            System.out.println(s.getName() + ": " + s.getEarnings());
        }
  }
}
        