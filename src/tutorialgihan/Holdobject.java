/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

/**
 *
 * @author Dell
 */
public class Holdobject {

    public void displaylist(){
    Holist hobj=new Holist();   //create onject to holist
    Hodog d=new Hodog();    //create object within hodog
    Hofish f=new Hofish();  //create object within hofish
    hobj.add(d);    //holist add method with hodog object as argumaent
    hobj.add(f);    //holist add method with hodog object as argumaent
    
    
    }
}
