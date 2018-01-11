/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Flowlayout extends JFrame{
    
    private JButton lb;
    private JButton cb;
    private JButton rb;
    private FlowLayout lay;
    private Container contain;
    
    public Flowlayout(){
    super("Flow layout");
    lay=new FlowLayout();
    contain=getContentPane();
    setLayout(lay);
    
    //left button
    lb=new JButton("Left");
    add(lb);
    lb.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
            lay.setAlignment(FlowLayout.LEFT);
            lay.layoutContainer(contain);
            }
            }
            );
    //left button
    cb=new JButton("Center");
    add(cb);
    cb.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
            lay.setAlignment(FlowLayout.CENTER);
            lay.layoutContainer(contain);
            }
            }
            );
    //left button
    rb=new JButton("Right");
    add(rb);
    rb.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
            lay.setAlignment(FlowLayout.RIGHT);
            lay.layoutContainer(contain);
            }
            }
            );
    
    }
}
