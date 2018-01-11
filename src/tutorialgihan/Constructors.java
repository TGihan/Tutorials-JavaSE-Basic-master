/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

/**
 *
 * @author Dell
 */
public class Constructors {
    private String girlname;    //create private srting
    
    
    public Constructors(String name){   //this is constructor class name= method name
    girlname=name;
    }
    
   public String getname(){    //public return string not void
    return girlname;    //return girlname
    }
    
    public void sayname(){  //public last void 
    System.out.printf("Your first girl friend name was %s\n",getname());  //set string to call getname method
    }
}
