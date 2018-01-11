/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

/**
 *
 * @author Dell
 */
public class Tokenize {
    public static void main(String[] args) {
        String mystr="Tharindu Gihan ";
        String space=" ";
        String[] words=mystr.split(space);
        
        System.out.println("mystr");
        
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }
    }
}
