/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

/**
 *
 * @author Dell
 */
public class Arrytble {
    public void arrytable(){
    
        System.out.println("Index\tValue"); //create table structure
        
        int gihan[]={34,45,67,89};
        
        for(int coun=0;coun<gihan.length;coun++){   //special in java length into loop boundary
        System.out.println(coun+"\t"+gihan[coun]);  //assign values into table
        }
    
    }
}
