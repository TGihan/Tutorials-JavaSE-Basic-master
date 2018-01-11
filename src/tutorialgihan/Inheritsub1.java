/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

/**
 *
 * @author Dell
 */
public class Inheritsub1 extends Inheritsuper {
    //extends is use to inherit from super class
    //now you can access anything in super class
    //otherwise we can inherit this class from inheritsub2 class as extends inheritsub2
    
    @Override
    public void eat(){  //this method is overiding eat method
    System.out.println("I am overide eat method ");
    }
}
