/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04photontaoatao;

/**
 *
 * @author julia
 */
public class User {
    private String name;
    private int age;
    private double height;
    
    public User(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    
    public void print(){
        System.out.printf("Hi my name is %s. I am %d years old and %.2fcm tall\n", name, age, height);
    }
    //object 1:
        /*String member1 = "Lalaine";
        int member1Age = 51;
        double member1Height = 162.56;
        
        //object 2;
        String member2 = "Christian";
        int member2Age = 49;
        double member2Height = 167.64;
       
        //object 3;
        String member3 = "Carlos";
        int member3Age = 21;
        double member3Height = 172.72;*/
    
    
}