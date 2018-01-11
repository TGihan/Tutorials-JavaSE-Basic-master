/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

/**
 *
 * @author Dell
 */
public class Statics {
    
    
        private String first;
        private String last;
        private static int member=0;    //static variable can be share any object but it cannot be change by user
        
        public Statics(String fn,String ln){        //this is constructor
         
            first=fn;
            last=ln;
            member++;
            System.out.printf("Constructor for %s %s,Members are club in: %d\n",first,last,member);
        
        } 
        public void fre(){  //this include void mathod
        System.out.println("hello");
        }
        public static int getmembers(){
        return member;  
        }
    
    }

