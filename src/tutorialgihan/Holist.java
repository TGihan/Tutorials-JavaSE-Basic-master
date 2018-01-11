/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

/**
 *
 * @author Dell
 */
public class Holist {
    private Hoani[] thelist=new Hoani[5];   //create array name thelist extend hoani class
    private int i=0;
    
    public void add(Hoani c){   //create method with argument this arg use for get object
    if(i<thelist.length){   //array lengh
    thelist[i]=c;
    System.out.println("\nAnimal is added to index "+i);
    i++;
    }
    
    }

    
}
