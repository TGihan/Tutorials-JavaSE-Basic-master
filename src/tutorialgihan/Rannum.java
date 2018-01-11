/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.util.Random;    //import random

public class Rannum {
    public void randomnumber(){
        
    Random dice=new Random();   //create new random gernerator
    
    int number;
    for(int coun=1;coun<10;coun++){ //number of random numbers
        number =dice.nextInt(6);    //random number boundary
    System.out.println(number+" ");
    }
    }
}
