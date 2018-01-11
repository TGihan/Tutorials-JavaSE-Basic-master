/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.io.*;
import java.util.*;

public class Readfile {
    private Scanner x;
    
    public void openFile(){
    
        try{
        x=new Scanner(new File("C:\\test\\srilanka.txt"));
        }catch(Exception e){
        System.out.println(e.getMessage());
        }
    }
    public void readFile(){
    while(x.hasNext()){
    String a=x.next();
    String b=x.next();
    String c=x.next();
    
    System.out.printf("%s %s %s",a,b,c);
    }
    }
    public void closeFile(){
    x.close();
    }
          
}
