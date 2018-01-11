/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Userin {
    public void userinput(){
    Scanner giho = new Scanner(System.in);
        double fnum,snum,ans;
        System.out.println("Enter first number ");
        fnum = giho.nextDouble();
        System.out.println("Enter second number "); 
        snum=giho.nextDouble();
        System.out.println("Answer is ");
        ans=fnum+snum;
        System.out.println(ans);
}
}
