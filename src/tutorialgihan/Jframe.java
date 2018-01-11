/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.awt.FlowLayout; 
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jframe extends JFrame{     //inherit this class all thing to jframe

    private JLabel item1;   //declare variable as jlabel
    
    public Jframe(){    //constructor must have 
    
        super("The Title bar");     //set title bar name
        setLayout(new FlowLayout());    //create new flow layout
        
        item1=new JLabel("This is a sentence");     //set our item variable 
        item1.setToolTipText("This is gihan first coding frame");   //set tooltip
        item1.setFont(new java.awt.Font("Segui UI", 0, 48)); // NOI18N
        add(item1);     //add this item1 to our flow layout this is important
    }
}
