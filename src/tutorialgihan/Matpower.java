/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

/**
 *
 * @author Dell
 */
public class Matpower {
    public void mathpower(){
    double amount;
    double principle=10000;
    double rate=.01;
    
    for(int day=1;day<5;day++){
    amount=principle*Math.pow(1+rate,day);  //A=P(1+R)^n equation using(Math is directly can be use)
    System.out.println(day+"  "+amount);
    }
    
    }
}
