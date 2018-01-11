/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;     //new import

public class Jlistbox extends JFrame {
    private JList list;
    private static String[] colornames={"black","blue","red","white"};  //create array for colornames
    private static Color[] color={Color.BLACK,Color.BLUE,Color.RED,Color.WHITE};    //get special color class as array and assign above colors
    
    public Jlistbox(){
    super("Hello Listbox");
    setLayout(new FlowLayout());
    
    list=new JList(colornames);     //create new list and assign colornames array to it
    list.setVisibleRowCount(4);     //visible row count
    list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);     //listbox selection one time one
    add(new JScrollPane(list));     //create new scrollpane and assign it to istbox and show it in jframe
    
    list.addListSelectionListener(      //create listner for listbox
            new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent event){     //create class for listbox value change and pass event as argument
            getContentPane().setBackground(color[list.getSelectedIndex()]);     //according to selection background color changing
            
            }
            }
            
            );
    
    
    
    }
}
