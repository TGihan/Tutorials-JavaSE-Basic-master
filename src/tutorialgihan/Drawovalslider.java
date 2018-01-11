/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.awt.*;
import javax.swing.*;

public class Drawovalslider extends JPanel{
    
    private int d=10;
    @Override
    public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.fillOval(10, 10, d, d);
    }
    public void setD(int newD){
    
    d=(newD >=0 ? newD : 10);
    repaint();
    }
    @Override
    public Dimension getPreferredSize(){
    return new Dimension(200,200);
    }
    @Override
    public Dimension getMinimumSize(){
    return getPreferredSize();
    }
}
