/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classchapter;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ODINGA
 */
public class ClassChapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your Name: ");
        String name = input.nextLine();
        
        GuessGame g1 = new GuessGame(name);
        lvl2 level2 = new lvl2();
        lvl3 level3 = new lvl3();
        Random rn = new Random();
        int n =1+ rn.nextInt(10);
        for (int i = 1; i < 6; i++) {
            g1.generateNumber(n);
            System.out.println("Guess A number between 1 and 10");
            int gun = input.nextInt();
            boolean isCorrect = g1.compareNumber(gun);
            
            if(isCorrect){
                System.out.println("Bravo!, Thats Correct");
                
                System.out.println("Welcome to lvl2");
                int n2 =1+ rn.nextInt(15);
                for (int j = 1; j < 7; j++) {
                    level2.generateNumber2(n2);
                    System.out.println("Guess A number between 1 and 15");
                    int gun2 = input.nextInt();
                    boolean isCorrect2 = level2.compareNumber2(gun2);
                    
                    if(isCorrect2){
                    System.out.println("Bravo!, Thats Correct");

                    System.out.println("Welcome to lvl3");
                    int n3 =1+ rn.nextInt(20);
                    for (int k = 1; k < 11; k++) {
                    level3.generateNumber3(n3);
                    System.out.println("Guess A number between 1 and 15");
                    int gun3 = input.nextInt();
                    boolean isCorrect3 = level3.compareNumber3(gun3);

                       if(isCorrect3){
                       System.out.println("Bravo!, Thats Correct YOU WIN!!!");
                       break;
                    }     
                      else{
                        System.out.printf("Ooops! That's wrong, %d of 10 trials \n", k);
                    }
                    level3.setTrialtime3();
                    }
                    }
                     else{
                        System.out.printf("Ooops! That's wrong, %d of 6 trials \n", j);
                    }
                    level2.setTrialtime2();
                }
                break;
            }
            else{
                System.out.printf("Ooops! That's wrong, %d of 5 trials \n", i);
            }
            g1.setTrialtime();
//            n =1+ rn.nextInt(10);   ....to reset random every try
        }
        
        System.out.printf("Played %d Time(s) Number of Wrong(s) = %d\n",g1.getTrialtime() + level2.getTrialtime2(), g1.getWrong() + level2.getWrong2());
        
    }
    
}
