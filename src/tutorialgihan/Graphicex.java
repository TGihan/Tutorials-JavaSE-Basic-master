/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.awt.*;
import javax.swing.*;

public class Graphicex extends JPanel{
    
    @Override
    public void paintComponent(Graphics g) {
    super.paintComponent(g);
    this.setBackground(Color.green);
    
    g.setColor(Color.red);
    g.fillOval(50, 50, 100, 100);
    
    g.setColor(Color.orange);
    g.fillRect(25, 25, 100, 30);
    
    g.setColor(Color.WHITE);
    g.drawString("Hello Gihan Welcome to Java Graphics", 25, 100);
    }
}
