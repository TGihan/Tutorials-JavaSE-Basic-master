/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.util.*;

public class Addall {

    public void display(){

    String[] stuff={"apples","beef","corn","ham"};
    List<String> list1=Arrays.asList(stuff);

    ArrayList<String> list2=new ArrayList<String>();
    list2.add("youtube");
    list2.add("google");
    list2.add("oracle");
    
    for(String x: list2)
        System.out.printf("%s ",x);
    
    Collections.addAll(list2, stuff);
    System.out.println();
    for(String x: list2)
        System.out.printf("%s ",x);
}    
}
