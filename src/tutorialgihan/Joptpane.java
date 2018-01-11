/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import javax.swing.JOptionPane;     //import special class joptionpane

public class Joptpane {
    
public void startoption(){
    String fn=JOptionPane.showInputDialog("Enter first number");    //get string variable and equal to entered value from joption input dialog
    String sn=JOptionPane.showInputDialog("Enter second number");
   
    int num1=Integer.parseInt(fn);
    int num2=Integer.parseInt(sn);
    
    int sum=num1+num2;
        
    JOptionPane.showMessageDialog(null,"The answer is " +sum,"The anser",JOptionPane.PLAIN_MESSAGE);    //joption msg equal to atring answer
    }
    
}


