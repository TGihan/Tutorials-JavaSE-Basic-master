/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

/**
 *
 * @author Dell
 */
public class Holdobjectp {
    
    public void displayhop(){
        
    Holdobjpani[] thelistp=new Holdobjpani[2];
    Holdobpdog r=new Holdobpdog();
    Holdobpfish e=new Holdobpfish();
    
    thelistp[0]=r;
    thelistp[1]=e;
    
    for(Holdobjpani z: thelistp){  //this is very important we can call method for all object from loop
    z.noise();
}  
}
}
