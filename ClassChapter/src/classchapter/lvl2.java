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
public class lvl2 {
    
    private int generatedNumber2;
    private Random rn2;
    private int right2;
    private int wrong2;
    private int trialtime2;

    public int getTrialtime2() {
        return trialtime2;
    }

    public void setTrialtime2() {
        this.trialtime2++;
    }
    
    

    public int getRight2() {
        return right2;
    }

    public int getWrong2() {
        return wrong2;
    }

    
    public int generateNumber2(int gn2){
//        this.rn = new Random();
        generatedNumber2 = gn2;
        return generatedNumber2;
    }
    
    public boolean compareNumber2(int guessnumber2){
        if(this.generatedNumber2==guessnumber2){
            right2++;
            return generatedNumber2==guessnumber2;
        }else{
            wrong2++;
            return generatedNumber2==guessnumber2;
        }
    }   
}

