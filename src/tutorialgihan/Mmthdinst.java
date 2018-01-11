/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

/**
 *
 * @author Dell
 */
public class Mmthdinst {
    private String girlname;    //create private srting
    public void setname(String name){   //void=not do
    girlname=name;  //private string equally to public name
    }
    
    public String getname(){    //public return string not void
    return girlname;    //return girlname
    }
    
    public void sayname(){  //public last void 
    System.out.printf("Your first girl friend name was %s\n",getname());  //set string to call getname method
    }
}
