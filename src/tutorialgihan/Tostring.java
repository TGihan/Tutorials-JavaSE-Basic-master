/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

/**
 *
 * @author Dell
 */
public class Tostring {
    private int month;
    private int day;
    private int year;
    
   //no any word after public in constructor
    public Tostring(int m,int d,int y){ 
    
        month=m;
        day=d;
        year=y;
    
        System.out.printf("The constructor for this is: ",this);
    }
    
    public String toformat(){
    
        return String.format("%d/%d/%d",month,day,year);
    
    }
}
