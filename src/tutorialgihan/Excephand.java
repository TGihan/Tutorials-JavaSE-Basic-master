/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.util.*;

public class Excephand {
    
    public void display(){
        int c=1;
        do{
        Scanner input=new Scanner(System.in);
        try{
        System.out.println("Enter first num");
        int x=input.nextInt();
        System.out.println("Enter second num");
        int y=input.nextInt();
        int sum=x/y;
        System.out.println(sum);
        c=2;
        }
        catch(Exception e){
        System.out.println("you cant do that");
        }
        }while(c==1);   //this loop use for follow user become correct
    }
}
