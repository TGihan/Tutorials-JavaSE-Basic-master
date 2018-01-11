/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.util.*;

public class Queuee {
public void display(){

    PriorityQueue<String> q = new PriorityQueue<>();
    
    q.offer("First");   //high priority
    q.offer("Second");  //medium priority
    q.offer("Third");   //low priority
    
    System.out.printf("%s ",q);
    System.out.println();
    
    System.out.printf("%s ",q.peek());  //highest priority check
    System.out.println();
    
    q.poll();   //highest priori not take
    System.out.printf("%s ",q);
    

}    
}
