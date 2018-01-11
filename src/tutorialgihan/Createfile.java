/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.util.*;

public class Createfile {
public void dislay(){

    final Formatter x;
    
    try{
    x=new Formatter("C:\\test\\fred.txt");
    System.out.println("Created Sucessed");
    }catch(Exception e){
    System.out.println("Create not Sucessed");
    
    }
}    
}
