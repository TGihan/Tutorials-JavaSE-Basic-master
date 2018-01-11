/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.io.File;

public class Fileclass {
    public void display(){
    
        File x=new File("C:\\test\\test.txt");
       if(x.exists())
           System.out.println(x.getName()+" exist");
       else
           System.out.println(" does not exist");
    }
}
