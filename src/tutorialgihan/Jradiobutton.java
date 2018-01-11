/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Jradiobutton extends JFrame{
    
    private JRadioButton rb1;
    private JRadioButton rb2;
    private JRadioButton rb3;
    private ButtonGroup group;      //create button group and name it
    private Font txt1;
    private Font txt2;
    private Font txt3;
    private JTextField tf;
    
    public Jradiobutton(){      //create constructor
    super("Hello Radio button");
    setLayout(new FlowLayout());
    
    rb1=new JRadioButton("Plain",true);      //radio button has two name and state
    rb2=new JRadioButton("Bold",false);
    rb3=new JRadioButton("Italic",false);
    tf=new JTextField("Hello radio buttons");
    
    add(rb1);
    add(rb2);
    add(rb3);
    add(tf);
    
    group=new ButtonGroup();    //create button group
    group.add(rb1);     //addbuttons to group
    group.add(rb2);
    group.add(rb3);
    
    txt1=new Font("segui ui",Font.PLAIN,14);
    txt2=new Font("segui ui",Font.BOLD,14);
    txt3=new Font("segui ui",Font.ITALIC,14);
    tf.setFont(txt1);  //textfield text assign to plain style 
    
    //wait for event happen, pass in font object to constructor
    rb1.addItemListener(new HandlerClass(txt1));        //create listner for radio buttons
    rb2.addItemListener(new HandlerClass(txt2));        //we want create handlerclass and we want to give  change object
    rb3.addItemListener(new HandlerClass(txt3));        //according to listner
    }
    private class HandlerClass implements ItemListener{     //implement handlerclass
    private Font font;
    
    //the font object get variable font
    public HandlerClass(Font f){
    font=f;
    }
    
    //sets the font to the font object that was passed in
    public void itemStateChanged(ItemEvent event){
    tf.setFont(font);
    }
    
    }
    }

