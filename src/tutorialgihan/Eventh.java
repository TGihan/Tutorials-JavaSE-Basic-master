/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;              //import all class to this class
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Eventh extends JFrame{     //include class everything into jframe
    private JTextField item1;           
    private JTextField item2;           //jframe variables as it type
    private JTextField item3;
    private JPasswordField pass;
    
    public Eventh(){        //constructor must have
    
    super("The title");     //jframe title
    setLayout(new FlowLayout());    //create flowlayout for jframe
    
    item1=new JTextField("Hello gihan i'm first label");        //set item1 
    add(item1);         //add item1 into flowlayout
    
    item2=new JTextField("Enter text here");        //set item2
    add(item2);     //add item2 into flowlayout
    
    item3=new JTextField("uneditable",20);      //set item3
    item3.setEditable(false);       //set it editable
    add(item3);     //add item3 into flowlayout
    
    pass=new JPasswordField("my password");     //set pass 
    add(pass);      //add pass variable into flowlayout
    
    thehandler hand=new thehandler();       //create class to acess actionlistner and name it hand 
    item1.addActionListener((ActionListener) hand);     //add item1 into actionlistner
    item2.addActionListener((ActionListener) hand);     //add item2 into actionlistner
    item3.addActionListener((ActionListener) hand);     //add item3 into actionlistner
    pass.addActionListener((ActionListener) hand);      //add pass into actionlistner
    }
    private class thehandler implements ActionListener{     //private class to acess actionlistner
        
        @Override
        public void actionPerformed(ActionEvent even){      //create a class for actionevent and pass value 
            String str="";
            if(even.getSource()==item1)         //check action enter where item2
                str=String.format("field 1: ",even.getActionCommand());             //item1 field enter
            else if(even.getSource()==item2)    //check action enter where item2
                str=String.format("field 2: ",even.getActionCommand());             //item2 field enter
            else if(even.getSource()==item3)    //check action enter where item2
                str=String.format("field 3: ",even.getActionCommand());             //item3 field enter 
            else if(even.getSource()==pass)     //check action enter where item2
                str=String.format("password field 1: ",even.getActionCommand());    //password field enter 
        
            JOptionPane.showMessageDialog(null, str);       //get str into msg box when field enter
        }
    }
    }

