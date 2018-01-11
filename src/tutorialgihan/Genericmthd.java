/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;



public class Genericmthd {
    
    public void display(){
    
    Integer[] iray={1,2,3,4};
    Character[] cray={'b','u','c','y'};
    
    printMe(iray);      //same method it is generic
    printMe(cray);
    }
    public static void printMe(Integer[] i){
    
    for(Integer x: i)
        System.out.printf("%s ", x);
    System.out.println();
    }
    public static void printMe(Character[] i){
    
    for(Character x: i)
        System.out.printf("%s ", x);
    System.out.println();
    }
}
