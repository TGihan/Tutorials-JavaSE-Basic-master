/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

/**
 *
 * @author Dell
 */
public class Multiarray {
    public void mulary(){
    int firstary[][]={{23,45,67,89},{56,43,32,12,56}};  //create array row 2 max-column 5
                     //00 01 02 03   10 11 12 13 14
    
    int secondary[][]={{32,34,56,87},{77},{98,69,41}};  //create array row 3 max -column 4
                      //00 01 02 03   10   20 21 22
       
            System.out.println("\nThis is first array\n");  //print first array
            display(firstary);  //call first array
            
            System.out.println();   //line break
            
            System.out.println("This is second array\n"); //print second array
            display(secondary); //call second array
            
    }
    public void display(int x[][]){     //get first or second array to x[][]
    for(int row=0;row<x.length;row++){  //find number of {} {} {} and assign to number of row
    for(int column=0;column<x[row].length;column++){    //find no of elements in one row and assign to columns 
    System.out.print(x[row][column]+"\t");
    }
    System.out.println();
    }    
    }
}
