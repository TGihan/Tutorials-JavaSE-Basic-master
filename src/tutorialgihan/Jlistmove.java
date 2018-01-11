/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Jlistmove extends JFrame{
    private JList leftlist;
    private JList rightlist;
    private JButton movebutton;
    private static String[] foods={"chiken","soya","friedrice","fish","orange"};
    
    public Jlistmove(){
    super("List item move");
    setLayout(new FlowLayout());
    
    leftlist=new JList(foods);
    leftlist.setVisibleRowCount(3);
    leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    add(new JScrollPane(leftlist));
    
    movebutton=new JButton("Move-->");
    movebutton.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
            rightlist.setListData(leftlist.getSelectedValues());
            
            }
            }
            
            
            );
    add(movebutton);
    
    rightlist=new JList();
    rightlist.setVisibleRowCount(3);
    rightlist.setFixedCellHeight(15);
    rightlist.setFixedCellWidth(100);
    rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    add(new JScrollPane(rightlist));
    }
}
