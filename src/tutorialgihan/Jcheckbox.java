/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Jcheckbox extends JFrame{
    
    private JTextField text1;
    private JCheckBox chbox1;
    private JCheckBox chbox2;
    private JButton ex;

    public Jcheckbox(){    
super("Hello JCheckbox");
setLayout(new FlowLayout());

text1=new JTextField("Hello ");
text1.setFont(new Font("segui ui",Font.PLAIN,13));
add(text1);
chbox1=new JCheckBox("Bold");
chbox2=new JCheckBox("Italic");
add(chbox1);
add(chbox2);
ex=new JButton("Exit");
add(ex);

HandlerClass handler=new HandlerClass();    
chbox1.addItemListener(handler);    //create listner for checkboxes
chbox2.addItemListener(handler);    //we want create handlerclass and we want to give  change object
                                    //according to listner

}
private class HandlerClass implements ItemListener{     //implement handlerclass
@Override
public void itemStateChanged(ItemEvent event){

Font font=null; 

if(chbox1.isSelected() && chbox2.isSelected())
    font=new Font("segui ui",Font.BOLD+Font.ITALIC,14);
else if(chbox1.isSelected())
    font=new Font("segui ui",Font.BOLD,14);
else if(chbox2.isSelected())
    font=new Font("segui ui",Font.ITALIC,14);
else
    font=new Font("segui ui",Font.PLAIN,14);
text1.setFont(font);
}
}
}

