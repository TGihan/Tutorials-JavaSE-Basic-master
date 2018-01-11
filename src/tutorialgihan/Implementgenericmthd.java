/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

/**
 *
 * @author Dell
 */
public class Implementgenericmthd {
    public void display(){
    
    Integer[] iray={1,2,3,4,5,6};
    Character[] cray={'g','i','h','a','n'};
    
    printMe(iray);      //same method it is generic
    printMe(cray);
    }

    //generic method implementation //generic letter T we can overload all printme method by one implementation
    public static <T> void printMe(T[] x){
            for(T b : x )
    System.out.printf("%s ",b);
    System.out.println();
    }
}    

