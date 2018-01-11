/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.util.Scanner;

public class Simpaverage {
    public void simpleaverage(){
        
    Scanner input=new Scanner(System.in);   //create new scanner for get input
        
    int tot=0;  //variables
    int coun=0; //create counter
    int mark;
    int avg;
    
    while(coun<5){ //loop for counter
    mark=input.nextInt();   //input set to mark
    tot=tot+mark;   //summation of all marks
    coun++; //counter incresed
    }
    avg=tot/10; 
    System.out.printf("Average is "+avg+"\n");
    }
}
