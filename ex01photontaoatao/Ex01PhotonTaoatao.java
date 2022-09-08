/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01photontaoatao;

/**
 *
 * @author PHOTON
 */
public class Ex01PhotonTaoatao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //object 1:
        String member1 = "Lalaine";
        int member1Age = 51;
        double member1Height = 162.56;
        
        //object 2;
        String member2 = "Christian";
        int member2Age = 49;
        double member2Height = 167.64;
       
        //object 3;
        String member3 = "Carlos";
        int member3Age = 21;
        double member3Height = 172.72;
        
        System.out.println("Family Members");
        
        System.out.println("Mom");
        System.out.println("Name: " + member1);
        System.out.println("Age: " + member1Age);
        System.out.println("Height: " + member1Height + "\n");
        
        System.out.println("Dad");
        System.out.println("Name: " + member2);
        System.out.println("Age: " + member2Age);
        System.out.println("Height: " + member2Height + "\n");
        
        System.out.println("Brother");
        System.out.println("Name: " + member3);
        System.out.println("Age: " + member3Age);
        System.out.println("Height: " + member3Height + "\n");
        
        //operations
        int totalAge = member1Age + member2Age + member3Age;
        Boolean isTaller = true;
        if(member1Height > member2Height){
            isTaller = true;
        }
        else{isTaller = false;}
        int ageDiff = member2Age - member3Age;
        System.out.println("Total age of the three members: " + totalAge + " //operation: addition"); 
        System.out.printf("%s is taller than %s: %b //operation: comparison\n", member1, member2, isTaller);
        System.out.printf("The age difference between %s and %s is %d //operation: subtraction\n", member2, member3, ageDiff);
        // TODO code application logic here
    }
    
}
