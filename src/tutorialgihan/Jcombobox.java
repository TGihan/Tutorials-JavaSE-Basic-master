/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Jcombobox extends JFrame {
    private JComboBox box;
    private JLabel picture;     //in java picture get by label

private static String[] filename={"a.png","b.png"};     //create string array for pictures
private Icon[] pics={new ImageIcon(getClass().getResource(filename[0])),new ImageIcon(getClass().getResource(filename[1]))};

public Jcombobox(){

super("The Combo box");
setLayout(new FlowLayout());

box=new JComboBox(filename);

box.addItemListener(        //create listener for combo box
        new ItemListener(){
        @Override
        public void itemStateChanged(ItemEvent event){      //when item change pass parameter 
        if(event.getStateChange()==ItemEvent.SELECTED)      //select event
        picture.setIcon(pics[box.getSelectedIndex()]);      //picture array set to box selected array number
            }
        }
        );
add(box);
picture=new JLabel(pics[0]);        //default picture
add(picture);
}
}
