/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.util.*;

//runable interface contain run() method
public class Threade implements Runnable{   //able to use thread
    String name;    
    int time;
    Random r=new Random();

    public Threade(String x){   //constructor get mainclass one two three four names

    name=x;     //name get
    time=r.nextInt(999);    //get random numbers from random
    
}
    @Override
    public void run(){        //must implement run method every thread
    //it must implement with exception handling
    try{    
    System.out.printf("%s us sleeping for %d\n",name,time); //name ..... randomnumber
    Thread.sleep(time);         //thread sleep
    System.out.printf("%s is done\n",name);     //done
    }catch(Exception e){
    
    }
    }
}
