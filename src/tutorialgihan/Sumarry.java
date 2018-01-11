/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

/**
 *
 * @author Dell
 */
public class Sumarry {
    public void sumary(){
    
        int gihan[]={2,3,5,6,7,2};
        int sum=0;
        
        for(int coun=0;coun<gihan.length;coun++){
        sum+=gihan[coun];   //sum array indexes
        }
        System.out.println("The summation of array is "+sum);
    
    }
}
