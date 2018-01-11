/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.util.*;

public class Linklist {
    
    public void display(){
   
    String[] things={"apple","noobs","bacon","pong"};   //create string array name it thing
    List<String> list1=new LinkedList<String>();    //create linked list and give to it thing name list1
    for(String x: things)       //start [0] and end things last 
    list1.add(x);   //add string values to list
    
    String[] things1={"Sausage","bacon","goats","harrypoter"};      //create another list same to above
    List<String> list2=new LinkedList<String>();
    for(String y: things1)
    list2.add(y);
    
    list1.addAll(list2);        //list2 all values add to list1
    list2=null;     //list2 now empty
    
    printMe(list1);     //list1 print
    removeStuff(list1,2,5);     //remove index 2 and 5 pass 2 5 values to from and to
    printMe(list1);     //changed list1 print
    reverseMe(list1);   //reverse list1 index

    }
//printme method
private static void printMe(List<String> l){    //as argument list
for(String b: l)    //array to end
System.out.printf("%s ",b);
System.out.println();
}

//remove stuff method
private static void removeStuff(List<String> l,int from, int to){   //get list1 and 2 5
l.subList(from, to).clear();    //sublist special create in java 2 to 5 index clear
}

//reverse me method
private static void reverseMe(List<String> l){
ListIterator<String> gihan=l.listIterator(l.size());    //get list1 as iterator name it gihan
while(gihan.hasPrevious())      //revers by using has previous
System.out.printf("%s ",gihan.previous());
}

}



