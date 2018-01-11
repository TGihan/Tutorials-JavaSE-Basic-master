/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.util.*;

public class Mthdreverscopy {
    public void display(){
    
        //create an array and convert to list
        Character[] ray={'p','w','h'};
        List<Character> list1=Arrays.asList(ray);
        System.out.println("List is : ");
        output(list1);
    
        //reverse and print out the list
        Collections.reverse(list1);
        System.out.println("After reverse :");
        output(list1);
        
        //create new array and a new list
        Character[] newarray=new Character[3];
        List<Character> listcopy=Arrays.asList(newarray);
        
        //copy contents of list into listcopy
        Collections.copy(listcopy, list1);
        System.out.println("copy of list : ");
        output(listcopy);
        
        //fill collection with crap
        Collections.fill(list1, 'x');
        System.out.println("After filling the list : ");
           
    }
    //output method
    private static void output(List<Character> thelist){
    
    for(Character thing : thelist)
        
        System.out.printf("%s ",thing);
        System.out.println();
    }
}
