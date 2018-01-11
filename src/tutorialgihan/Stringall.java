/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

/**
 *
 * @author Dell
 */
public class Stringall {
    
    public void display(){
    //To upper or etc
    String d="gihan";
    
    System.out.println(d.toUpperCase());
    
    //replace string char
    String a="oracle";
    
    System.out.println(a.replace('o','m'));
    
    //start with
    String[] nam={"funk","bargo","furry","chego"};
    
    for(String w: nam){
    if(w.startsWith("fu"))
        System.out.println(w+" Start with fu");
    
    }
    
    //find index of string array
    String giho="helrlogihanhowareyou";

    System.out.println(giho.indexOf('r'));  //find index 
    System.out.println(giho.indexOf('r',5));  //find index and start with index 5
    
    //string adder
    String c="hello";
    String e="World";
    
    System.out.println(c+e);
    
    String r="              indrani               ";
    System.out.println(r.trim());   //leave spaces from string
    
    }
}
