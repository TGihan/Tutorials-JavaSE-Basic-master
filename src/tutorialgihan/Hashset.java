/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.util.*;

public class Hashset {
    
    public void display(){
        
    String[] things={"apple","bob","ham","bob","bacon"};    //duplicate index here that is bob
    List<String> list=Arrays.asList(things);
    
    System.out.printf("%s ", list);     //first print before find duplicate
    System.out.println();
    
    Set<String> set=new HashSet<>(list);    //duplicate indexes cut
    System.out.printf("%s ", set);
    
    }
}
