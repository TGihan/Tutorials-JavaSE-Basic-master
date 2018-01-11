/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

/**
 *
 * @author Dell
 */
public  class Ovloconst {
    
    private int hour;   //declare variables
    private int minute;
    private int second;
    
    
    
    public Ovloconst(){     //default constructor 
    this(0,0,0);    //this keyword is mention this method
    }
    
    public Ovloconst(int h){    //constuctor 1
    this(h,0,0);    
    }
    
    public Ovloconst(int h,int m){  //constructor 2
    this(h,m,0);    
    }
    
    public Ovloconst(int h,int m,int s){    //constructor 3
    settime(h,m,s);    //call settime final method
    }
    
    public final void settime(int h,int m,int s){
        sethour(h); 
        setminute(m);
        setsecond(s);  
    }
    public void sethour(int h){ //validity check for hour
    hour=((h>=0 && h<24)?h:0);
    }
    
    public void setminute(int m){   //validity check for minutes
    minute=((m>=0 && m<60)?m:0);
    }
    
    public void setsecond(int s){      //validity check for seconds
    second=((s>=0 && s<60)?s:0);
    }
    
    public int gethour(){       //above hour get and return to (toformat) method
    return hour;
    }
    
    public int getminute(){     //above minutes get and return to (toformat) method
    return minute;
    }
    
    public int getsecond(){     //above seconds get and return to (toformat) method
    return second;
    }
    
    public String toformat(){   //get returned values from gethour,getminute,getsecond and format it
    
    return String.format("%02d:%02d:%02d",gethour(),getminute(),getsecond());
    }
}