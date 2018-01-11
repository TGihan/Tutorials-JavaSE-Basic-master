/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

/**
 *
 * @author Dell
 */
public class Recur {
    public void display(){
    
    System.out.println(fact(5));
    }
    public static long fact(long n){
    
        if(n<=1)
            return 1;
        else
            return n * fact(n-1);
    }
    }

