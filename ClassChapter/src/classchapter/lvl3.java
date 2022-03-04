/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classchapter;

import java.util.Random;

/**
 *
 * @author davinci
 */
public class lvl3 {
    private int generatedNumber3;
    private Random rn3;
    private int right3;
    private int wrong3;
    private int trialtime3;

    public int getTrialtime3() {
        return trialtime3;
    }

    public void setTrialtime3() {
        this.trialtime3++;
    }
    
    

    public int getRight3() {
        return right3;
    }

    public int getWrong3() {
        return wrong3;
    }

    
    public int generateNumber3(int gn3){
//        this.rn = new Random();
        generatedNumber3 = gn3;
        return generatedNumber3;
    }
    
    public boolean compareNumber3(int guessnumber3){
        if(this.generatedNumber3==guessnumber3){
            right3++;
            return generatedNumber3==guessnumber3;
        }else{
            wrong3++;
            return generatedNumber3==guessnumber3;
        }
    }   
}
