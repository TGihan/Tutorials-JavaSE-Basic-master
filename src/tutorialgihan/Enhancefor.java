/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

/**
 *
 * @author Dell
 */
public class Enhancefor {
    public void enhanfor(){
    
    int gihan[]={3,4,5,6,2};
    int tot=0;
    
    for(int x:gihan){   //enhanced for loop type variable : name of array
    tot+=x; //get total of x
    }
    System.out.println(tot+"\n");
    }
}
