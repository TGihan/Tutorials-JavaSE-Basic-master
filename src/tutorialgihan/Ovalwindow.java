/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ovalwindow extends JFrame{
    
    private JSlider slider;
    private Drawovalslider mypanel;
    
    public Ovalwindow(){
    
    super("The oval Slider");
    mypanel=new Drawovalslider();
    mypanel.setBackground(Color.ORANGE);
    
    slider=new JSlider(SwingConstants.HORIZONTAL,0,200,10);
    slider.setMajorTickSpacing(10);
    slider.setPaintTicks(true);
    
    slider.addChangeListener(
            new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e){
            mypanel.setD(slider.getValue());
            }
            }
            
            );
    add(slider,BorderLayout.SOUTH);
    add(mypanel,BorderLayout.CENTER);
    }
}
