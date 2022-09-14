/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02photontaoatao;
/**
 *
 * @author julia
 */
import java.util.Scanner;
public class Ex02PhotonTaoatao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        String startAction;
        int guessNum, guess;
        int i = 1;

        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to HIgher or Lower! What will you do?");
            System.out.println(" - Start game");
            System.out.println(" - Change settings");
            System.out.println(" - End application");
            startAction = sc.nextLine();
            
            guessNum = 3;
            int random = 3;
            
            
            do{
                //int random = (int) Math.floor(Math.random()*10) + 1;
                System.out.printf("You have %d guess(es) left. What is your guess? ", guessNum);
                guess = sc.nextInt(); //scan integer
                if(guess < random){
                    System.out.printf("Guess higher you have %d guess(es) left. What is your guess?", guessNum);
                }
                else if(guess > random){
                    System.out.printf("Guess lower! You have %d guess(es) left. What is your guess? ", guessNum);
                }
                else if(guess == random){
                    System.out.printf("You got it!");
                }
                guessNum -= 1;
            }while(guessNum > 0 || guess == random);              
            
        }while(i == 0/*startAction == "End application" user app kemekeme*/);
        
        System.out.println("Thank you for playing!");
        
        
        /**
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to HIgher or Lower! What will you do?");
        System.out.println(" - Start game");
        System.out.println(" - Change settings");
        System.out.println(" - End application");
        String startAction = sc.nextLine();
        
        do{
            if()
        }while();

         * switch(startAction){
            case "Start game":
                
                break;
            case "Change settings":
                break;
            case "End application":
                break;
        }
        * 
        **/
    }
    
}



