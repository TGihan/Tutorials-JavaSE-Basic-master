/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;



public class Genericreturn {
    
    public void display(){
        
    System.out.println(max(23,42,1));
    }
    
    public static <T extends Comparable<T>> T max(T a,T b, T c){    //generic method pass 3 variables a,b,c  they get now
    T m = a;
    if(b.compareTo(a)>0)    //compare b>a
        m=b;        //max=b
    if(c.compareTo(m)>0)    //compare c>m
        m=c;    //max=c
   
    return m;   //return generic max
   
    }
}
