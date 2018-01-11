/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

/**
 *
 * @author Dell
 */
public class Encyption {
    public Encyption(){
    StringBuffer password=new StringBuffer("cock121992");
    
        System.out.println(password.charAt(0)); //in this encyp we use numeric value of each char
        System.out.println((int)password.charAt(0));//numeric value
    
        for(int i=0;i<password.length();i++){
    int temp=0;
    temp=(int)password.charAt(i);//now get numeric
    temp=temp*9;//crazy thing to encypt
    password.setCharAt(i, (char)temp);
    }
        System.out.println("The Encypt password "+password);
    }
    public static void main(String[] args) {
        new Encyption();
    }
}
