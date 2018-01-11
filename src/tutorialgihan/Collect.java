/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.util.*;

public class Collect {
    public void display(){
    
    String[] things={"eggs","lasers","hats","pie"};     //create string array
    List<String> list1=new ArrayList<String>(); //create new arraylist and give it to string array
    
    //add array items to list
    for(String x: things)   //string index[0] to last loop
        list1.add(x);   //add items to list1
    
    String[]  morethings={"lasers","hats"};     //same to above
    List<String> list2=new ArrayList<String>();
    
    //add array items to list
    for(String y: morethings)
        list2.add(y);
    
    for(int i=0;i<list1.size();i++){        //display list1 items 
    System.out.printf("%s ",list1.get(i));
    }
    
    editlist(list1,list2);      //method calling : list1 and list2 items pass to method
    System.out.println();   //line print
    
    //print out list 1
    for(int i=0;i<list1.size();i++){
    System.out.printf("%s ",list1.get(i));
    
    }
    }
    public static void editlist(Collection<String> l1, Collection<String> l2){  //special collection get list1 and list2 by calling
        Iterator<String> it =l1.iterator();     //iterator string name it
        while(it.hasNext()){    //iterate to by one remove
        if(l2.contains(it.next()))
            it.remove();
        }
    }
}
