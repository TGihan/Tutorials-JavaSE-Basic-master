/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.io.*;
import java.lang.*;
import java.util.*;

public class Writefile {
private Formatter x;
    
    public void openFile(){
    try{
x=new Formatter("C:\\test\\srilanka.txt");
}
catch(Exception e){
System.out.println("You have an error");
}
}
    public void addRecords(){
    x.format("%s%s%s","20 ","gihan  ","herath");
    }
    
    public void closeFile(){
    x.close();
    }
}
