/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

/**
 *
 * @author Dell
 */
public class Timecls {
    
    public void display(){  //display work
     
     settimewithoutargs();  /*call method by default values 14 23 54 this line must first call 
      * because when second method calling settime method call*/ 
     settimeclawithargs();
     
    
    }
    private int hour=14;
    private int minute=23;
    private int second=54;
    
    public void settimeclawithargs(){   //method with arguments pass to reference
        
            settime(13,5,6);   //call settime method with arguments
            System.out.println("\n"+toformat());    //call toformat method and print
            System.out.println("\n"+tostring());
        
    }
    public void  settimewithoutargs(){  //method without arguments default value print
        
        
        System.out.println("\n"+toformat());    //call toformat method and print
        System.out.println("\n"+tostring());
    
    }
    public void settime(int h,int m,int s){
    hour=((h>=0 && h<24) ? h : 0);  //set range
    minute=((m>=0 && m<60) ? m : 0);
    second=((s>=0 && s<60) ? s : 0);
    }
    
        
    public String toformat(){
        
    return String.format("%02d:%02d:%02d",hour,minute,second);  //set format and return
    
    }
    
    public String tostring(){
    
        return String.format("%02d:%02d:%02d %s",((hour==0 ||hour==12)?12:hour%12),minute,second,(hour<12?"AM":"PM"));  
    //abobe line we( ? )use to check condition and if ok
    //             ( : ) use to ifnot
    }
    
}
