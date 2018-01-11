/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.util.*;
public class Convertlisttoarray {
    public void display(){
    
    String[] stuff={"babies","water","melon","fudge"};
    LinkedList<String> thelist=new LinkedList<String>(Arrays.asList(stuff));
    
    thelist.add("hello");   //add hello to array list
    thelist.addFirst("first thing");    //add first thing into array list index[0]
    
    //convert back to an array
    stuff=thelist.toArray(new String[thelist.size()]);
    for(String x: stuff)
        System.out.printf("%s ",x);
    }
}
