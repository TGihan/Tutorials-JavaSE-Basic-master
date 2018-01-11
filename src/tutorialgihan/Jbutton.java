/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jbutton extends JFrame {
    
    private JButton reg;
    private JButton about;
    private JButton exit;
    private JLabel gi;
    
    public Jbutton(){
    super("Hello Welcome");
    setLayout(new FlowLayout());
    
    reg=new JButton("Register");
    about=new JButton("About");
    exit=new JButton("Exit");
    gi=new JLabel("Hello Gihan");
    add(reg);
    add(about);
    add(exit);
    add(gi);
    }
}
