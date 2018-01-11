/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mouseevent extends JFrame {
    private JPanel mousepanel;
    private JLabel status;
    
    public Mouseevent(){
    super("Mouse Event Handling");
    
    
    mousepanel=new JPanel();
    mousepanel.setBackground(Color.white);
    add(mousepanel,BorderLayout.CENTER);
    
    status=new JLabel("Default");
    add(status,BorderLayout.SOUTH);
    
    HandlerClass handler=new HandlerClass();
    mousepanel.addMouseListener((MouseListener) handler);
    mousepanel.addMouseMotionListener(handler);
    }
    private class HandlerClass implements MouseListener,MouseMotionListener{
    @Override
    public void mouseClicked(MouseEvent event){
    status.setText(String.format("Clicked at %d %d",event.getX(),event.getY()));
    
    }
    @Override
    public void mousePressed(MouseEvent event){
    status.setText("You pressed down the  mouse");
    }
    @Override
    public void mouseReleased(MouseEvent event){
    status.setText("You released the  mouse");
    }
    @Override
    public void mouseEntered(MouseEvent event){
    status.setText("you entred the area");
    mousepanel.setBackground(Color.red);
    }
    @Override
    public void mouseExited(MouseEvent event){
    status.setText("The mous has left the window");
    mousepanel.setBackground(Color.white);
    }
    
    //these are mouse motion listener
    
    @Override
  public void mouseDragged(MouseEvent event){
  status.setText("You are dragging the mouse");
  }
    @Override
  public void mouseMoved(MouseEvent event){
  status.setText("You moved the mouse");
  }
    }
}
    