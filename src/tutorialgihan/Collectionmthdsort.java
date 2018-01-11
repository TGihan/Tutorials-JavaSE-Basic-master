/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.util.*;


/**
 *
 * @author Dell
 */
public class Collectionmthdsort {
    public void display(){
    
        String[] crap={"apples","lemmons","bacon","youtube"};
        List<String> l1=Arrays.asList(crap);
        
        Collections.sort(l1);
        System.out.printf("%s\n", l1);
        
        Collections.sort(l1,Collections.reverseOrder());
        System.out.printf("%s\n", l1);
    }
}
