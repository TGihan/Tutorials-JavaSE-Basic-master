/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

/**
 *
 * @author Dell
 */
public class StringBuff {
    public static void main(String[] args) {
        StringBuffer buff=new StringBuffer("Tharindu Gihan");
        System.out.println("The String is "+buff);
        buff.setCharAt(8, '-');
        System.out.println("The String now "+buff);
    }
}
