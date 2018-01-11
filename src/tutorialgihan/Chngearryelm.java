/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

/**
 *
 * @author Dell
 */
public class Chngearryelm {
    
    public void change(){
    
        int gihan[]={3,4,2,5};  //set element before change
        changea(gihan);     //call changea method 
        
        for(int y:gihan)    //create loop for print after change gihan array
            System.out.println(y);
    }
    public void changea(int x[]){   //change array - get gihan elements for x[]
    
    for(int coun=0;coun<x.length;coun++)    //go gihan last element
    x[coun]+=5;     //gihan array one by one element increment by 5 
    
    }
}

